package com.algorithm.hackerrank.sorting.correctnessAndTheLoopInvariant;

import org.junit.Test;

import static com.algorithm.hackerrank.sorting.correctnessAndTheLoopInvariant.Solution.insertionSort;
import static org.junit.Assert.*;

public class SolutionTest {
    int [] A = {7,4,3,5,6,2};

    @Test
    public void test(){
        insertionSort(A);
    }
}