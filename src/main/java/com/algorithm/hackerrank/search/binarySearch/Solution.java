package com.algorithm.hackerrank.search.binarySearch;

public class Solution {
    // 이미 정렬되었다는 가정하에, 전체 배열의 중간 값을 기준으로, 크고 작은 값을 찾으면됨


    public static int binarySearch(int [] arr, int find, int start, int end){

        int pivot = (start + end)/2;
        if(start > end){
            return -1;
        }
        if (arr[pivot] == find){
            return pivot;
        }

        if (arr[pivot] < find){
            return binarySearch(arr, find, 0, pivot-1);
        }else{
            return binarySearch(arr, find, pivot, arr.length);
        }
    }
}
