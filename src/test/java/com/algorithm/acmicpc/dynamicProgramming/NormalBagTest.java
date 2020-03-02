package com.algorithm.acmicpc.dynamicProgramming;

import org.junit.Test;
import static org.junit.Assert.*;

public class NormalBagTest {

    /*
        4 7
        6 13
        4 8
        3 6
        5 12
     */

    int [][] wValue = {{6, 13}, {4,8}, {3,6},{5,12}};
    int [][] wValue2 = {{10, 10}, {1,9}, {2,5},{4,3}};

    @Test
    public void  검증(){
        assertTrue(NormalBag.solution(wValue, 7) == 14);
//        assertTrue(NormalBag.solution(wValue2, 10) == 17);
    }

    @Test
    public void 배열_공간확인(){
        int []dp = new int[100];

        for(int i=0; i<100; i++){
            dp[i] = i;
        }

        System.out.println(dp[0]);
        System.out.println(dp[99]);
        System.out.println(dp.length);
    }

}