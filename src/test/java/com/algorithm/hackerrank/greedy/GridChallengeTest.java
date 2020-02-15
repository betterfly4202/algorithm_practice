package com.algorithm.hackerrank.greedy;

import org.junit.Test;
import org.junit.runner.notification.RunListener;

import static org.junit.Assert.*;

public class GridChallengeTest {

    private GridChallenge challenge;
    private String [] gridSample = {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"};
    private String [] gridSample2 = {"kc", "iu"};
    private String [] gridSample3 = {"uxf", "vof", "hmp", "iu"};
    @Test
    public void SolutionTest(){
        assertTrue(GridChallenge.solution(gridSample).equals("YES"));
        assertTrue(GridChallenge.solution(gridSample2).equals("YES"));
        assertTrue(GridChallenge.solution(gridSample3).equals("NO"));
    }

    @Test
    public void 아스키(){
        String name = "betterFLY";
        char character = name.charAt(0);
        System.out.println((int)character);
    }

    @Test
    public void  sort(){
        String [] aa = GridChallenge.sort(gridSample2);


    }

    @Test
    public void 아스키_문자열(){
        int a = 65;

        System.out.println((char)a);
    }
}