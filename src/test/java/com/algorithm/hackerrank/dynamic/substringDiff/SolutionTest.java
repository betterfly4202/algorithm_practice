package com.algorithm.hackerrank.dynamic.substringDiff;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    /*
        2 tabriz torino
        0 abacba abcaba
        3 helloworld yellomarin


        tabr
        tori
     */

    @Test
    public void 검증(){
        assertThat(Solution.substringDiff(2,"tabriz", "torino"), is(4));
        assertThat(Solution.substringDiff(0,"abacba", "abcaba"), is(3));
        assertThat(Solution.substringDiff(3,"yellomarin", "helloworld"), is(8));
    }
}