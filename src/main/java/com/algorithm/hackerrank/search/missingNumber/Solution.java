package com.algorithm.hackerrank.search.missingNumber;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by betterfly
 * Date : 2019.08.04
 */
public class Solution {
    public static Map<Integer, Integer> countMapFromArr(int [] arr){
        Map<Integer, Integer> m = new HashMap<>();
        for (int val: arr) {
            m.put(val, m.getOrDefault(val, 0)+1);
        }

        return m;
    }

    public static List<Integer> distinguishMissedValues(Map<Integer, Integer> m1,Map<Integer, Integer> m2){
        return m2.keySet()
                .stream()
                .filter(val -> m2.get(val) >m1.get(val))
                .collect(Collectors.toList());
    }

    public static void printlnResult(List<Integer> resultList){
        System.out.print(
                resultList.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(" ")));
    }
}
