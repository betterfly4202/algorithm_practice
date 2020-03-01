package com.algorithm.hackerrank.sorting.bigSorting;

import java.util.*;

public class Solution {
    // https://www.hackerrank.com/challenges/big-sorting/problem
    // https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Sorting/Big%20Sorting/Solution.java
    static String[] bigSorting(String[] unsorted) {
        String result [] = null;

        Map<String, Integer> unsortedList = new LinkedHashMap<>();

        return result;
    }

    /*
        pivot(기준) 값을 정한 후,
        left - 작은값, right - 큰값 비교함
        left부터 시작해서, pivot보다 작으면 건너 띄고 left ++
        만약 left에 pivot보다 큰 값이 나오면,
        right로 넘어가서 right-- 로 비교
        만약 right에 pivot보다 작은 값이 나오면 이때 left와 right에 swap
     */

    public static void quickSort(String [] arr){
        quickSort(arr, 0, arr.length-1);

    }

    private static void quickSort(String[] arr, int start, int end) {
        int part2 = partition(arr, start, end); // 오른쪽 방 첫번쨰 값

        // part2 -1 의 의미는 오른쪽 파티션 시작점(part2)의 바로 앞(-1)을 의미함
        if(start < part2 -1){
            // 좌측 공간 정렬
            quickSort(arr, start, part2 -1);
        }
        if(part2 < end){
            quickSort(arr, part2, end);
        }
    }

    private static int partition(String[] arr, int start, int end) {
        int pivot = ((start+end) / 2)+1; // 중간 값 산정

        while(start <= end){

            while(true){
                if(arr[start].length() < arr[pivot].length()){
                    start ++;
                }else if(arr[start].length() == arr[pivot].length() && !swapEqualsLength(arr, start, end)){
                    start ++;
                }else{
                    break;
                }
            }

            while(true){
                if(arr[end].length() > arr[pivot].length()){
                    end --;
                }else if(arr[end].length() == arr[pivot].length() && !swapEqualsLength(arr, pivot, end)){
                    end --;
                }else{
                    break;
                }
            }


            if(start <= end){
                if (arr[start].length() > arr[end].length() || arr[start].length() == arr[end].length() && swapEqualsLength(arr, start, end)){
                    swap(arr, start, end);
                }
                start ++;
                end --;
            }
        }

        return start;
    }


    public static void swap(String[] arr, int left, int right) {
        String temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static boolean swapEqualsLength(String [] arr, int left, int right){
        for(int i=0; i<arr[left].length(); i++){
            int a = arr[left].charAt(i);
            int b = arr[right].charAt(i);
            if(a-b!=0 && a>b){
                return true;
            }
        }

        return false;
    }
}
