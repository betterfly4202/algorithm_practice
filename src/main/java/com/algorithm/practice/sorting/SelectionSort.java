package com.algorithm.practice.sorting;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */

/**
 * index[0]의 위치에서 index++ 씩 비교하여,
 * 현재 인덱스의 값보다 작을 경우 두 배열의 값을 선택적으로 변경해준다 (O(n^2))
 */
public class SelectionSort {

    public static void main(String[] args) {

    }

    static int[] swapArray(int [] arr){
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
