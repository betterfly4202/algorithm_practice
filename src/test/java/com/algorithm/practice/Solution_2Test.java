package com.algorithm.practice;

import org.junit.Test;

import static com.algorithm.practice.Solution_2.getRandomValue;
import static com.algorithm.practice.Solution_2.resultValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.07
 */
public class Solution_2Test {
    int N = 27;
    @Test
    public void d22d(){
        int aa = 43;
        for(int i=0; i<1000; i++){

            int x= getRandomValue(aa);
            if(x <= aa){
                System.out.println(x);
            }
        }
    }
    @Test
    public void dd(){
        int ddd = 333;

        System.out.println(resultValue(30));
    }

}