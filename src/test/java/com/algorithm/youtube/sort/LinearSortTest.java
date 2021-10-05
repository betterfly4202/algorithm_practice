package com.algorithm.youtube.sort;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LinearSortTest {

    @Test
    public void 선택_정렬_기본(){
        int [] input = {9, 5, 4, 7, 8, 1, 3, 6, 2};

        int [] result = LinearSort.basicLinearSort(input);

        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
        assertEquals(result[2], 3);
        assertEquals(result[3], 4);
        assertEquals(result[4], 5);
    }

    @Test
    public void 선택_정렬_최저정렬(){
        int [] input = {9, 5, 4, 7, 8, 1, 3, 6, 2};

        int [] result = LinearSort.basicLinearSortUseMin(input);

        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
        assertEquals(result[2], 3);
        assertEquals(result[3], 4);
        assertEquals(result[4], 5);
    }


    @Test
    public void 삽입_정렬(){
        int [] input = {9, 5, 4, 7, 8, 1, 3, 6, 2};

        InsertSort.insertSort(input);
    }

    @Test
    public void 퀵_정렬(){
        int [] input = {9, 5, 4, 7, 8, 1, 3, 6, 2};

        int [] result = QuickSort.quickSort(input, 0, 8);

        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
        assertEquals(result[2], 3);
        assertEquals(result[3], 4);
        assertEquals(result[4], 5);
    }

    @Test
    public void 병합_정렬(){
        int [] input = {9, 5, 4, 7, 8, 1, 3, 6, 2};
        int [] result = MergeSort.mergeSort(input);

        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
        assertEquals(result[2], 3);
        assertEquals(result[3], 4);
        assertEquals(result[4], 5);

    }
}