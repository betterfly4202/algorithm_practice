package com.algorithm.hackerrank.dynamic.kanpSack;


/*
    https://www.hackerrank.com/challenges/unbounded-knapsack/problem
 */
public class Solution {
    static int unboundedKnapsack(int k, int[] arr) {
        boolean [] bucket = new boolean[k+1];

        for (int i = 0; i < arr.length ; i++) {
            int sum = arr[i];

            while(sum <= k){
                bucket[sum] = true;

                for (int j = 0; j < bucket.length; j++) {
                    if(bucket[j] && j+sum <= k){
                        bucket[j+sum] = true;
                    }
                }

                sum+=sum;
            }
        }
        int result = 0;
        for (int i = bucket.length-1; i >= 0; i--) {
            if(bucket[i]){
                result = i;
                break;
            }
        }
        return result;
    }
}
