package com.algorithm.practice.sorting;

import org.junit.Test;

import static com.algorithm.practice.sorting.SelectionSort.swapArray;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */
public class SelectionSortTest {
    private int [] sample = new int[]{5,6,1,8,9,33,2,13};

    @Test
    public void solution(){
        assertThat(swapArray(sample), is(new int[]{1,2,5,6,8,9,13,33}));
    }
}