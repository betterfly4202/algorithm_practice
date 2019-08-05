package com.algorithm.hackerrank.search.radioTransmitter;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by betterfly
 * Date : 2019.08.04
 * URL : https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 */
public class Solution {
    public static int neededTransmitter(int[] k, int x){
        Map<Integer, Boolean> m = houseLocationWithMap(k);
        int range = x;
        List<Integer> transList = new ArrayList<>();
//        m.forEach((key, value) -> {
//            if (!m.get(key)){
//                int stdKey = key+range;
//
//                if (m.containsKey(stdKey)) {
//                    for(int i = stdKey - range; i <= stdKey + range; i++){
//                        if(m.containsKey(i)){
//                            m.replace(i, true);
//                        }
//                    }
//                    transList.add(stdKey);
//                }else{
//                    m.replace(key, true);
//                    transList.add(key);
//                }
//            }
//        });

        return transList.size();
    }

    public static Map<Integer, Boolean> houseLocationWithMap(int [] k){
        Map<Integer, Boolean> m = new HashMap<>();
        for(int val : k){
            m.put(val, false);
        }

        return m;
    }

    public static int getMaxKeyValue(Map<Integer, Boolean> m ){
        return m.keySet().stream().mapToInt(k -> k).filter(k -> k >= 0).max().orElse(0);
    }
}