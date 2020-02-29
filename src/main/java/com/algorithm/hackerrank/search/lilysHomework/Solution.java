package com.algorithm.hackerrank.search.lilysHomework;

public class Solution {
    static int lilysHomework(int[] arr) {
        int desc [] = new int[arr.length];
        for(int i=0 ; i<arr.length; i++){
            desc[i] = arr[i];
        }
        int ascCount = ascendingCount(arr);
        int descCount = descendingCount(desc);


        return ascCount > descCount ? descCount : ascCount;
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
