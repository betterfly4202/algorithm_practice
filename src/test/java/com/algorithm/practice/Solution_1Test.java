package com.algorithm.practice;

import org.junit.Test;

import static com.algorithm.practice.Solution_1.pairCount;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.07
 */
public class Solution_1Test {

    int [] aa = {3,5,6,3,3,5};

    @Test
    public void 페어키_검증(){
        assertThat(pairCount(aa), is(4));
    }
}