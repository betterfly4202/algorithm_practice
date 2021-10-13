package com.algorithm.hackerrank.greedy.minimumAbsoluteDifference;

import java.util.List;
import java.util.stream.Collectors;

/*
    https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
 */
public class Solution {

    public static int minimumDifference(List<Integer> arr){
        int result = Integer.MAX_VALUE;
        arr = arr.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i <arr.size()-1 ; i++) {
            int temp = arr.get(i) - arr.get(i+1);
            if (temp < 0){
                temp = temp * -1;
            }
            if(temp <= result){
                result = temp;
            }
        }
        return result;
    }
}
