package com.algorithm.hackerrank.greedy;

import org.junit.Test;

import static org.junit.Assert.*;

public class CoopangGreedyTest {
    int [][] a = {{1,3},{2,6},{8,10},{15,18}};
    int [][] b = {{1,3},{4,6},{8,10},{15,18},{2,4}};

    @Test
    public void 검증(){
        CoopangGreedy.merge(b);
    }
}