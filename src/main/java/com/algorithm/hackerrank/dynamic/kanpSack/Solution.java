package com.algorithm.hackerrank.dynamic.kanpSack;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    https://www.hackerrank.com/challenges/unbounded-knapsack/problem
 */
public class Solution {
    static int unboundedKnapsack(int k, int[] arr) {
        int result = 0;
        int max = 0;

        Arrays.sort(arr);
        if(arr[0] == 1){
            return k;
        }

        for (int i = arr.length-1; i >= 0; i--) {
            if(k % arr[i] == 0){
                return k;
            }

            if(arr[i] > k){
                continue;
            }

            result = k % arr[i];
            int cal = arr[i] * (k/arr[i]);
            max = max(max, cal);

            for (int j = 0; j < i; j++) {
                if(result % arr[j] == 0){
                    return k;
                }

                if(arr[j]+cal <= k){
                    max = arr[j]+cal;
                }
            }
        }

        return max;
    }

    private static int max(int max, int cal){
        return max > cal ? max : cal;
    }
}
