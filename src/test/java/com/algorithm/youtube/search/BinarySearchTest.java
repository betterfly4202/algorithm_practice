package com.algorithm.youtube.search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    @Test
    public void 이진_탐색(){
        int [] arr = {2,4,6,8,10,12,14,16,18,20};

        assertEquals(BinarySearch.binary(arr, 4), 1);;
        assertEquals(BinarySearch.binary(arr, 8), 3);;
        assertEquals(BinarySearch.binary(arr, 14), 6);;
        assertEquals(BinarySearch.binary(arr, 16), 7);;
        assertEquals(BinarySearch.binary(arr, 20), 9);;
    }
}