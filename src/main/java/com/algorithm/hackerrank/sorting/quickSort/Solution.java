package com.algorithm.hackerrank.sorting.quickSort;

public class Solution {
    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int idx = arr.length/2;
        int pivot = arr[idx];

        // left
        int [] left = new int[arr.length];
        int [] right = new int[arr.length];
        for (int i = 0; i <idx ; i++) {
            int index = 0;
            if(arr[i] < pivot){
                left[index] = arr[i];
                index++;
            }
        }

        // right
        for (int i = idx; i <arr.length ; i++) {
            int index = idx;
            if(arr[i] >= pivot){
                right[index] = arr[i];
                index++;
            }
        }

        return arr;
    }
}
