package com.algorithm.practice.sorting;

import org.junit.Test;

import java.util.Arrays;

import static com.algorithm.practice.sorting.MergeSort.mergeSort;
import static com.algorithm.practice.sorting.MergeSort.printArray;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */
public class MergeSortTest {
    private int [] sample = new int[]{6,5,1,8,7,4,3,2};
    private int [] sample2 = new int[]{4,1,7,9,22,5};

    @Test
    public void solution(){
//        printArray(sample);
        assertThat(mergeSort(sample), is(new int[]{1,2,3,4,5,6,7,8}));
        assertThat(mergeSort(sample2), is(new int[]{1,4,5,7,9,22}));
    }
}