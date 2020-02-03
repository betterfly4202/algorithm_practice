package com.algorithm.hackerrank.search.radioTransmitter;

import org.junit.Test;

import static com.algorithm.hackerrank.search.radioTransmitter.RadioSolution.process;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.06
 */
public class RadioSolutionTest {
    int [] k = {9,5,4,2,6,15,12}; // 2, 4
    int [] x = {7, 2};

    @Test
    public void 검증(){
        assertThat(process(k, x[1], x[0]), is(4));
    }
}