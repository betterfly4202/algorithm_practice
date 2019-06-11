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
    public void getMarcsCakeWalkCalorie(){
        int [] calorie = {1, 5, 8, 4};

        long result = marcsCakeWalk.walks(calorie);

        assertThat(result, is(42));
    }

    @Test
    public void jegob(){
        int a = 2;
        int b = 4;
        int result = castToInt(Math.pow(a,b));

        assertThat(result, is(16));
    }

    private int castToInt(Double val){
        return val.intValue();
    }
}