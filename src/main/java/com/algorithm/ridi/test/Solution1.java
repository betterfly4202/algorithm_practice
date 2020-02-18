package com.algorithm.ridi.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution1 {

    public static boolean solution(int[] arr) {
        int [] oriArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            oriArr[i] = arr[i];
        }

        Arrays.sort(arr);
        Map<Integer, Integer> map =
                IntStream.range(0, arr.length)
                        .boxed()
                        .collect(Collectors.toMap(
                                idx-> arr[idx], Function.identity()));

        for(int i=0; i<oriArr.length-1; i++){
            if(Math.abs(map.get(oriArr[i]) - map.get(oriArr[i+1])) > 1){
                if(map.containsKey(oriArr[i+2])){
                    return false;
                }
            }

            map.remove(oriArr[i]);
        }

        return true;
    }

    public static int solutions(int n){
        int target = targetValue(n);
        int result = 0;
        for(int i=1; i<n; i++){
            if(targetValue(i) == target){
                result ++;
            }
        }

        return result;
    }

    private static int targetValue(int n){
        int result = 0;
        while(n != 1){
            if(n%2 == 1){
                result ++;
            }
            n = n/2;
        }
        if (n == 1) {
            result ++;
        }

        return result;

    }
}