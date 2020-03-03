package com.algorithm.acmicpc.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoinZeroTest {
    int [] a = {1,5,10,50,100,500,1000,5000,10000,50000};

    @Test
    public void 검증(){
        assertTrue(CoinZero.coinZero(a, 4200) == 6);
        assertTrue(CoinZero.coinZero(a, 4790) == 12);

        assertTrue(CoinRetry.coinZero(a, 4200) == 6);
        assertTrue(CoinRetry.coinZero(a, 4790) == 12);
    }

    @Test
    public void 문자열_파싱(){
        int a = 4236;
        String parseString = String.valueOf(a);
        for (int i = 0; i < parseString.length(); i++) {
            int result = Integer.parseInt(parseString.substring(i, i+1));
            System.out.println(result);
        }
        Integer.parseInt(parseString.substring(0, 1));
    }

    @Test
    public void 나누기_테스트(){
//        System.out.println(50/1000);
//        System.out.println(50000/1000);
//        System.out.println(1000/1000);
        System.out.println(4200/1000);
    }
}