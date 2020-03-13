package com.algorithm.hackerrank.diagonalDifference;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    /*
        1 2 3
        4 5 6
        9 8 9

        3 9 1 2
        1 2 3 4
        6 7 8 9
        5 3 9 4
     */

    @Test
    public void 검증(){
        List<List<Integer>> listA = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(4,5,6), Arrays.asList(9,8,9));
        assertThat(Solution.diagonalDifference(listA), is(2));
    }

}