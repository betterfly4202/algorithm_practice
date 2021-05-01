package com.algorithm.hackerrank.sorting.countingSort;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.hackerrank.com/challenges/countingsort1/problem
public class Solution {
    public static List<Integer> countingSort(List<Integer> arr) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            result.add(0);
        }

        for (int i = 0; i < arr.size(); i++) {
            result.set(arr.get(i), result.get(arr.get(i))+1);
        }

        return result;
    }
}
