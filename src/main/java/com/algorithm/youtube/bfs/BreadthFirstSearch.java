package com.algorithm.youtube.bfs;

import java.util.*;

public class BreadthFirstSearch {
    public static boolean[] visited = new boolean[9];
    public static List<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int x = q.poll();
            System.out.println(x + " ");

            for (int i = 0; i <graph.get(x).size() ; i++) {
                int y = graph.get(x).get(i);

                if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }
            }
        }
    }
}
