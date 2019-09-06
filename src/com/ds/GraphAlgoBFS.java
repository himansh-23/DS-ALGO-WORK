package com.ds;

import com.ds.util.*;

public class GraphAlgoBFS {

    Utils utility=new Utils();

    public static void main(String ...args){
            Utils.Graph g=new Utils.Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("Following is Breadth First Traversal "+
                    "(starting from vertex 1)");

            g.printBFS(1);

            System.out.println("Find Destination from Source");

            g.pathFind(1,3);


    }
}
