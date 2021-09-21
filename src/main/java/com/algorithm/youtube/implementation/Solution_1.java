package com.algorithm.youtube.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution_1 {
    public static String getVector(int n, String xy){
        List<String> list = Arrays.stream(xy.split(" ")).collect(Collectors.toList());

        int x = 1;
        int y = 1;

        for (int i = 0; i <list.size() ; i++) {
            switch(list.get(i)){
                case "R" :
                    if(y+1 < 100){
                        y++;
                    }
                    break;
                case "L" :
                    if (y-1 > 0){
                        y --;
                    }
                    break;
                case "U" :
                    if (x-1 > 0){
                        x--;
                    }
                    break;
                case "D" :
                    if (x+1 < 100){
                        x++;
                    }
                    break;
            }
        }


        return x+" "+y;
    }

    public static String sampleVector(int n, String plan){
        int x = 1, y =1;
        int[] dx = new int[]{0, 0, -1, 1};
        int[] dy = new int []{-1, 1, 0, 0};
        String[] moveTypes = new String[]{"L", "R", "U", "D"};

        String [] plans = plan.split(" ");
        for (int i = 0; i < plans.length ; i++) {
            String p = plans[i];
            int nx= -1, ny = -1;

            for (int j = 0; j < 4; j++) {
                if (p.equals(moveTypes[j])){
                    nx = x + dx[j];
                    ny = y + dy[j];
                }
            }

            if(nx < 1 || ny < 1 || nx > n || ny > n){
                System.out.println(ny);
                continue;
            }
            x = nx;
            y = ny;
        }

        return x + " " + y;
    }
}
