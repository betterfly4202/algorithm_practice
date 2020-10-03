package com.algorithm.pragrammers.sort.biggestNumber;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

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
        int [] n3 = {3, 30, 34, 345, 5, 9};

        //when
//        String result1 = solution.solution(n1);
        String result2 = solution.solution(n2);
        String result3 = solution.solution(n3);

        //then
//        assertTrue(result1.equals("6210"));
//        assertTrue(result2.equals("9534330"));
        assertTrue(result3.equals("9534534330"));
    }

    @Test
    public void 숫자_조각내기(){
        //given
        int [] n1 = {6, 10, 2};
        int [] n2 = {3, 30, 34, 5, 9};


        Map<Integer, List<String>> m = solution.sortMap(n2);

        assertTrue(m.get(3).size() == 3);
    }

    @Test
    public void 숫자_합치기(){
        List<String> list = Arrays.asList("10","7","8","3","2");
        String result = solution.combineReverseArray(list);

        assertTrue(result.equals("107832"));
    }

    @Test
    public void array_재정렬(){
        //given
        List<String> list = new LinkedList<>(Arrays.asList("347", "34", "3", "30"));

//        //when
        String input = "32135";
        List<String> result = solution.compareAdd(list, input);
//
        System.out.println(result);
    }
}