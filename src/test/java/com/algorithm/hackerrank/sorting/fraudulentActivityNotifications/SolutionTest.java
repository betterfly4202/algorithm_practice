package com.algorithm.hackerrank.sorting.fraudulentActivityNotifications;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SolutionTest {

    int [] a = {10, 20, 30, 40, 50};
    int [] b = {2, 3, 4, 2, 3, 6, 8, 4, 5};
    int [] c = {1, 2, 3, 4, 4};


    @Test
    public void 검증(){
//        assertThat(Solution.activityNotifications(a, 3), is(1));
//        assertThat(Solution.activityNotifications(b, 5), is(2));
//        assertThat(Solution.activityNotifications(c, 4), is(0));

        assertThat(Solve.activityNotifications(a, 3), is(1));
        assertThat(Solve.activityNotifications(b, 5), is(2));
        assertThat(Solve.activityNotifications(c, 4), is(0));

    }

    @Test
    public void 검증_Final(){
        assertTrue(SolutionFinal.activityNotifications(b, 5) == 2);
    }

    @Test
    public void solve(){
        assertTrue(Solve.activityNotifications(b, 5) == 2);
    }

    @Test
    public void 중간값_확인(){
        List<Integer> list = Arrays.asList(2, 3, 4, 2, 3);
        List<Integer> list1 = Arrays.asList(2, 3, 4, 2, 3, 6);
        List<Integer> list2 = Arrays.asList(1, 1, 1, 1, 1, 1);

        assertTrue(Solution.arrAvg(list, 5) == 6);;
        assertTrue(Solution.arrAvg(list1, 5) == 6);;
        assertTrue(Solution.arrAvg(list2, 4) == 2);;
    }
}