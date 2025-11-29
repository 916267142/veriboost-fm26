package org.batfish.minesweeper.prune.calculation;

import org.batfish.minesweeper.prune.TrimmingCore;
import org.batfish.minesweeper.prune.VeriBoost;
import org.batfish.minesweeper.prune.VeriBoostUtil;
import org.batfish.minesweeper.question.SmtEqualLengthQuestionPlugin;
import org.jgrapht.alg.util.Pair;
import java.util.*;

public class SpaceInstance {

    public HashSet<Pair<String, String>> edges;

    public HashSet<Pair<String, String>> queries;

    public SpaceInstance(HashSet<Pair<String, String>> edges) {
        this.edges = edges;
    }

    public Pair<String, String> runAverage() {
        this.generateQueries();
        return this.calculate_average();
    }

    public Pair<String, String> runMaximum() {
        this.generateQueries();
        return this.calculate_maximum();
    }

    @Override
    public String toString() {
        return "SpaceInstance{" +
                "edges=" + edges +
                '}';
    }

    public void generateQueries() {
        HashSet<String> nodes = new HashSet<>();
        edges.forEach(edge -> {nodes.add(edge.getFirst()); nodes.add(edge.getSecond());});

        this.queries = selectAllNodePairs(nodes);

//        Random random = new Random("veriboost".hashCode());
//        this.queries = selectRandomNodePairs(nodes, 2000, random);
    }

    public static HashSet<Pair<String, String>> selectAllNodePairs(Set<String> nodes) {
        HashSet<Pair<String, String>> selectedPairs = new HashSet<>();
        nodes.forEach(first -> {
           nodes.forEach(second -> {
               if(!first.equals(second)) {
                   selectedPairs.add(new Pair<>(first, second));
               }
           });
        });

        return selectedPairs;
    }

    public static HashSet<Pair<String, String>> selectRandomNodePairs(Set<String> nodes, int k, Random random) {
        HashSet<Pair<String, String>> selectedPairs = new HashSet<>();
        List<String> nodeList = new ArrayList<>(nodes);

        k = Math.min(k, nodeList.size() * (nodeList.size() - 1) / 2);

        while (selectedPairs.size() < k) {
            int i = random.nextInt(nodeList.size());
            int j = random.nextInt(nodeList.size());

            if (i != j) {
                Pair<String, String> pair = Pair.of(nodeList.get(i), nodeList.get(j));

                if (!selectedPairs.contains(pair) && !selectedPairs.contains(Pair.of(nodeList.get(j), nodeList.get(i)))) {
                    selectedPairs.add(pair);
                }
            }
        }
        return selectedPairs;
    }

    public Pair<String, String> calculate_average() {
        VeriBoost veriboost = new VeriBoost();
        TrimmingCore trimmingCore = new TrimmingCore();

        this.edges.forEach(edge->veriboost.addLinks(edge.getFirst(), edge.getSecond()));
        veriboost.buildEdge();
        veriboost.buildComponent();

        this.edges.forEach(edge-> {
            trimmingCore.addEdge(edge.getFirst(), edge.getSecond());
            trimmingCore.addEdge(edge.getSecond(), edge.getFirst());
        });

        double[] runningTime = new double[]{0.0, 0.0, 0.0};
        // up, down, free, total
        double[] totalLinksNumber = new double[]{0.0, 0.0, 0.0, 0};

        queries.forEach(query->{
            veriboost.getMinesweeperConstraint(query.getFirst(), query.getSecond());
            totalLinksNumber[0] += veriboost.getMinesweeperConstraint(VeriBoostUtil.LinkType.up_link).size();
            totalLinksNumber[1] += veriboost.getMinesweeperConstraint(VeriBoostUtil.LinkType.down_link).size();
            totalLinksNumber[2] += veriboost.getMinesweeperConstraint(VeriBoostUtil.LinkType.free_link).size();

            runningTime[0] += veriboost.prune_time;
            runningTime[1] += veriboost.compression_time;
            trimmingCore.getCut(query.getFirst(), query.getSecond());
            runningTime[2] += trimmingCore.time;

        });
        totalLinksNumber[3] = (totalLinksNumber[0] + totalLinksNumber[1] + totalLinksNumber[2]);
        double[] averageLinksNumber = new double[4];
        for (int i = 0; i < 4; i++) {
            averageLinksNumber[i] = totalLinksNumber[i] / queries.size();
        }

        String timeResult = String.format("%.1f",runningTime[0] / queries.size() / 1000)
                + "\t" + String.format("%.1f",runningTime[1] / queries.size() / 1000)
                + "\t" + String.format("%.1f",runningTime[2] / queries.size() / 1000);

        String numberResult = String.format("%.1f",averageLinksNumber[3])
                // the symbolic links after pruning
                + "\t" + String.format("%.1f",(averageLinksNumber[0] + averageLinksNumber[2]))
                // the symbolic links after compression
                + "\t" + String.format("%.1f",(averageLinksNumber[2]));

        return Pair.of(numberResult, timeResult);
    }

    public Pair<String, String> calculate_maximum() {
        VeriBoost veriboost = new VeriBoost();
        TrimmingCore trimmingCore = new TrimmingCore();

        this.edges.forEach(edge->veriboost.addLinks(edge.getFirst(), edge.getSecond()));
        this.edges.forEach(edge-> {
            trimmingCore.addEdge(edge.getFirst(), edge.getSecond());
            trimmingCore.addEdge(edge.getSecond(), edge.getFirst());
        });
        veriboost.buildEdge();
        veriboost.buildComponent();

        double[] runningTime = new double[]{0.0, 0.0, 0.0};
        // up, down, free, total
        double[] totalLinksNumber = new double[]{0.0, 0.0, 0.0, 0};

        queries.forEach(query->{
            veriboost.getMinesweeperConstraint(query.getFirst(), query.getSecond());
            if(totalLinksNumber[2] <= veriboost.getMinesweeperConstraint(VeriBoostUtil.LinkType.free_link).size()){
                totalLinksNumber[0] = veriboost.getMinesweeperConstraint(VeriBoostUtil.LinkType.up_link).size();
                totalLinksNumber[1] = veriboost.getMinesweeperConstraint(VeriBoostUtil.LinkType.down_link).size();
                totalLinksNumber[2] = veriboost.getMinesweeperConstraint(VeriBoostUtil.LinkType.free_link).size();
            }

            if(runningTime[0] + runningTime[1] <= veriboost.prune_time + veriboost.compression_time) {
                runningTime[0] = veriboost.prune_time;
                runningTime[1] = veriboost.compression_time;
                trimmingCore.getCut(query.getFirst(), query.getSecond());
                runningTime[2] = trimmingCore.time;
            }

        });
        totalLinksNumber[3] = (totalLinksNumber[0] + totalLinksNumber[1] + totalLinksNumber[2]);
        double[] averageLinksNumber = new double[4];
        for (int i = 0; i < 4; i++) {
            averageLinksNumber[i] = totalLinksNumber[i];
        }

        String timeResult = String.format("%.1f",runningTime[0] /  1000)
                + "\t" + String.format("%.1f",runningTime[1] / 1000)
                + "\t" + String.format("%.1f",runningTime[2] / 1000);

        String numberResult = String.format("%.1f",averageLinksNumber[3])
                // the symbolic links after pruning
                + "\t" + String.format("%.1f",(averageLinksNumber[0] + averageLinksNumber[2]))
                // the symbolic links after compression
                + "\t" + String.format("%.1f",(averageLinksNumber[2]));

        return Pair.of(numberResult, timeResult);
    }
}
