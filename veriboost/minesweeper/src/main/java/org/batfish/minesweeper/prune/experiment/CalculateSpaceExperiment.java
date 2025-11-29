package org.batfish.minesweeper.prune.experiment;

import org.batfish.minesweeper.prune.calculation.SpaceInstance;
import org.batfish.minesweeper.prune.calculation.SpaceParser;

import java.util.*;

import org.batfish.minesweeper.prune.util.ExperimentTools;
import org.jgrapht.alg.util.Pair;

public class CalculateSpaceExperiment extends ExperimentTools {
    public CalculateSpaceExperiment() {}

    public void run(String configs) {

        List<String> fileNames = SpaceParser.getFileNames(configs);
        String timeFilePathMaximum = "result/"+configs.split("/")[1] + "/maximum_time.csv";
        String linkFilePathMaximum = "result/"+configs.split("/")[1] + "/maximum_link.csv";

        String timeFilePathAverage = "result/"+configs.split("/")[1] + "/average_time.csv";
        String linkFilePathAverage = "result/"+configs.split("/")[1] + "/average_link.csv";
        createFile(timeFilePathMaximum);
        createFile(linkFilePathMaximum);
        createFile(timeFilePathAverage);
        createFile(linkFilePathAverage);

        ArrayList<HashSet<Pair<String, String>>> allEdges = new ArrayList<>();

        fileNames.forEach(file -> {
            String inputFilePath = configs + "/" + file;
            HashSet<Pair<String, String>> edges = SpaceParser.readGraphML(inputFilePath);
            allEdges.add(edges);
        });

        allEdges.sort(Comparator.comparingInt(HashSet::size));
        allEdges.forEach(edges  -> {
            SpaceInstance spaceInstance = new SpaceInstance(edges);
            Pair<String, String> result = spaceInstance.runMaximum();
            saveDataToFile(linkFilePathMaximum, result.getFirst());
            saveDataToFile(timeFilePathMaximum, result.getSecond());});

        allEdges.forEach(edges  -> {
            SpaceInstance spaceInstance = new SpaceInstance(edges);
            Pair<String, String> result = spaceInstance.runAverage();
            saveDataToFile(linkFilePathAverage, result.getFirst());
            saveDataToFile(timeFilePathAverage, result.getSecond());});
    }
}
