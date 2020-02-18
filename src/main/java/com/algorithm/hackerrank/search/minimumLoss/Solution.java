package com.algorithm.hackerrank.search.minimumLoss;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * https://www.hackerrank.com/challenges/minimum-loss/problem
 */
public class Solution {
    static int minimumLoss(long[] price) {
        long minValue = Long.MAX_VALUE;
        Map<Long, Integer> map =
        IntStream.range(0, price.length)
                .boxed()
                .collect(Collectors.toMap(
                        idx-> price[idx], Function.identity()));

        Arrays.sort(price);
        for(int i=1; i<price.length; i++){
            if(map.get(price[i]) < map.get(price[i-1])){
                long cal = price[i] - price[i-1];

                if(cal > 0 && minValue > cal){
                    minValue = cal;
                }
            }
        }

        return (int) minValue;
    }
}
