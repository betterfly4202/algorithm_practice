package com.algorithm.youtube.search;

public class BinarySearch {
    public static int binary(int[] arr, int n){
        int start = 0;
        int mid;
        int end = arr.length;

        while(start <=  end){
            mid = (start + end) /2;

            if (arr[mid] == n){
                return mid;
            }else if(arr[mid] > n){
                end = mid -1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
}
