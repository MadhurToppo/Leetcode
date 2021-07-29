package com.madhurtoppo.ctci.treesandgraphs.Q401RouteBetweenNodes;

import com.madhurtoppo.ctci.commons.classes.Graph;
import com.madhurtoppo.ctci.commons.classes.Node;

import java.util.LinkedList;

public class Question {

    public enum State {
        Unvisited, Visited, Visiting;
    }

    public static boolean search(Graph graph, Node start, Node end) {
        LinkedList<Node> queue = new LinkedList<>();
        for (Node node : graph.getNodes()) {
            node.state = State.Unvisited;
        }
        start.state = State.Visiting;
        queue.add(start);
        Node node;
        while (!queue.isEmpty()) {
            node = queue.removeFirst();
            if (node != null) {
                for (Node visited : node.getEdges()) {
                    if (visited.state == State.Unvisited) {
                        if (visited == end) {
                            return true;
                        } else {
                            visited.state = State.Visiting;
                            queue.add(visited);
                        }
                    }
                }
                node.state = State.Visited;
            }
        }
        return false;
    }
}