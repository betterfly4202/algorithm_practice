package com.algorithm.yanolja;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class SampleTest {
    public int solution(int[] A) {
        int result [] = quickSort(A);
        int a = 1;
        for (int i=0; i<result.length; i++){
            if(result.length > i+1 && result[i]>1){
                int sample = result[i+1] - result[i];
                if(sample > 1){
                    a = result[i]+1;
                    break;
                }
            }
            a = result[result.length-1] +1;
        }

        if(a < 0){
            a = 1;
        }

        return a<0 ? 1 : a;
    }

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

            // 내림차순
//            while(arr[start] > pivot){
//                start ++;
//            }
//            while(arr[end] < pivot){
//                end --;
//            }

            // 오름차순
            while(arr[start] < pivot){
                start ++;
            }
            while(arr[end] > pivot){
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
