package com.algorithm.hackerrank.greedy.minimumAbsoluteDifference;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void 절대값_차이계산(){
        assertEquals(Solution.minimumDifference(Arrays.asList(-3, 7, 0)), 3);
        assertEquals(Solution.minimumDifference(Arrays.asList(-59,-36,-13,1,-53,-92,-2,-96,-54,75)), 1);
        assertEquals(Solution.minimumDifference(Arrays.asList(1, -3, 71, 68, 17)), 3);
    }
}