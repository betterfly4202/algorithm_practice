package com.algorithm.practice.sorting;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */

/**
 *  분할정복(Divide and Conquer) 방식의 알고리즘.
 *  (*분할 정복 : 반으로 쪼개서 문제를 해결하는 방식)
 *  [분할]한 배열의 크기가 1 보다 작거나 같을때까지 계속해서 분할한다.
 *  [합병]은 두개의 배열을 비교하여, 기준(크거나 작은)에 맞는 값을 다른 배열에 저장한다.
 *  A,B 값을 비교하여, A의 값이 더 작다면 -> 새 배열에 저장해주고 A 의 인덱스를 증가 시킨후 반복한다.
 *  위 작업을 반복하다보면 새 배열에 저장된 값과, 저장되지 않은 값으로 분류된다.
 *
 */
public class MergeSort {

    /*
    https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html
     */
    static int [] mergeSort(int [] arr){
        int [] temp = new int [arr.length];
        mergeSort(arr, temp, 0, arr.length-1);

        return arr;
    }

    static void mergeSort(int[] arr, int [] tmp, int start,int end){
        if(start < end){
            int mid = (start + end) / 2;
            mergeSort(arr, tmp, start, mid);
            mergeSort(arr, tmp, mid+1, end);
            merge(arr, tmp, start, mid, end);
        }
    }

    private static void merge(int[] arr, int [] tmp, int start, int mid, int end){
        for(int i = start ; i<=end; i++){
            tmp[i] = arr[i];
        }

        int lArr = start;
        int rArr = mid+1;
        int idx = start;

        while(lArr <= mid && rArr <= end){
            if(tmp[lArr] <= tmp[rArr]){
                arr[idx] = tmp[lArr];
                lArr++;
            }else {
                arr[idx] = tmp[rArr];
                rArr++;
            }

            idx++;
        }

        for(int i=0; i<= mid-lArr; i++){
            arr[idx + i] = tmp[lArr + i];
        }
    }

    static void printArray(int [] arr){
        for(int v : arr){
            System.out.print(v + " , ");
        }
    }
}
