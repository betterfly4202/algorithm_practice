package com.algorithm.hackerrank.search.sherlockAndArray;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    /*
        5
        1 1 4 1 1
        4
        2 0 0 0
        4
        0 0 2 0
     */

    @Test
    public void 검증(){
        assertThat(Solution.balancedSums(Arrays.asList(1,1,4,1,1)), is("YES"));;
        assertThat(Solution.balancedSums(Arrays.asList(2,0,0,0)), is("YES"));;
        assertThat(Solution.balancedSums(Arrays.asList(0,0,2,0)), is("YES"));;
        assertThat(Solution.balancedSums(Arrays.asList(5,6,8,11)), is("YES"));;
        assertThat(Solution.balancedSums(Arrays.asList(5,7,8,11)), is("NO"));;
    }

}