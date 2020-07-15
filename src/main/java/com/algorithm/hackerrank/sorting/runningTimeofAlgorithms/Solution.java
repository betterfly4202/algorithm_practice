package com.algorithm.hackerrank.sorting.runningTimeofAlgorithms;

public class Solution {

    static int runningTime(int[] arr) {
        int cnt = 0;
        for (int i = 1; i <arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
