package com.algorithm.hackerrank.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class JourneyToTheMoonTest {
    private JourneyToTheMoon target;

    private int [][] arr = new int[1][1];

    private int [][] arr1 = {
                {1, 2, 3},
                {2, 3}
            };
    private int [][] arr3 = {{0, 2}};
    private int [][] arr2 = {{0, 1}, {2, 3}, {0, 4}, {1, 5}, {3, 5}};

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
        List<List<Integer>> list = target.arrToList(arr2);


//        Optional.ofNullable(target.compare(list.get(0), list.get(3)))
//                .ifPresent(v ->{
//                    list.get(0).addAll(list.get(3));
//                    list.remove(3);
//                });

        list = target.checkDuplicatedArr(list);

        list.size();
    }
}