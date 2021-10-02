package com.algorithm.youtube.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class IcedDrink {
    public static int resultCount(String size, String[] lines){
        int result = 0;
        Queue<Integer> q = new LinkedList<>();
        int horizon = Integer.parseInt(size.split(" ")[0]);
        int vertical = Integer.parseInt(size.split(" ")[1]);

        boolean [][] checked = new boolean[horizon][vertical];

        for (int i = 0; i <horizon ; i++) {
            for (int j = 0; j <vertical ; j++) {
                if(isClosed(lines[i].charAt(j))){
                    checked[i][j] = true;
                }
                System.out.print(lines[i].charAt(j));
            }

            System.out.println("\n========");
        }

        int idx = 0;
        while(true){
//            lines[idx]

            idx ++;
            break;
        }

        return result;
    }

    private static boolean isClosed(char c){
        if(c == '0'){
            return true;
        }

        return false;
    }
}
