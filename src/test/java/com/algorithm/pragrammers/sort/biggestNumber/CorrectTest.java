package com.algorithm.pragrammers.sort.biggestNumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CorrectTest {
    private Correct correct;

    @Before
    public void init(){
        correct = new Correct();
    }

    @Test
    public void test(){
        //given
        int [] n1 = {6, 10, 2};
        int [] n2 = {3, 30, 34, 5, 9};
        int [] n3 = {3, 30, 34, 345, 5, 9};

        //when
        String result1 = correct.solution(n1);
        String result2 = correct.solution(n2);
        String result3 = correct.solution(n3);

        //then
        assertTrue(result1.equals("6210"));
        assertTrue(result2.equals("9534330"));
        assertTrue(result3.equals("9534534330"));
    }
}