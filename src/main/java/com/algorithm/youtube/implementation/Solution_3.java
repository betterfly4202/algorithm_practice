package com.algorithm.youtube.implementation;

import java.util.Arrays;
import java.util.List;

public class Solution_3 {
    /*
        말이 이동할 수 있는 모든 거리의 수를 구하여라.
        8 x 8
        a~h
        1~8
     */
    public static int nightMovingCount(String stater){
        int cnt = 0;
        List<String> x = Arrays.asList("a","b","c","d","e","f","g","h");
        List<Integer> y = Arrays.asList(1,2,3,4,5,6,7,8);

        String xStart = String.valueOf(stater.charAt(0));

        int [][] left  = new int[][]{{-2, 1}, {-2, -1}};
        int [][] right = new int[][]{{2, 1}, {2, -1}};
        int [][] up    = new int[][] {{-1, -2}, {1, -2}};
        int [][] down  = new int[][]{{-1, 2}, {1, 2}};

        int xPoint = -1;
        int yPoint = Integer.parseInt(String.valueOf(stater.charAt(1)));

        for (int i = 0; i <x.size() ; i++) {
            if(x.get(i).equals(xStart)){
                xPoint = i+1;
                break;
            }
        }


        /*
            left
         */
        if(isXLine(xPoint, yPoint, left)){
            cnt++;
        }
        if(isYLine(xPoint, yPoint, left)){
            cnt++;
        }

        /*
            right
         */
        if(isXLine(xPoint, yPoint, right)){
            cnt++;
        }
        if(isYLine(xPoint, yPoint, right)){
            cnt++;
        }

        /*
            up
         */
        if(isXLine(xPoint, yPoint, up)){
            cnt++;
        }
        if(isYLine(xPoint, yPoint, up)){
            cnt++;
        }

        /*
            down
         */
        if(isXLine(xPoint, yPoint, down)){
            cnt++;
        }
        if(isYLine(xPoint, yPoint, down)){
            cnt++;
        }

        return cnt;
    }

    private static boolean isXLine(int x, int y , int [][] arr){
        if(x + arr[0][0] > 0 && y +arr[0][1] > 0 && x + arr[0][0] < 9 && y +arr[0][1] < 9){
            return true;
        }

        return false;
    }

    private static boolean isYLine(int x, int y , int [][] arr){
        if(x + arr[1][0] > 0 && y +arr[1][1] > 0 && x + arr[1][0] < 9 && y +arr[1][1] < 9){
            return true;
        }

        return false;
    }
}
