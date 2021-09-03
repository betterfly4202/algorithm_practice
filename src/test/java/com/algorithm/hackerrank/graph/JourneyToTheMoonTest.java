package com.algorithm.hackerrank.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class JourneyToTheMoonTest {
    private JourneyToTheMoon target;

    private int [][] arr = new int[1][1];

    private int [][] arr1 = {
                {1, 2},
                {2, 3}
            };
    private int [][] arr3 = {{0, 2}};
    private int [][] arr2 = {{0, 1}, {2, 3}, {0, 4}, {1, 5}, {3, 5}};
    private int [][] arr4 = {{0, 1}, {2, 3}, {0, 4}};

    @Before
    public void init(){
        target = new JourneyToTheMoon();
    }

    @Test
    public void 리스트_중복검사(){
        List<Integer> a = Arrays.asList(1,2,3);
        List<Integer> b = Arrays.asList(2,3,4);


    }


    /**
     *  {{0, 1}, {2, 3}, {0, 4}, {1, 5}, {3, 5}};
     *
     *  {0,1, 0, 4, 1, 5, 3 ,5, 2, 3}
     */
    @Test
    public void 중복검사(){
        List<Set<Integer>> list = target.arrToList(arr2);
        List<Set<Integer>> list2 = target.arrToList(arr4);

        list = target.checkDuplicatedArr(list);
        list2 = target.checkDuplicatedArr(list2);

        list.size();
        list2.size();
    }

    @Test
    public void 군집화(){
        List<Integer> a1 = Arrays.asList(1,2,3,3,3,4);
        List<Integer> a2 = Arrays.asList(2,3,4);

        List<Integer> a3 = a2.stream().filter(e -> a1.contains(e)).distinct().collect(Collectors.toList());

        System.out.println(a2);
        System.out.println(a1);
        System.out.println(a3);
    }
}