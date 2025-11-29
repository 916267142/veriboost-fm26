package org.batfish.minesweeper.prune.experiment;

import org.batfish.common.NetworkSnapshot;
import org.batfish.common.bdd.BDDPacket;
import org.batfish.common.plugin.IBatfish;
import org.batfish.datamodel.Configuration;
import org.batfish.datamodel.answers.AnswerElement;
import org.batfish.minesweeper.Graph;
import org.batfish.minesweeper.answers.SmtOneAnswerElement;
import org.batfish.minesweeper.answers.SmtReachabilityAnswerElement;
import org.batfish.minesweeper.prune.question.SmtBenchmarkPropertiesQuestionPlugin;
import org.batfish.minesweeper.prune.util.ExperimentTools;
import org.batfish.minesweeper.question.HeaderLocationQuestion;
import org.batfish.minesweeper.smt.PropertyChecker;
import org.batfish.minesweeper.smt.VerificationResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BenchmarkPropertiesExperiment extends ExperimentTools {
    IBatfish _batfish;

    public BenchmarkPropertiesExperiment() {
        super();
    }

    // The main logic of running benchmark experiments.
    public void run(IBatfish batfish, HeaderLocationQuestion q, NetworkSnapshot snapshot) {

        // Get batfish vendor-independent
        this._batfish = batfish;
        Graph graph = new Graph(_batfish, snapshot);
        Map<String, Configuration> configurations = graph.getConfigurations();

        // Write the explain head of the results table
        boolean is_write_head_reachability = false;
        boolean is_write_head_waypoints = false;
        boolean is_write_head_loadbalancing = false;
        boolean is_write_head_bound = false;

        // The type of properties need to be verified
        List<String> property_types = new ArrayList<>();
        property_types.add("reachability");
        property_types.add("waypoint");
        property_types.add("loadbalancing");
        // property_types.add("bound");

        // Read the node pairs to generate property
        String topology = ((SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q).getTopologyPath();
        List<String[]> node_pairs = readTopology(topology);

        // Read the number of properties need to be verified, we will choose number k for each properties.
        // If one type of tolerance properties does not have k, we will use k=0 to fill it.
        int number_property_threshold = ((SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q).getNumber();
        int number_property_total = 0;
        int[] number_property_each_tolerance = new int[4];

        for (String[] node_pair : node_pairs) {
            String src_node = node_pair[1];
            String dst_node = node_pair[2];
            if (src_node.equals(dst_node)) continue;

            int tolerance = Integer.parseInt(node_pair[0]);
            if(number_property_each_tolerance[3] >= number_property_threshold && tolerance == 3) continue;
            if(number_property_each_tolerance[2] >= number_property_threshold && tolerance == 2) continue;
            if(number_property_each_tolerance[1] >= number_property_threshold && tolerance == 1) continue;
            if(number_property_total++ >= (number_property_threshold * 4)) break;
            number_property_each_tolerance[tolerance]++;

            // We find the dst port name with the order by GE, E, FE.
            // Actually, here need to calculate the edge ports, but we directly set for simplicity.
            Configuration dst_node_config = configurations.get(dst_node);
            String dst_port_name = getPortName(dst_node_config);

            q.getHeaderSpace().resetDstIps();
            q.setFinalIfaceRegex(dst_port_name);
            q.setIngressNodeRegex(src_node);
            q.setFinalNodeRegex(dst_node);

            // The following parameters are for netsmt, it will identify wan and dcn.
            ((SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q).setProptype("0");

            // we set guided and reduction as the same, and ospf protocol cannot apply reduction optimization
            boolean guided = ((SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q).getGuided();
            if(!topology.contains("ospf")) {
                ((SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q).setReduction(guided);
            } else {
                ((SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q).setReduction(false);
            }

            if(property_types.contains("reachability")) {
                for(int i = 1; i <= 3; ++i) {
                    System.out.println("\n---------- begin pair: ("+src_node+","+dst_node+","+i+") ----------");
                    q.setFailures(i);
                    verifyProperty(snapshot, q, is_write_head_reachability, "reachability");
                    if (!is_write_head_reachability) is_write_head_reachability = true;
                }
            }

            if(property_types.contains("waypoint")) {
                for(int i = 1; i <= 3; ++i) {
                    System.out.println("\n---------- begin pair: ("+src_node+","+dst_node+","+i+") ----------");
                    q.setFailures(i);
                    verifyProperty(snapshot, q, is_write_head_waypoints, "waypoint");
                    if (!is_write_head_waypoints) is_write_head_waypoints = true;
                }
            }

            if(property_types.contains("loadbalancing")) {
                for(int i = 1; i <= 3; ++i) {
                    System.out.println("\n---------- begin pair: ("+src_node+","+dst_node+","+i+") ----------");
                    q.setFailures(i);
                    verifyProperty(snapshot, q, is_write_head_loadbalancing, "loadbalancing");
                    if (!is_write_head_loadbalancing) is_write_head_loadbalancing = true;
                }
            }

            if(property_types.contains("bound")) {
                for(int i = 1; i <= 3; ++i) {
                    System.out.println("\n---------- begin pair: ("+src_node+","+dst_node+","+i+") ----------");
                    q.setFailures(i);
                    verifyProperty(snapshot, q, is_write_head_bound, "bound");
                    if (!is_write_head_bound) is_write_head_bound = true;
                }
            }
        }

        writeActualSummary(q, "properties");
        writeEstimateSummary(q, "properties");
        writeVeriBoostSummary(q, "properties");
    }

    public void verifyProperty(NetworkSnapshot snapshot, HeaderLocationQuestion q, boolean isWriteHead, String prop){

        String file_path = getFilePath("results.txt", q, prop);
        if(!isWriteHead) writeHead(file_path);
        PropertyChecker p = new PropertyChecker(new BDDPacket(), _batfish);
        p.veriboost_type = true;
        VerificationResult res;

        long time_verification = System.currentTimeMillis();

        switch (prop) {
            case "reachability":
                res = ((SmtReachabilityAnswerElement) p.checkReachability(snapshot, q)).getResult();
                break;
            case "waypoint":
                ArrayList<String> _waypoints = new ArrayList<>();
                _waypoints.add(q.getIngressNodeRegex());
                res = ((SmtReachabilityAnswerElement) p.checkWaypoints(snapshot, q, _waypoints)).getResult();
                break;
            case "loadbalancing":
                res = ((SmtReachabilityAnswerElement) p.checkLoadBalancingSimple(snapshot, q, 2)).getResult();
                break;
            case "bound":
                // bound type cannot apply mincut
                p.veriboost_type = false;
                AnswerElement ans = p.checkBoundedLength(snapshot, q, 100);
                if(ans instanceof SmtOneAnswerElement) {
                    res = ((SmtOneAnswerElement) ans).getResult();
                } else {
                    res = ((SmtReachabilityAnswerElement) ans).getResult();
                }
                break;
            default:
                return;
        }

        time_verification = System.currentTimeMillis() - time_verification;

        System.out.println("---------- end verify "  + prop + " ----------");

        updateVerificationTime(res, q, time_verification);
        writeStatisticData(res, file_path, q);
    }
}