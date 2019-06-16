package com.algorithm.hackerrank.greedy;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.06.14
 */
public class MarcsCakeWalkTest {
    private MarcsCakeWalk marcsCakeWalk;
    private int [] calorie = {819,701,578,403,50,400,983,665,510,523,696,532,51,449,333,234,958,460,277,347,950,53,123,227,646,190,938,61,409,110,61,178,659,989,625,237,944,550,954,439};

    @Before
    public void setUp(){
        marcsCakeWalk = new MarcsCakeWalk();
    }

    private int castToInt(Double val){
        return val.intValue();
    }

    @Test
    public void resultCalculator(){
        int [] result = compareAllValues(calorie);
        long sum = 0;
        for (int i=0; i<result.length; i++){
            sum += powValues(i) * result[i];
        }

        System.out.println(sum);
    }

    private int[] compareAllValues(int [] values){
        int [] newResult = new int[values.length];

        for (int i=0; i<values.length; i++){
            int maxVal = values[i];
            for (int k=i+1; k < values.length; k++){
                if (maxVal < values[k]){
                    maxVal = values[k];
                    int temp = values[i];
                    values[k] = temp;
                    values[i] = maxVal;
                }
            }

            newResult[i] = maxVal;
        }

        return newResult;
    }


    private long powValues(int n){
        int x = 2;
        return (long) Math.pow(x,n);
    }
}