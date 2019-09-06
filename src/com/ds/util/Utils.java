package com.ds.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Utils {

    private Scanner sc = new Scanner(System.in);

    public int getInt() {
        return sc.nextInt();
    }

    public long getLong() {
        return sc.nextLong();
    }

    public String getString() {
        return sc.next();
    }

    public String getStringSpaces() {
        return sc.nextLine();
    }

    public double getDouble() {
        return sc.nextDouble();
    }

    public float getFloat() {
        return sc.nextFloat();
    }


    public static class Graph {
        private int vertices;   // No. of vertices
        private LinkedList<Integer> adj[]; //Adjacency Lists

        public Graph(int v) {
            vertices = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        public void addEdge(int v, int w) {
            adj[v].add(w);
        }

        public void printBFS(int source) {
            boolean visited[] = new boolean[vertices];

            LinkedList<Integer> queue = new LinkedList<Integer>();
            visited[source] = true;
            queue.add(source);
            while (queue.size() != 0) {
                source = queue.pop();
                System.out.println(source);
                Iterator<Integer> i = adj[source].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }

        public int findMother(){

            outer:for(int i=0;i<vertices;i++) {
            System.out.println("---------------------------------");
                boolean visited[] = new boolean[vertices];

                LinkedList<Integer> queue = new LinkedList<>();
                visited[i] = true;
                queue.add(i);
                while (queue.size() != 0) {
                    int temp = queue.pop();

                    Iterator<Integer> x = adj[temp].listIterator();
                    while (x.hasNext()) {
                        int ne = x.next();

                        if (!visited[ne]) {
                            visited[ne] = true;
                            queue.add(ne);
                        }
                    }


                }


                for(boolean bc:visited){
                    if(!bc){
                          continue outer;
                    }
                }
                return i;
            }
           return -1;
        }

        public void pathFind(int source, int destination) {
            boolean visited[] = new boolean[vertices];

            LinkedList<Integer> queue = new LinkedList<>();
            visited[source] = true;

            outer:
            while (queue.size() != 0) {
                source = queue.pop();
                System.out.println(source);
                Iterator<Integer> i = adj[source].listIterator();
                inner:
                while (i.hasNext()) {
                    int n = i.next();
                    if (n == destination) {
                        System.out.println(i);
                        break outer;
                    }
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }
            }
        }
    }
}