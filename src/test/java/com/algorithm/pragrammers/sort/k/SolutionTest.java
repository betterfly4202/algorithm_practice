package com.algorithm.pragrammers.sort.k;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class SolutionTest {
    int [] array  = {1, 5, 2, 6, 3, 7, 4};
    int [][] commands = {{2,5,3}};

    /*
    1. i~j까지
    2. 정렬
    3. k번째 수
     */
    private Solution s;

    @Before
    public void init(){
        s = new Solution();
    }


    @Test
    public void 새_배열_구성(){
        int [] r = s.splitArrayAndSort(array, 2, 5);

        assertTrue(r.length == 4);
        assertTrue(r[0] == 2);
        assertTrue(r[3] == 6);
    }

    @Test
    public void k_번째_찾기(){
        int [] r = s.splitArrayAndSort(array, 2, 5);
        int result = s.findTarget(r, 3);

        assertTrue(result == 5);
    }

    @Test
    public void test(){
        int [] array  = {1, 5, 2, 6, 3, 7, 4};
        int [][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};

        int [] result = s.solution(array, commands);

        assertTrue(result[0] == 5);
        assertTrue(result[1] == 6);
        assertTrue(result[2] == 3);
    }
}