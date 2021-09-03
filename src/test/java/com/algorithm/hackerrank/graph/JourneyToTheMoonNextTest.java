package com.algorithm.hackerrank.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JourneyToTheMoonNextTest {
    private JourneyToTheMoonNext moon;

    private int [][] arr1 = {{1,2}, {2,3}};
    private int [][] arr2 = {{0,1}, {2,3},  {0,4}};
    private int [][] arr3 = {{0,2}};
    private int [][] arr4 = {
            {0, 2},
            {1, 8},
            {1, 4},
            {2, 8},
            {2, 6},
            {3, 5},
            {6, 9}};

    private int [][] arr6 = {
            {0, 1},
            {0, 3},
            {0, 4},
            {1, 2},
            {1, 3},
            {1, 5},
            {1, 7},
            {1, 8},
            {1, 9},
            {2, 8},
            {2, 7},
            {3, 5},
            {3, 8},
            {3, 7},
            {4, 9},
            {4, 5},
            {4, 6},
            {4, 7},
            {6, 8},
            {6, 7}
    };



    @Before
    public void init(){
        moon = new JourneyToTheMoonNext();
    }

    @Test
    public void 검증하기(){
        assertThat(moon.journeyToMoon(4, arr1), is(3));
        assertThat(moon.journeyToMoon(5, arr2), is(6));
        assertThat(moon.journeyToMoon(4, arr3), is(5));
        assertThat(moon.journeyToMoon(10, arr4), is(23));
        assertThat(moon.journeyToMoon(10, arr6), is(0));
    }

    @Test
    public void 중첩확인(){
        List<Set<Integer>> list = moon.convertToList(10, arr4);
        list = moon.addNewNum(10, list);

        list = moon.combineDuplicatedValues(list);
        int sum = moon.calculator(list);
        System.out.println(sum);

        list.size();
    }

    private int [][] arr5= {{0,2,8}, {1, 8}};

    @Test
    public void 비교확인(){
        List<Set<Integer>> set = moon.convertToList(5, arr5);
        set = moon.combineDuplicatedValues(set);

    }
}