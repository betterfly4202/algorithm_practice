package com.algorithm.hackerrank.graph;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JourneyToTheMoonTest {
    private JourneyToTheMoon target;

    private int [][] arr = new int[1][1];

    private int [][] arr1 = {
                {1, 2, 3},
                {2, 3}
            };
    private int [][] arr2 = {{0, 1}, {2, 3}, {0, 4}};
    private int [][] arr3 = {{0, 2}};
    @Before
    public void init(){
        target = new JourneyToTheMoon();
    }


    @Test
    public void 검증(){
        assert target.journeyToMoon(4, arr1) == 3;
        assert target.journeyToMoon(5, arr2) == 6;
        assert target.journeyToMoon(4, arr3) == 5;
    }

    @Test
    public void 배열확인(){
        System.out.println(arr1[0][1]);
        assertTrue(arr1[0].length==3);

        arr1[0][4]= 5;
        assertTrue(arr1[0].length==4);
        System.out.println(arr1[0][4]);
    }
}