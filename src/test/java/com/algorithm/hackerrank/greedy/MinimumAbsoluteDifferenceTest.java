package com.algorithm.hackerrank.greedy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.06.11
 */
public class MinimumAbsoluteDifferenceTest {

    private MarcsCakeWalk marcsCakeWalk;

    @Before
    public void setUp(){
        marcsCakeWalk = new MarcsCakeWalk();
    }

    @Test
    public void jegob(){
        int a = 2;
        int b = 4;
        int result = castToInt(Math.pow(a,b));

        assertThat(result, is(16));
    }

    @Test
    public void compare_value_test(){
        int a = 10;
        int b = 10;
        System.out.println(compareValue(a, b));
    }

    private int compareValue(int o1, int o2){
        return o1 > o2 ? o1 : o2;
    }

    private int castToInt(Double val){
        return val.intValue();
    }
}