package com.algorithm.hackerrank.search.lilysHomework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    static int lilysHomework(int[] arr) {
        int result = 0;
        int [] ascArr  = new int [arr.length];
        int [] descArr = new int[arr.length];

        // array 복사
        System.arraycopy(arr, 0, ascArr, 0, arr.length);
        System.arraycopy(arr, 0, descArr, 0, arr.length);

        for(int i=0; i<arr.length; i++){
            descArr[i] *= -1;
        }

        Arrays.sort(descArr);
        for(int i=0; i<arr.length; i++){
            descArr[i] *= -1;
        }

        Arrays.sort(ascArr);

        Map<Integer, Integer> ascMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            ascMap.put(arr[i], i);
        }
        Map<Integer, Integer> descMap = new HashMap<>();
        for (int i = 0; i <arr.length ; i++) {
            descMap.put(arr[i], i);
        }


        /*
            map        arr
            2, 0        2
            5, 1        5
            3, 2        3
            1, 3        1
         */
        for(int i=0; i<ascMap.size(); i++){
            int temp = 0;
            if(ascArr[i] != arr[i]){
                // ascarr 의 위치를 알아야함
//                temp = ascMap.get(ascArr[i]); // 3
                int a = arr[i];
                arr[i] = ascArr[i];
                arr[temp] = a;
                result++;
            }
        }

        return result;
    }

    private static int[] swap(int[] arr, int i, int temp, int jIdx) {
        int iTemp = arr[i];
        arr[i] = temp;
        arr[jIdx] = iTemp;

        return arr;
    }

    private static int ascendingCount(int [] arr){
        int result = 0;

        for(int i=0; i<arr.length-1; i++){
            int temp = Integer.MAX_VALUE;
            int jIdx = 0;
            for(int j=i; j<arr.length; j++){
                if (temp > arr[j]){
                    temp = arr[j];
                    jIdx = j;
                }
            }

            if(temp != 0 && arr[i] > temp){
                arr = swap(arr, i, temp, jIdx);
                result ++;
            }
        }

        return result;
    }

    private static int descendingCount(int [] arr){
        int result = 0;

        for(int i=0; i<arr.length-1; i++){
            int temp = 0;
            int jIdx = 0;
            for(int j=i; j<arr.length; j++){
                if (temp < arr[j]){
                    temp = arr[j];
                    jIdx = j;
                }
            }

            if(temp != 0 && arr[i] < temp){
                arr = swap(arr, i, temp, jIdx);
                result ++;
            }
        }

        return result;
    }
}
