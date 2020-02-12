package com.algorithm.yanolja;

import org.junit.Test;

import static org.junit.Assert.*;

public class TowTest {

    int [] A = new int []{2,2,3,4,3,3,2,2,1,1,2,5};
    int [] B = new int []{2,2,3,4,3,3,2,2,1,1,2,1};
    int [] C = new int []{-3, -3};

    @Test
    public void solution(){
        System.out.println(Tow.solution(A));
        System.out.println(Tow.solution(B));
        System.out.println(Tow.solution(C));
//        assertTrue(Tow.solution(A) == 4);
//        assertTrue(Tow.solution(B) == 5);
//        assertTrue(Tow.solution(C) == 1);
    }

    @Test
    public void dd(){
        System.out.println(A.length);
    }

}