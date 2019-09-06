package com.ds;

import com.ds.util.Utils;

public class FindMotherVertexInGraph {
    public static void main(String args[]) {
        Utils.Graph g = new Utils.Graph(4);

        g.addEdge(0, 1);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);

        int answer=g.findMother();

        System.out.println(answer);



    }
}
