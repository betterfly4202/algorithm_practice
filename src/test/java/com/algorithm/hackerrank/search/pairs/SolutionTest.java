package com.algorithm.hackerrank.search.pairs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/*
    5 2
    1 5 3 4 2
 */
public class SolutionTest {
    int [] a = {1,5,3,4,2};
    int [] b = {1,3,5,8,6,4,2};

    @Test
    public void 검증(){
        assertThat(Solution.pairs(2,a), is(3));
        assertThat(Solution.pairs(2,b), is(5));

//        assertThat(Solution.upParis(2,a), is(3));
//        assertThat(Solution.upParis(2,b), is(5));
    }
}