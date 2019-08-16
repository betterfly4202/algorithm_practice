package com.algorithm.practice.sorting;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */
public class SelectionSort {

    public static void main(String[] args) {

    }

    public static int[] swapArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            int tmp = arr[i];

            for(int j=i+1; j<arr.length; j++){
                if(tmp > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    tmp = arr[i];
                }
            }
        }

        return arr;
    }
}
