package org.batfish.minesweeper.prune.calculation;

import org.jgrapht.alg.util.Pair;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class SpaceParser {
    public static List<String> getFileNames(String directoryPath) {
        List<String> fileNames = new ArrayList<>();
        File directory = new File(directoryPath);
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        fileNames.add(file.getName());
                    }
                }
            }
        } else {
            out.println("Provided path is not a valid directory.");
        }
        Collections.sort(fileNames);
        return fileNames;
    }

    public static HashSet<Pair<String, String>> readGraphML(String filePath) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            File file = new File(filePath);
            Document document = db.parse(file);
            Element root = document.getDocumentElement();

            String nodeId = getStringStringHashMap(root);
            HashMap<String, String> nodeLabelMap = getStringStringHashMap(root, nodeId);

            HashSet<Pair<String, String>> edges = new HashSet<>();
            NodeList edgeList = root.getElementsByTagName("edge");
            for (int i = 0; i < edgeList.getLength(); i++) {
                Element edge = (Element) edgeList.item(i);
                String source = edge.getAttribute("source");
                String target = edge.getAttribute("target");
                edges.add(new Pair<>(nodeLabelMap.get(source), nodeLabelMap.get(target)));
            }
            return edges;
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static String getStringStringHashMap(Element root) {
        String nodeLabelId = null;
        NodeList keyList = root.getElementsByTagName("key");
        for (int i = 0; i < keyList.getLength(); i++) {
            Element key = (Element) keyList.item(i);
            if ("label".equals(key.getAttribute("attr.name")) &&
                    "string".equals(key.getAttribute("attr.type")) &&
                    "node".equals(key.getAttribute("for"))) {
                nodeLabelId = key.getAttribute("id");
            }
        }
        return nodeLabelId;
    }

    private static HashMap<String, String> getStringStringHashMap(Element root, String nodeLabelId) {
        NodeList nodeList = root.getElementsByTagName("node");
        HashMap<String, String> nodeLabelMap = new HashMap<>();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Element node = (Element) nodeList.item(i);
            String nodeId = node.getAttribute("id");

            NodeList dataList = node.getElementsByTagName("data");
            for (int j = 0; j < dataList.getLength(); j++) {
                Element data = (Element) dataList.item(j);
                String key = data.getAttribute("key");
                String value = data.getTextContent();
                if(key.equals(nodeLabelId)) nodeLabelMap.put(nodeId, value);
            }

        }
        return nodeLabelMap;
    }
}
