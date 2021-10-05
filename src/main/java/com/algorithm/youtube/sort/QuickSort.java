package com.algorithm.youtube.sort;

public class QuickSort {
    public static int[] quickSort(int[] arr, int start, int end){
        if(start>= end){  // 원소가 1개인 경우 종료함
            return arr;
        }

        int pivot = start;  // 피벗은 첫번째 원소
        int left = start+1;
        int right = end;

        while(left <= right){

            // pivot보다 큰 데이터를 찾을때까지 반복
            while(left <= end && arr[left] <= arr[pivot]){
                left++;
            }

            // pivot보다 작은 데이터를 찾을때까지 반복
            while(right > start && arr[right] >= arr[pivot]){
                right--;
            }

            // 엇갈렸다면 작은 데이터와 피벗을 교체
            if(left > right){
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }

            // 엇갈리지 않았다면 작은 데이터와 큰 데이터를 교체
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        // 최초 분할한 이후 왼쪽과 오른쪽 부분을 각각 정렬함
        quickSort(arr, start, right -1);
        quickSort(arr, right + 1, end);

        return arr;
    }
}
