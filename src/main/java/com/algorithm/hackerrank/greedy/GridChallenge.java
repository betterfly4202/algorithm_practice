package com.algorithm.hackerrank.greedy;

import java.util.Arrays;

/**
 * Created by betterfly
 * Date : 2020.02.15
 */

// https://www.hackerrank.com/challenges/grid-challenge/problem
public class GridChallenge {
    static String solution(String[] grid) {
        grid = sort(grid);
        for(int i=0; i<grid[0].length(); i++){
            int temp = (int)grid[0].charAt(i);

            for(int j=1; j<grid.length; j++){
                if(temp > grid[j].charAt(i)){
                    return "NO";
                }

                temp = grid[j].charAt(i);
            }
        }

        return "YES";
    }

    public static String [] sort(String [] grid){
        int [] arr = new int[grid[0].length()];

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length(); j++){
                arr[j] =(int)grid[i].charAt(j);
            }

            Arrays.sort(arr);
            grid[i] = rerange(arr);
        }

        return grid;
    }

    private static String rerange(int [] arr){
        String result = "";
        for(int i=0; i<arr.length; i++){
            result += (char)arr[i];
        }
        return result;
    }
}
