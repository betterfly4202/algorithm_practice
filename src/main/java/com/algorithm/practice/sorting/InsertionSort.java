package com.algorithm.practice.sorting;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */

/**
 * - 현재위치를 기준으로 그보다 앞선 배열들과의 값을 비교하여,
 *   비교값보다 작을 경우 index-1 의 위치한다. (O(n^2))
 */
public class InsertionSort {
    public static void main(String[] args) {

    }

    static int[] insertionSort(int [] arr){
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
