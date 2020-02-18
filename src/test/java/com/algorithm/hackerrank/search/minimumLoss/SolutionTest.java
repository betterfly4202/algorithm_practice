package com.algorithm.hackerrank.search.minimumLoss;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private long [] a = new long[]{5, 10 ,3};
    private long [] b = new long[]{20, 7, 8, 2, 5};


    @Test
    public void 검증(){
        assertTrue(Solution.minimumLoss(a) == 2);
        assertTrue(Solution.minimumLoss(b) == 2);
    }
}