package com.algorithm.hackerrank.sorting.runningTimeofAlgorithms;

import org.junit.Test;

import static com.algorithm.hackerrank.sorting.runningTimeofAlgorithms.Solution.runningTime;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    
    @Test
    public void test(){
        // when
        int [] arr  = {2, 1, 3, 1, 2};
        int [] arr2 = {4, 4, 3, 4};

        // then
        assertThat(runningTime(arr), is(4));
        assertThat(runningTime(arr2), is(2));
    }
}