package org.batfish.minesweeper.prune;

import org.batfish.minesweeper.prune.VeriBoostUtil.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class BCTree {
    HashMap<Integer, ShrinkComponent> shrink_graph_components; // component_id -> connected_components
    HashMap<String, ShrinkCut> shrink_graph_cuts;  // node_name -> cut_points

    BCTree() {
        shrink_graph_components = new HashMap<>();
        shrink_graph_cuts = new HashMap<>();
    }

    ShrinkCut getShrinkCut(String node) {
        if(!this.shrink_graph_cuts.containsKey(node)) {
            shrink_graph_cuts.put(node, new ShrinkCut(node));
        }
        return shrink_graph_cuts.get(node);
    }

    ShrinkComponent getShrinkComponent(Integer id) {
        if(!this.shrink_graph_components.containsKey(id)) {
            shrink_graph_components.put(id, new ShrinkComponent(id));
        }
        return shrink_graph_components.get(id);
    }

    void constructShrinkGraph(HashMap<Integer, HashSet<String>> connected_components, HashSet<String> cut_points) {
        connected_components.forEach((ct_id, nodes) -> {
            ShrinkComponent curr_shrink_graph_component = getShrinkComponent(ct_id);
            nodes.forEach(node -> {
                curr_shrink_graph_component.addNode(node);
                getShrinkCut(node).addShrinkComponent(curr_shrink_graph_component);
                if(cut_points.contains(node)) {
                    curr_shrink_graph_component.addShrinkCut(getShrinkCut(node));
                }
            });
        });
    }

    void updateShrinkGraphLinks(HashSet<SimpleLink> links) {
        links.forEach(link -> {
            String src = link.src_name;
            String dst = link.dst_name;
            Set<Integer> src_sets =  getShrinkCut(src).adj_shrink_graph_components.stream()
                    .map(graph -> graph.id).collect(Collectors.toSet());
            Set<Integer> dst_sets =  getShrinkCut(dst).adj_shrink_graph_components.stream()
                    .map(graph -> graph.id).collect(Collectors.toSet());
            src_sets.retainAll(dst_sets);
            assert (src_sets.size() == 1);
            int ct_id = src_sets.iterator().next();
            getShrinkComponent(ct_id).addLink(link);
        });
    }

    void dfsRelevantShrinkNodes(ShrinkNode cur_node, String dst_node,
                                     HashSet<Integer> ans_components, ArrayList<ShrinkNode> path,
                                     HashSet<ShrinkNode> visit) {
        // Note that 'shrink graph' have two types of node
        if(cur_node.type == NodeType.shrink_cut) {
            for(ShrinkComponent node : cur_node.ShrinkCut.adj_shrink_graph_components) {
                if(!ans_components.isEmpty()) {
                    return ;
                }
                ShrinkNode bsc_node = new ShrinkNode(node);
                if(!visit.contains(bsc_node)) {
                    visit.add(bsc_node);
                    path.add(bsc_node);
                    dfsRelevantShrinkNodes(new ShrinkNode(node), dst_node, ans_components, path, visit);
                    path.remove(path.size() - 1);
                }
            }
        }
        if(cur_node.type == NodeType.shrink_component) {
            // end dfs when a component contain 'dst_node'
            if(cur_node.ShrinkComponent.nodes.contains(dst_node)) {
                ans_components.addAll(path.stream()
                        .filter(bsc_node -> bsc_node.type == NodeType.shrink_component)
                        .map(bsc_node -> bsc_node.ShrinkComponent.id).collect(Collectors.toSet()));
                return ;
            }
            for(ShrinkCut node : cur_node.ShrinkComponent.adj_shrink_graph_cuts) {
                if(!ans_components.isEmpty()) {
                    return ;
                }
                ShrinkNode bsc_node = new ShrinkNode(node);
                if(!visit.contains(bsc_node)) {
                    visit.add(bsc_node);
                    path.add(bsc_node);
                    dfsRelevantShrinkNodes(new ShrinkNode(node), dst_node, ans_components, path, visit);
                    path.remove(path.size() - 1);
                }
            }

        }
    }

    HashSet<SimpleLink> getRelevantLinks(String src, String dst) {
        // Step1. find the src node in 'shrink graph'
        HashSet<SimpleLink> links = new HashSet<>();
        ShrinkCut src_node = getShrinkCut(src);

        // Step2. use dfs to traverse until find a component contain 'dst'
        HashSet<Integer> ans_components = new HashSet<>();
        ArrayList<ShrinkNode> path = new ArrayList<>();
        HashSet<ShrinkNode> visit = new HashSet<>();
        ShrinkNode bsc_node = new ShrinkNode(src_node);
        visit.add(bsc_node);
        dfsRelevantShrinkNodes(bsc_node, dst, ans_components, path, visit);

        // Step3. add all links in relevant components
        ans_components.forEach(id -> links.addAll(getShrinkComponent(id).links));
        return links;
    }
}
