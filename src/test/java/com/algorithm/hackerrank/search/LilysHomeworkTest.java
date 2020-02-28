package com.algorithm.hackerrank.search;

import org.junit.Test;

import static com.algorithm.hackerrank.search.LilysHomework.lilysHomework;
import static org.junit.Assert.*;

public class LilysHomeworkTest {

    int [] a = {2, 5, 3, 1};
    int [] b = {7, 15, 12, 3};
    int [] c = {3, 4, 2, 5, 1};

    @Test
    public void 검증(){
        assertTrue(lilysHomework(a) == 2);
        assertTrue(lilysHomework(b) == 2);
//        assertTrue(lilysHomework(c) == 2);
    }
}