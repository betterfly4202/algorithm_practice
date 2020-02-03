package com.algorithm.practice.sorting;

import org.junit.Test;

import static com.algorithm.practice.sorting.QuickSort.quickSort;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.19
 */
public class QuickSortTest {
    private int [] sample = new int[]{6,5,1,8,7,4,3,2};
    private int [] sample2 = new int[]{4,1,7,9,22,5};

    @Test
    public void solution(){
//        assertThat(quickSort(sample), is(new int[]{1,2,3,4,5,6,7,8}));
//        assertThat(quickSort(sample2), is(new int[]{1,4,5,7,9,22}));
    }

    @Test
    public void 내림차순(){
        assertThat(quickSort(sample), is(new int[]{8,7,6,5,4,3,2,1}));
    }

    @Test
    public void 테스트_검증(){
        sort();
    }

    private void printArray(){
        for(int v : sample){
            System.out.print(v + ", ");
        }
        System.out.println();
    }

    private void sort(){
        printArray();
        sort(sample, 0, sample.length-1);
    }

    private void sort(int []arr, int start, int end){
        int right = partition(arr, start, end);

        if(start < right - 1){
            sort(arr, start, right-1);
            printArray();
        }

        if(right < end){
            sort(arr, right, end);
            printArray();
        }
    }

    private int partition(int []arr, int start, int end){
        int pivot = arr[(start + end)/2];
        System.out.println("pivot : " +pivot);
        while(start <= end){
            while(arr[start] < pivot){
                start ++;
            }

            while(arr[end] > pivot){
                end --;
            }

            if(start <= end){
                int tmp = sample[end];
                arr[end] = sample[start];
                arr[start] = tmp;
                start++;
                end--;
            }
        }

        return start;
    }
}