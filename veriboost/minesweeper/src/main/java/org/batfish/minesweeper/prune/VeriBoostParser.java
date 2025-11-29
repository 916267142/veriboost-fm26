package org.batfish.minesweeper.prune;

import org.batfish.minesweeper.Graph;
import org.batfish.minesweeper.GraphEdge;
import org.batfish.minesweeper.prune.VeriBoostUtil.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VeriBoostParser {
    public HashSet<Link> links;

    public VeriBoostParser() {
        links = new HashSet<>();
    }

    public HashSet<Link> getLinks() {
        return links;
    }

    public void setLinks(HashSet<Link> links) {
        this.links = links;
    }

    // read the topology from file, the topology format are as the following
    // from_device:from_interface to_device:to_interface
    // zurich:FastEthernet0/0 frankfurt:FastEthernet4/0
    void readTopologyFromFile(String file_path) {
        try {
            File file = new File(file_path);
            Scanner sc = new Scanner(file);
            while (sc.hasNext()) {
                String line = sc.nextLine();
                // delete some unmeaning char, such as '<' '>' ' '
                line = line.replace("<", "");
                line = line.replace(">", "");
                line = line.replace(" ", "");

                // read from device and to device, namely, the link of topology
                StringTokenizer str = new StringTokenizer(line, ",", false);
                if (str.countTokens() != 2) {
                    System.out.println("exception of reading lines");
                }
                String from = str.nextToken();
                String to = str.nextToken();
                StringTokenizer from_str = new StringTokenizer(from, ":", false);
                StringTokenizer to_str = new StringTokenizer(to, ":", false);
                VeriBoostUtil.Interface from_Interface = new VeriBoostUtil.Interface(from_str.nextToken(),
                        from_str.nextToken());
                VeriBoostUtil.Interface to_Interface = new VeriBoostUtil.Interface(to_str.nextToken(), to_str.nextToken());
                VeriBoostUtil.Link link = new VeriBoostUtil.Link(from_Interface, to_Interface);
                this.links.add(link);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void readTopologyFromBatfish(Graph graph) {
        for (List<GraphEdge> edges : graph.getEdgeMap().values()) {
            for (GraphEdge ge : edges) {
                if (!ge.isAbstract() && ge.getPeer() != null) {
                    String src_router = ge.getRouter();
                    String dst_router = ge.getPeer();
                    String src_interface = ge.getStart().getName();
                    String dst_interface = ge.getEnd().getName();
                    this.links.add(new VeriBoostUtil.Link(new VeriBoostUtil.Interface(src_router, src_interface), new VeriBoostUtil.Interface(dst_router, dst_interface)));
                }
            }
        }
    }

    public void addLinks(String srcDevice, String dstDevice) {
        this.links.add(new VeriBoostUtil.Link(new VeriBoostUtil.Interface(srcDevice, "none"), new VeriBoostUtil.Interface(dstDevice, "none")));
    }
}
