package com.algorithm.hackerrank.sorting.fraudulentActivityNotifications;

import org.junit.Test;

import static com.algorithm.hackerrank.sorting.fraudulentActivityNotifications.Solution.executor;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.13
 */
public class SolutionTest {
    private int [] input = {9, 5};
    private int [] sampleArr = {2,3,4,2,3,6,8,4,5};
//    private int [] input = {9, 3};
//    private int [] sampleArr = {1,2,3,4,5};


    @Test
    public void 기본(){
        assertThat(executor(sampleArr, input[1]), is(2));
    }
}