package com.algorithm.yanolja;

import org.junit.Test;

import static org.junit.Assert.*;


/*

    int [] A = new int[5,2,4,6,3,7]
 */
public class FourTest {
    int [] A = new int[] {5,2,4,6,3,7};

    @Test
    public void aaa(){
        assertTrue(Four.solution(A) == 5);
    }

}