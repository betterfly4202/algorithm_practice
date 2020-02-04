package com.algorithm.hackerrank.greedy.candies;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    private Solution solution;

    private int [] arr1 = new int[]{1, 2, 2};
    private int [] arr2 = new int[]{2, 4, 2, 6, 1, 7, 8, 9, 2, 1};
    private int [] arr3 = new int[]{2, 4, 3, 5, 2, 6, 4, 5};

    @Before
    public void init(){
        solution = new Solution();
    }


    @Test
    public void 검증(){
        assertThat(solution.candies(3, arr1) , is(4));
        assertThat(solution.candies(10, arr2) , is(19));
        assertThat(solution.candies(8, arr3) , is(12));
    }
}