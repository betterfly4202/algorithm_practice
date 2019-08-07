package com.algorithm.hackerrank.search.radioTransmitter;

import org.junit.Before;
import org.junit.Test;

import static com.algorithm.hackerrank.search.radioTransmitter.Solution.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.05
 */
public class SolutionTest {
//    int [] k = {1,2,3,4,5}; // 1 , 2
//    int [] k = {9,5,4,2,6,15,12}; // 2 , 2
//    int [] k = {7,2,4,6,5,9,12,11}; // 2, 3

//    int [] k = {9,5,4,2,6,15,12}; // 2, 4
    int [] x = {7, 2};

    @Before
    public void init(){

    }

    @Test
    public void 검증(){
        int [] k = {9,5,4,2,6,15,12}; // 2, 4
        assertThat(neededTransmitter(k, x[1]), is(1));
    }

    @Test
    public void arr_2_map(){
        assertThat(houseLocationWithMap(x).size(), is(x.length));
    }

    @Test
    public void 검증하기(){
        int [] a = {2,2,2,2,1,1,1,1};
        assertThat(neededTransmitter(a, 1), is(1));

        int [] b = {7,2,4,6,5,9,12,11};
        assertThat(neededTransmitter(b, 2), is(3));

        int [] c = {9,5,4,2,6,15,12}; // 2, 4
        assertThat(neededTransmitter(c, 2), is(4));
    }

    @Test
    public void 최대값_검증(){
        int [] b = {7,2,4,6,5,9,12,11};
        assertThat(getMaxKeyValue(houseLocationWithMap(b)), is(12));

    }

}