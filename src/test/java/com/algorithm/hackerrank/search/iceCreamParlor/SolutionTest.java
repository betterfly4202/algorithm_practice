package com.algorithm.hackerrank.search.iceCreamParlor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    int a [] = new int[]{1,4,5,3,2};
    int b [] = new int[]{2,2,4,3};

    @Test
    public void 검증(){
        assertThat(Solution.icecreamParlor(4, a), is(new int[]{1,4}));
        assertThat(Solution.icecreamParlor(4, b), is(new int[]{1,2}));
    }
}