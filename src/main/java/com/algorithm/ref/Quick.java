package com.algorithm.ref;

import static java.util.Collections.swap;

public class Quick {
    public static void quickSort(int arr[], int l, int r){
        if(l < r){
            int p = partition(arr, l, r);
        }
    }

    public static int partition(int arr[], int l, int r){
        int pivot = arr[r];
        int i = (l-1);

        for(int j=l; j<=r-1; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i+1, r);

        return i+1;
    }

    private static void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }
}
