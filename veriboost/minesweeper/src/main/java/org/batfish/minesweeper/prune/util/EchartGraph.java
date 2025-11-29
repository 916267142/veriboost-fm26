package org.batfish.minesweeper.prune.util;

import org.icepear.echarts.Graph;
import org.icepear.echarts.charts.graph.*;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.render.Engine;
import org.jgrapht.alg.util.Pair;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

//
// This is the util function in order to draw topology into html file.
// https://echarts.icepear.org/#/chart-apis/graph
//

public class EchartGraph {

    public static void draw(HashSet<Pair<String, String>> temp_links, String outputPath) {
        HashSet<String> temp_nodes = new HashSet<>();
        temp_links.forEach(link -> {
            temp_nodes.add(link.getFirst());
            temp_nodes.add(link.getSecond());
        });

        Graph graph = new Graph()
                .setTitle("topology")
                .setTooltip("item")
                .setLegend()
                .addSeries(new GraphSeries()
                        .setLayout("force")
                        .setData(temp_nodes.stream()
                                .map(node -> new GraphNodeItem()
                                        .setName(node)
                                        .setDraggable(true)
                                        .setSymbolSize(12)).toArray(GraphNodeItem[]::new))
                        .setLinks(temp_links.stream()
                                .map(edge -> new GraphEdgeItem()
                                        .setSource(edge.getFirst())
                                        .setTarget(edge.getSecond())
                                        .setSymbolSize(10)).toArray(GraphEdgeItem[]::new))
                        .setDraggable(true)
                        .setLineStyle(new GraphEdgeLineStyle().setWidth(2))
                        .setLabel(new SeriesLabel().setShow(true).setPosition("top"))
                        .setForce(new GraphForce().setRepulsion(500).setGravity(0.2))
                );

        Engine engine = new Engine();
        engine.render(outputPath, graph, "3500px", "5000px", false);
    }

    public static void main(String[] args) throws Exception {
        HashSet<Pair<String, String>> l1 = new HashSet<>();
        l1.add(new Pair<>("1", "2"));
        l1.add(new Pair<>("2", "3"));
        l1.add(new Pair<>("3", "4"));
        draw(l1, "topology.html");
    }
}