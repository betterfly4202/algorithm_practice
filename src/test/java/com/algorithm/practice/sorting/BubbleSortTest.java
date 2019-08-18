package com.algorithm.practice.sorting;

import org.junit.Test;

import static com.algorithm.practice.sorting.BubbleSort.bubbleSort;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.16
 */
public class BubbleSortTest {
    private int [] sample = new int[]{5,6,1,8,9,33,2,13};
    private int [] sample2 = new int[]{4,1,7,9,22,5};

    @Test
    public void solution(){
        assertThat(bubbleSort(sample), is(new int[]{1,2,5,6,8,9,13,33}));
        assertThat(bubbleSort(sample2), is(new int[]{1,4,5,7,9,22}));
    }
}