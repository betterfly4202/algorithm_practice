package com.algorithm.hackerrank.sorting.closetNumbers;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {
    int [] a = {-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854};
    int [] b = {-20,-3916237,-357920,-3620601,7374819,-7330761,30,6246457,-6461594,266854,-520,-470};
    int [] c = {5,4,3,2};


    @Test
    public void 검증(){
        assertThat(Solution.closestNumbers(a), is(new int[]{-20, 30}));
        assertThat(Solution.closestNumbers(b), is(new int[]{-520, -470, -20, 30}));
        assertThat(Solution.closestNumbers(c), is(new int[]{2, 3, 3, 4, 4, 5}));
    }

    @Test
    public void 검산(){
        System.out.println(-20+30);
    }
}