package com.algorithm.practice;

import org.junit.Test;

import static com.algorithm.practice.Solution_4.resultVal;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.07
 */
public class Solution_4Test {
    int a = 268;
    int b = 670;
    int c = 0;
    int d = 5550;
    int e = -999;
    int f = -221;

    @Test
    public void 검증(){
        assertThat(Integer.parseInt(resultVal(a)), is(5268));
        assertThat(Integer.parseInt(resultVal(b)), is(6750));
        assertThat(Integer.parseInt(resultVal(c)), is(50));
        assertThat(Integer.parseInt(resultVal(d)), is(5550));
        assertThat(Integer.parseInt(resultVal(e)), is(999));
        assertThat(Integer.parseInt(resultVal(f)), is(-5221));
    }
}