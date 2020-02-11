package com.algorithm.practice.sorting;

/**
 * Created by betterfly
 * Date : 2019.08.18
 */
public class QuickSort {
    public static int [] quickSort(int [] arr){
        quickSort(arr, 0, arr.length-1);
        return arr;
    }

    private static void quickSort(int[] arr, int start, int end) {
        int right = partition(arr, start, end);

        if(start < right-1){
            quickSort(arr, start, right -1);
        }

        if(right < end){
            quickSort(arr, right, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];

        while(start <= end){
            while(arr[start] > pivot){
                start ++;
            }
            while(arr[end] < pivot){
                end --;
            }

             if(start <= end){
                 int tmp = arr[end];
                 arr[end] = arr[start];
                 arr[start] = tmp;

                 start++;
                 end--;
             }
        }

        return start;
    }
}
