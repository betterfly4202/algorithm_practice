package com.algorithm.practice.sorting;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */
public class InsertionSort {
    public static void main(String[] args) {

    }

    public static int[] insertionSort(int [] arr){
        if(arr.length < 2){
            throw new IllegalStateException("array size more than 2.");
        }

        for(int i=1; i<arr.length; i++){
            int temp = arr[i];

            for(int j=i-1; j>=0; j--){
                int v = arr[j];
                if(temp < arr[j]){
                    arr[j] = temp;
                    arr[j+1] = v;
                    temp = arr[j];
                }
            }
        }

        return arr;
    }
}
