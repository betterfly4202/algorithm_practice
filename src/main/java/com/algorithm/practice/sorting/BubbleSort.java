package com.algorithm.practice.sorting;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */


/**
 * 1. 연속된 두 배열을 비교한다.
 * 2. 비교시 큰 값을 기준값+1 로 뒤로 보낸다
 * 3. 위 절차를 array.length 만큼 반복한다 (O(n^2))
 */
public class BubbleSort {

    static int [] bubbleSort(int [] arr){
        for(int k=0; k<arr.length; k++){
            for(int i=0; i<arr.length-1; i++){
                if(arr[i] > arr[i+1]){
                    int tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {

    }
}
