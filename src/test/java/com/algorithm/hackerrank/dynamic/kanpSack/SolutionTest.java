package com.algorithm.hackerrank.dynamic.kanpSack;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    /*
        3 12
        1 6 9
        5 9
        3 4 4 4 8

        2
        4 13
        3 7 9 11
        3 11
        3 7 9


        1
        2 22
        4 7
     */
    int [] a = {1, 6, 9};
    int [] b = {3, 4, 4, 4, 8};
    int [] c = {3, 9};
    int [] d = {3, 7, 9, 11};
    int [] e = {3, 7, 9};
    int [] f = {4, 7};

    @Test
    public void asdf(){
//        assertThat(Solution.unboundedKnapsack(12, a), is(12));
//        assertThat(Solution.unboundedKnapsack(9, b), is(9));
//        assertThat(Solution.unboundedKnapsack(21, c), is(21));
//        assertThat(Solution.unboundedKnapsack(31, c), is(30));
//        assertThat(Solution.unboundedKnapsack(13, d), is(13));
//        assertThat(Solution.unboundedKnapsack(11, e), is(10));
        assertThat(Solution.unboundedKnapsack(22, f), is(22));
    }

    @Test
    public void assadf(){
        System.out.println(21%9);

    }

}