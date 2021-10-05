package com.algorithm.youtube.bfs;

import java.util.Stack;

public class FindMiro {
    public static int [][] board;
    public static int [][] checked;
    public static int n;
    public static int m;
    public static Stack<int[][]> q =  new Stack<>();
    public static Stack<Integer> stack =  new Stack<>();
    public static int resultCount(String size, String[] lines){
        n = Integer.parseInt(size.split(" ")[0]);
        m = Integer.parseInt(size.split(" ")[1]);
        board = new int[n][m];
        checked = new int[n][m];

        for (int i = 0; i < n ; i++) {
            String str = lines[i];
            for (int j = 0; j < m ; j++) {
                board[i][j] = Integer.parseInt(String.valueOf(str.charAt(j)));
            }
        }
        checked[0][0] = 1;
        q.push(checked);
        stack.push(1);
        bfs(0,0);
        return stack.pop();
    }

    public static void bfs(int x, int y){

        if(board[x][y] == 1){
            bfs(x + 1, y);
        }else{

        }
    }
}
