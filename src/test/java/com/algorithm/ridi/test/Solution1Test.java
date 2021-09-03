package com.algorithm.ridi.test;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Solution1Test {

    private int [] a = {5, 7, 3, 4};
    private int [] b = {1, 3, 2};
    @Test
    public void 테스트(){
//        assertFalse(Solution1.solution(a));;
        assertFalse(Solution1.solution(b));;
    }


    @Test
    public void asdf(){
        assertThat(Solution1.solutions(9), is(3));
    }
}