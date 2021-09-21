package com.algorithm.youtube.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_2Test {

    @Test
    public void 삼이_포함된_숫자세기(){
        int n =  5;
        int n2 =  6;

        assertEquals(Solution_2.countThree(n), Solution_2.sampleSolution(n));
        assertEquals(Solution_2.countThree(n2), Solution_2.sampleSolution(n2));
    }
}
