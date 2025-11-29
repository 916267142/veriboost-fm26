package org.batfish.minesweeper.prune.experiment;

import org.batfish.common.NetworkSnapshot;
import org.batfish.common.plugin.IBatfish;
import org.batfish.minesweeper.Graph;
import org.batfish.minesweeper.prune.question.SmtGeneratePropertiesQuestionPlugin;
import org.batfish.minesweeper.prune.TrimmingCore;
import org.jgrapht.alg.util.Pair;

import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.lang.String;

public class GeneratePropertiesExperiment {

    private static final String DATASET_PATH = "./dataset";
    IBatfish _batfish;

    Boolean first_write = true;

    public GeneratePropertiesExperiment(IBatfish batfish) {
        this._batfish = batfish;
    }

    public void generateProperties(NetworkSnapshot snapshot, SmtGeneratePropertiesQuestionPlugin.SmtGeneratePropertiesQuestion q) {

        Graph graph = new Graph(_batfish, snapshot);
        HashSet<String> nodes = new HashSet<>(graph.getConfigurations().keySet());

        String filePathSummary = DATASET_PATH + "/" + q.getConfigPath() + "/summary.txt";
        String filePath = DATASET_PATH + "/" + q.getConfigPath() + "/reaches.txt";

        TrimmingCore mincut = new TrimmingCore();
        graph.getEdgeMap().values().forEach(edges -> edges.forEach(edge -> {
            if (!edge.isAbstract() && edge.getPeer() != null) {
                mincut.addEdge(edge.getRouter(), edge.getPeer());
            }
        }));

        // we will first clear the old file, use the 'first_write' to control it.
        first_write = true;

        AtomicInteger number_property_mincut = new AtomicInteger();
        AtomicInteger number_query_mincut = new AtomicInteger();
        TreeMap<Integer, HashSet<Pair<String, String>>> cuts = new TreeMap<>(Collections.reverseOrder());
        cuts.put(0, new HashSet<>());
        cuts.put(1, new HashSet<>());
        cuts.put(2, new HashSet<>());
        cuts.put(3, new HashSet<>());

        // if(q.getConfigPath().contains("xxx")) {
        //     List<String[]> nodePairs = readTopology(q.getConfigPath());
        //     for (String[] nodePair : nodePairs) {
        //         int cut = mincut.getCut(nodePair[0], nodePair[1]);
        //         int tolerance = Math.min((cut - 1), 3);
        //         cuts.get(tolerance).add(new Pair<>(nodePair[0], nodePair[1]));
        //     }
        // } else {
        //     mincut.getCuts().forEach((pair, cut) -> {
        //         if((cut - 1) >= 0) {
        //             int tolerance = Math.min((cut - 1), 3);
        //             cuts.get(tolerance).add(pair);
        //         }
        //     });
        // }

        mincut.getCuts().forEach((pair, cut) -> {
            if((cut - 1) >= 0) {
                int tolerance = Math.min((cut - 1), 3);
                cuts.get(tolerance).add(pair);
            }
        });


        // output the sort format by decrease tolerance
        cuts.forEach((tolerance, pairs) -> pairs.forEach(pair -> {
            String data = tolerance + "\t" + pair.getFirst() + "\t" + pair.getSecond();
            saveDataToFile(filePath, data);
            number_property_mincut.addAndGet(1);
            number_query_mincut.addAndGet(tolerance);
        }));

        first_write = true;

        int total_number_reachability = nodes.size() * nodes.size();
        String data = "Total number of properties : " + total_number_reachability;
        saveDataToFile(filePathSummary, data);

        data = "Total number of queries : " + (total_number_reachability + number_query_mincut.get());
        saveDataToFile(filePathSummary, data);

        data = "Total number of properties by mincut : " + number_property_mincut;
        saveDataToFile(filePathSummary, data);

        data = "Total number of k = 3 : " + cuts.get(3).size();
        saveDataToFile(filePathSummary, data);

        data = "Total number of k = 2 : " + (cuts.get(3).size() + cuts.get(2).size());
        saveDataToFile(filePathSummary, data);

        data = "Total number of k = 1 : " + (cuts.get(3).size() + cuts.get(2).size() + cuts.get(1).size());
        saveDataToFile(filePathSummary, data);

        data = "Percentage of properties : " + 1.0 * number_property_mincut.get() / total_number_reachability;
        saveDataToFile(filePathSummary, data);

        data = "Percentage of queries  : " + 1.0 * number_property_mincut.get() / (total_number_reachability + number_query_mincut.get());
        saveDataToFile(filePathSummary, data);
    }

    public void saveDataToFile(String file_name, String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file_name, !first_write));
            first_write = false;
            writer.write(data);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.out.println("failed to save data: " + e.getMessage());
        }
    }

    public List<String[]> readTopology(String topo) {
        List<String[]> nodePairs = new ArrayList<>();
        String filePath = DATASET_PATH + "/" + topo + "/node_pairs.txt";
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
}


