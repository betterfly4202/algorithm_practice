package com.algorithm.youtube.dfs;

import java.util.*;

public class DepthFirstSearch {
    public static String dfs(int [][] graph){
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Boolean> m = new HashMap<>();

        for (int i = 0; i < graph.length ; i++) {
            m.put(i, false);
        }
        List<Integer> list = new ArrayList<>();

        int idx = 1;
        while(true){
            if (!m.get(idx)){
                list.add(idx);
                m.put(idx, true);
                stack.add(idx);
            }


            int min = Integer.MAX_VALUE;
            for (int j = 0; j <graph[idx].length ; j++) {
                int now = graph[idx][j];
                if (!m.get(now) && min > graph[idx][j]){
                    min = graph[idx][j];
                }
            }

            if (min == Integer.MAX_VALUE){
                int a = stack.pop();
                if (stack.empty()){
                    break;
                }
                idx = stack.peek();
            }else{
                idx = min;
            }
        }

        return list.toString();
    }

    public static void dfsSolution(int x){
        boolean [] visited = new boolean[9];
        List<List<Integer>> graph = new ArrayList<>();

        visited[x] = true;

        for (int i = 0; i <graph.get(x).size() ; i++) {
            int y = graph.get(x).get(i);
            if(!visited[y]){
                dfsSolution(y);
            }
        }
    }
}
