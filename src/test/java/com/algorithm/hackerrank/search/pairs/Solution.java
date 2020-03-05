package com.algorithm.hackerrank.search.pairs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// https://www.hackerrank.com/challenges/pairs/problem
public class Solution {
    static int pairs(int k, int[] arr) {
        int result = 0;

        Map<Integer, Integer> calMap = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            if(calMap.containsKey(arr[i])){
                result += calMap.get(arr[i]);
            }

            if (arr[i] - k > 0) {
                calMap.compute(arr[i] - k, (key, val)-> (val==null) ? 1 : val +1);
            }
            calMap.compute(arr[i] + k, (key, value) -> (value == null) ? 1 : value + 1);
        }
        return result;
    }
}
