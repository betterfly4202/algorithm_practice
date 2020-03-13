package com.algorithm.hackerrank.search.sherlockAndArray;

import java.util.List;

public class Solution {

    static String balancedSums(List<Integer> arr) {
        int sum = arr.stream().mapToInt(v -> v.intValue()).sum();

        int currentSum = 0;
        for (int i = 0; i < arr.size(); i++) {

            if(currentSum == sum - arr.get(i) - currentSum){
                return "YES";
            }

            currentSum += arr.get(i);
        }

        return "NO";
    }
}
