package com.algorithm.hackerrank.search.radioTransmitter;

import java.util.*;

/**
 * Created by betterfly
 * Date : 2019.08.04
 * URL : https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 */
public class Solution {
    public static int neededTransmitter(int[] k, int range){
        Map<Integer, Boolean> m = houseLocationWithMap(k);

        List<Integer> transList = new ArrayList<>();

        for(Map.Entry<Integer, Boolean> tMap : m.entrySet()){
            int key = tMap.getKey();
            int stdKey = key+range;

            if(stdKey >= getMaxKeyValue(m)){
                transList.add(key);
                break;
            }

            if (!m.get(key) && m.containsKey(stdKey)){
                for(int i = key; i <= stdKey + range; i++){
                    if(m.containsKey(i)){
                        m.replace(i, true);
                    }
                }

                transList.add(stdKey);
            }else{
                if(!m.get(key) && m.containsKey(key)){
                    transList.add(key);
                }
            }
        }

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
        return m.keySet().stream()
                .mapToInt(k -> k).filter(k -> k >= 0).max().orElse(0);
    }
}