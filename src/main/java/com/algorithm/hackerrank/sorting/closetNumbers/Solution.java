package com.algorithm.hackerrank.sorting.closetNumbers;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/*
    https://www.hackerrank.com/challenges/closest-numbers/problem
 */
public class Solution {
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        Map<Integer, List<Integer>> gapMapList = new HashMap<>();

        for (int i = 0; i <arr.length-1 ; i++) {
            int gap_a = arr[i] - (arr[i+1]);
            int gap_b = arr[i+1] - (arr[i]);

            int gap = gap_a > gap_b ? gap_a : gap_b;

            List<Integer> list = new LinkedList<>();
            list.add(arr[i]);
            list.add(arr[i+1]);

            if(gapMapList.get(gap) != null){
                gapMapList.get(gap).add(arr[i]);
                gapMapList.get(gap).add(arr[i+1]);
            }else{
                gapMapList.put(gap, list);
            }
        }

        AtomicInteger findKey = new AtomicInteger(Integer.MAX_VALUE);
        gapMapList.keySet().forEach(k ->{
            if(findKey.get() > k){
                findKey.set(k);
            }
        });

        List<Integer> resultList = gapMapList.get(findKey.get());
        int [] result = new int [resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);

        }

        return result;
    }
}
