package com.algorithm.acmicpc.greedy;

public class CoinRetry {
    public static int coinZero(int [] arr, int k){
        int result = 0;

        for (int i = arr.length-1; i>=0; i--){
            if(k > arr[i]){
                result += k/arr[i];
                k = k%arr[i];
            }
        }

        return result;
    }
}