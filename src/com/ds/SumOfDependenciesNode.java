package com.ds;

import com.ds.util.Utils;

public class SumOfDependenciesNode {

    public static void main(String[] args) {
        Utils.Graph graph= new Utils.Graph(4);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(0,3);
        graph.addEdge(3,2);
        System.out.println(graph.findSumOfDependencies());
    }
}
