package com.algorithm.youtube.bfs;

public class IcedDrink {
    public static int [][] graph = new int[1001][1001];

    public static int n;
    public static int m;
    public static int resultCount(String size, String[] lines){
        n = Integer.parseInt(size.split(" ")[0]);
        m = Integer.parseInt(size.split(" ")[1]);

        for (int i = 0; i <n ; i++) {
            String str = lines[i];
            for (int j = 0; j <m ; j++) {
                graph[i][j] = str.charAt(j)- '0';
            }
        }

        int result = 0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                if(bfs(i, j)){
                    result += 1;
                }
            }
        }
        return result;
    }

    public static boolean bfs(int x, int y){
        if(x <= -1 || x >= n || y <= -1 || y >= m){
            return false;
        }

        if(graph[x][y] == 0){
            graph[x][y] = 1;


            // graph 상하좌우 검증
            bfs(x-1, y);
            bfs(x, y-1);
            bfs(x+1, y);
            bfs(x, y+1);
            return true;
        }

        return false;

    }
}
