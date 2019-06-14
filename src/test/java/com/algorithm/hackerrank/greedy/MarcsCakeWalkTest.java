package com.algorithm.hackerrank.greedy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.06.14
 */
public class MarcsCakeWalkTest {
    private MarcsCakeWalk marcsCakeWalk;
    private int [] calorie = {1, 5, 8, 4};

    @Before
    public void setUp(){
        marcsCakeWalk = new MarcsCakeWalk();
    }

    @Test
    public void getMarcsCakeWalkCalorie(){
        long result = marcsCakeWalk.walks(calorie);

        assertThat(result, is(42));
    }

    private int compareUpperValue(int o1, int o2){
        return o1 > o2 ? o1 : o2;
    }

    private int compareLowerValue(int o1, int o2){
        return o1 < o2 ? o1 : o2;
    }

    private int castToInt(Double val){
        return val.intValue();
    }

    @Test
    public void aabb(){
        int [] list = ascentValue(calorie);

        for (int a : list){
            System.out.println(a);
        }
    }

    private int[] ascentValue(int [] values){
        int [] result = new int[values.length];

        for (int i=0; i<values.length; i++){
            if (i+1 < values.length){

                result[i] = compareUpperValue(values[i], values[i+1]);
                result[i+1] = compareLowerValue(values[i], values[i+1]);
            }
        }

        return result;
    }
}