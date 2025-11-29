package org.batfish.minesweeper.prune.util;

import org.batfish.datamodel.Configuration;
import org.batfish.datamodel.Interface;
import org.batfish.minesweeper.prune.question.SmtBenchmarkPropertiesQuestionPlugin;
import org.batfish.minesweeper.question.HeaderLocationQuestion;
import org.batfish.minesweeper.smt.Encoder;
import org.batfish.minesweeper.smt.VerificationResult;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExperimentTools {
    protected static final String DATASET_PATH = "./dataset";
    protected static final String RESULT_PATH = "./result";

    protected final double[][] property_verification_time = new double[2][4];   // 0 - unverified ; 1 - verified
    protected final int[][] property_verification_number = new int[2][4];   // 0 - unverified ; 1 - verified

    protected final double[] link_variable_number = new double[3];   // 0 - origin ; 1 - pruning ; 2 - compression
    protected final double[] each_step_time = new double[3];  // 0 - mincut ; 1 - pruning ; 2 - compression

    protected double property_number_non_filter_mincut = 0;
    protected double property_number_filter_mincut = 0;

    public ExperimentTools() {
        for(int i = 0; i < property_verification_time.length; i++) {
            property_verification_time[0][i] = property_verification_time[1][i] = 0;
            property_verification_number[0][i] = property_verification_number[1][i] = 0;
        }
        for(int i = 0; i < property_verification_number.length; i++) {
            link_variable_number[i] = 0;
            each_step_time[i] = 0;
        }
    }

    public static void saveDataToFile(String filePath, String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(data);
            writer.newLine();
            writer.close();
            System.out.println("data is successfully saved at " + filePath);
        } catch (IOException e) {
            System.out.println("failed to save data: " + e.getMessage());
        }
    }

    protected static void saveDataToFile(String filePath, String[][] data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            for (String[] datum : data) {
                for (int j = 0; j < datum.length; j++) {
                    writer.write(datum[j]);
                    if (j < datum.length - 1) {
                        writer.write("\t");
                    }
                }
                writer.newLine();
            }
            writer.close();
            System.out.println("data is successfully saved at " + filePath);
        } catch (IOException e) {
            System.out.println("failed to save data: " + e.getMessage());
        }
    }

    protected static List<String[]> readTopology(String topo) {
        List<String[]> nodePairs = new ArrayList<>();
        String filePath = DATASET_PATH + "/" + topo + "/reaches.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase();
                line = line.replace("_", "");
                String[] pair = line.split("\t");
                nodePairs.add(pair);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return nodePairs;
    }

    public static void createFile(String path) {
        File f = new File(path);
        if (!f.getParentFile().exists()) {
            f.getParentFile().mkdirs();
        }
        if (f.exists()) {
            f.delete();
        }
        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected static String getPortName(Configuration dstNodeConfig) {
        String[] target_port_name = new String[]{"GigabitEthernet0/0", "Ethernet0", "FastEthernet0/0"};

        String dst_port_name = "";

        for (Interface port: dstNodeConfig.getActiveInterfaces().values()){
            if (port.getName().equals(target_port_name[0])) {
                dst_port_name = target_port_name[0];
                break;
            }
        }

        for(int i = 1; i < target_port_name.length; ++i) {
            if(dst_port_name.isEmpty()) {
                for (Interface port: dstNodeConfig.getActiveInterfaces().values()){
                    if (port.getName().equals(target_port_name[i])) {
                        dst_port_name = target_port_name[i];
                        break;
                    }
                }
            }
        }
        return dst_port_name;
    }

    protected static String getFilePath(String fileName, HeaderLocationQuestion q, String prop) {
        SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion bq = (SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q;
        String topo = bq.getTopologyPath();
        String s_mode;

        if(bq.getPrune()) {
            if(bq.getGuided()) {
                s_mode = "netsmt-veriboost";
            } else {
                s_mode = "veriboost";
            }
        } else {
            if(bq.getGuided()) {
                s_mode = "netsmt";
            } else {
                s_mode = "minesweeper";
            }
        }

        Path path = Paths.get(topo);
        Path storePath = path.getParent().resolve(s_mode).resolve(path.getFileName());
        return Paths.get(RESULT_PATH).resolve(storePath).resolve(prop + "_" + fileName).toString();
    }

    protected static void writeHead(String fileName) {
        createFile(fileName);

        // set result table header
        String[][] dataHead = new String[1][24];
        dataHead[0] = new String[]{"src_node", "dst_node", "tolerance", "dstIps", "sat/unsat", "Conflicts", "Decisions", "TotalTime",
                "AvgSolverTime", "MaxSolverTime", "MinSolverTime",
                "AvgZ3Time", "MaxZ3Time", "MinZ3Time", "AvgEncodingTime", "dstPort",
                "Variables", "Constraints", "MincutTime", "PruneTime", "CompressionTime", "ToleranceOrigin", "TolerancePrune", "ToleranceCompression"};

        saveDataToFile(fileName, dataHead);
    }

    protected void updateVerificationTime(VerificationResult res, HeaderLocationQuestion q, double time_verification) {
        if(res.isVerified()) {
            property_verification_time[1][q.getFailures()] += time_verification;
            property_verification_number[1][q.getFailures()]++;
        } else {
            property_verification_time[0][q.getFailures()] += time_verification;
            property_verification_number[0][q.getFailures()]++;
        }
    }

    public void writeActualSummary(HeaderLocationQuestion q, String prop) {
        String filePathSummary = getFilePath("summary.txt", q, prop);
        createFile(filePathSummary);
        String data;

        data = "Running ********************* \t";
        saveDataToFile(filePathSummary, data);
        data = "The following are unverified : \t";
        saveDataToFile(filePathSummary, data);

        for(int i = 1; i <= 3; ++i) {
            data = "Numb of k = " + i + ": \t" + property_verification_number[0][i];
            saveDataToFile(filePathSummary, data);
            data = "Time of k = " + i + ": \t" + property_verification_time[0][i] / 1000;
            saveDataToFile(filePathSummary, data);
            data = "Aver of k = " + i + ": \t" + property_verification_time[0][i] / (1000 * property_verification_number[0][i]);
            saveDataToFile(filePathSummary, data);
        }

        data = "\nThe following are verified : \t";
        saveDataToFile(filePathSummary, data);

        for(int i = 1; i <= 3; ++i) {
            data = "Numb of k = " + i + ": \t" + property_verification_number[1][i];
            saveDataToFile(filePathSummary, data);
            data = "Time of k = " + i + ": \t" + property_verification_time[1][i] / 1000;
            saveDataToFile(filePathSummary, data);
            data = "Aver of k = " + i + ": \t" + property_verification_time[1][i] / (1000 * property_verification_number[1][i]);
            saveDataToFile(filePathSummary, data);
        }
    }

    public void writeVeriBoostSummary(HeaderLocationQuestion q, String prop) {
        String filePathSummary = getFilePath("summary.txt", q, prop);
        // createFile(filePathSummary);
        String data;

        data = "\nDetails ********************* \t";
        saveDataToFile(filePathSummary, data);

        data = "Time of Minc : \t" + (each_step_time[0] / (property_number_filter_mincut + property_number_non_filter_mincut));
        saveDataToFile(filePathSummary, data);

        data = "Time of Prun : \t" + (each_step_time[1] / property_number_non_filter_mincut);
        saveDataToFile(filePathSummary, data);

        data = "Time of Comp : \t" + (each_step_time[2] / property_number_non_filter_mincut);
        saveDataToFile(filePathSummary, data);

        data = "Numb of Orgi : \t" + (link_variable_number[0] / property_number_non_filter_mincut);
        saveDataToFile(filePathSummary, data);

        data = "Numb of Prun : \t" + (link_variable_number[1] / property_number_non_filter_mincut);
        saveDataToFile(filePathSummary, data);

        data = "Numb of Comp : \t" + (link_variable_number[2] / property_number_non_filter_mincut);
        saveDataToFile(filePathSummary, data);

    }

    public void writeEstimateSummary(HeaderLocationQuestion q, String prop) {
        String filePathSummary = getFilePath("summary.txt", q, prop);
        // createFile(filePathSummary);
        String data;

        double[][] aver_time = new double[2][4];
        for(int i = 1; i <= 3; ++i) {
            aver_time[0][i] = property_verification_time[0][i] / (property_verification_number[0][i]);
            aver_time[1][i] = property_verification_time[1][i] / (property_verification_number[1][i]);
        }

        int tota_numb_all_k = 0;
        int[][] tota_numb = new int[2][4];
        for(int i = 1; i <= 3; ++i) {
            tota_numb[0][i] = tota_numb[1][i] = 0;
        }

        double[][] tota_time = new double[2][4];

        String topology = ((SmtBenchmarkPropertiesQuestionPlugin.SmtBenchMarkPropertiesQuestion) q).getTopologyPath();
        List<String[]> node_pairs = readTopology(topology);

        for (String[] node_pair : node_pairs) {
            int tolerance = Integer.parseInt(node_pair[0]);
            if (tolerance == 1) {
                tota_numb[1][1]++;
            }
            if (tolerance == 2) {
                tota_numb[1][1]++;
                tota_numb[1][2]++;
            }
            if (tolerance == 3) {
                tota_numb[1][1]++;
                tota_numb[1][2]++;
                tota_numb[1][3]++;
            }
            tota_numb_all_k++;
        }

        for(int i = 1; i <= 3; ++i) {
            tota_numb[0][i] = tota_numb_all_k - tota_numb[1][i];
            tota_time[0][i] = aver_time[0][i] * tota_numb[0][i];
            tota_time[1][i] = aver_time[1][i] * tota_numb[1][i];
        }

        data = "\nEstimating ********************* \t";
        saveDataToFile(filePathSummary, data);
        data = "The following are unverified : \t";
        saveDataToFile(filePathSummary, data);

        for(int i = 1; i <= 3; ++i) {
            data = "Numb of k = " + i + ": \t" + tota_numb[0][i];
            saveDataToFile(filePathSummary, data);
            data = "Time of k = " + i + ": \t" + tota_time[0][i] / 1000;
            saveDataToFile(filePathSummary, data);
            data = "Aver of k = " + i + ": \t" + aver_time[0][i] / 1000;
            saveDataToFile(filePathSummary, data);
        }

        data = "\nThe following are verified : \t";
        saveDataToFile(filePathSummary, data);

        for(int i = 1; i <= 3; ++i) {
            data = "Numb of k = " + i + ": \t" + tota_numb[1][i];
            saveDataToFile(filePathSummary, data);
            data = "Time of k = " + i + ": \t" + tota_time[1][i] / 1000;
            saveDataToFile(filePathSummary, data);
            data = "Aver of k = " + i + ": \t" + aver_time[1][i] / 1000;
            saveDataToFile(filePathSummary, data);
        }
    }

    public void writeStatisticData(VerificationResult res, String file_path, HeaderLocationQuestion q) {

        int n_Conflicts = res.getStats().getConflicts();
        int n_Decisions = res.getStats().getDecisions();
        double n_AvgSolverTime = res.getStats().getAvgSolverTime();
        double n_MaxSolverTime = res.getStats().getMaxSolverTime();
        double n_MinSolverTime = res.getStats().getMinSolverTime();
        double n_AvgZ3Time = res.getStats().getAvgZ3Time();
        double n_MaxZ3Time = res.getStats().getMaxZ3Time();
        double n_MinZ3Time = res.getStats().getMinZ3Time();
        boolean n_isVerified = res.isVerified();  // false for sat, unsat otherwise
        double n_AvgEncodingTime = res.getStats().getAvgEncodingTime();
        double n_Variables = res.getStats().getAvgNumVariables();
        double n_Constraints = res.getStats().getAvgNumConstraints();
        double n_TotalTime = res.getStats().getTotalTime();
        double n_MincutTime = res.getStats().getMincutTime();
        double n_CompressionTime = res.getStats().getCompressionTime();
        double n_PruneTime = res.getStats().getPruneTime();
        double n_tolerance_orgin = res.getStats().getToleranceSpaceOrigin();
        double n_tolerance_compression = res.getStats().getToleranceSpaceCompression();
        double n_tolerance_prune = res.getStats().getToleranceSpacePrune();

        each_step_time[0] += n_MincutTime;
        each_step_time[1] += n_PruneTime;
        each_step_time[2] += n_CompressionTime;

        link_variable_number[0] += n_tolerance_orgin;
        link_variable_number[1] += n_tolerance_prune;
        link_variable_number[2] += n_tolerance_compression;

        if(res.getStats().getMincutVerified()) {
            property_number_filter_mincut++;
        } else {
            property_number_non_filter_mincut++;
        }

        String[][] data = new String[1][24];

        String n_verify = "sat";
        if (n_isVerified) {
            n_verify = "unsat";
        }
        double timeout = (double) Encoder.TIMEOUT / 1000;  // millisecond -> second
        if (n_AvgZ3Time >= timeout) {
            n_verify = "timeout";
        }

        String dstip = "null";
        if (q.getHeaderSpace().getDstIps() != null) {
            dstip = q.getHeaderSpace().getDstIps().toString();
        }

        data[0] = new String[]{
                q.getIngressNodeRegex(), q.getFinalNodeRegex(), String.valueOf(q.getFailures()), dstip , n_verify, String.valueOf(n_Conflicts), String.valueOf(n_Decisions),
                String.valueOf(n_TotalTime),
                String.valueOf(n_AvgSolverTime), String.valueOf(n_MaxSolverTime), String.valueOf(n_MinSolverTime),
                String.valueOf(n_AvgZ3Time), String.valueOf(n_MaxZ3Time), String.valueOf(n_MinZ3Time), String.valueOf(n_AvgEncodingTime), q.getFinalIfaceRegex(),
                String.valueOf(n_Variables), String.valueOf(n_Constraints),
                String.valueOf(n_MincutTime), String.valueOf(n_PruneTime), String.valueOf(n_CompressionTime),
                String.valueOf(n_tolerance_orgin), String.valueOf(n_tolerance_prune), String.valueOf(n_tolerance_compression)
        };
        saveDataToFile(file_path, data);
    }
}
