package com.algorithm.pragrammers.sort.biggestNumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution solution;

    @Before
    public void init(){
        solution = new Solution();
    }

    @Test
    public void test(){
        //given
        int [] n1 = {6, 10, 2};
        int [] n2 = {3, 30, 34, 5, 9};

        //when
//        String result1 = solution.solution(n1);
        String result2 = solution.solution(n2);

        //then
//        assertTrue(result1.equals("6210"));
        assertTrue(result2.equals("9534330"));
    }

    @Test
    public void 숫자_조각내기(){
        //given
        int [] n1 = {6, 10, 2};
        int [] n2 = {3, 30, 34, 5, 9};

        Map<Integer, List<Integer>> m = solution.sortMap(n2);

        assertTrue(m.get(3).size() == 3);
        assertTrue(m.get(5).get(0) == 5);
    }

    @Test
    public void 숫자_합치기(){
        List<Integer> list = Arrays.asList(10,7,8,3,2);
        String result = solution.combineReverseArray(list);

        assertTrue(result.equals("107832"));
    }
}