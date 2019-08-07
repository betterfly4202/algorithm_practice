package com.algorithm.practice;

/**
 * Created by betterfly
 * Date : 2019.08.07
 */
public class Solution_2 {
    public static void main(String[] args) {

    }

    public static int getRandomValue(int t){
        long MAX = 1_000_000_000;
//        long MAX = 100;
        return (int) (Math.random() * (MAX - t + 1)) + t+1;
    }

    public static int resultValue(int v){
        return 10 - (v % 10);
    }
}
