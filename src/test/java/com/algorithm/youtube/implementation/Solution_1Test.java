package com.algorithm.youtube.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_1Test {

    @Test
    public void 좌표찾기(){
        int n = 5;
        String xy = "R R R U D D";
        String xy2 = "L L L U D D";
        String r = Solution_1.getVector(n, xy);
        String r2 = Solution_1.getVector(n, xy2);

        assertEquals(r, "3 4");
        assertEquals(r2, "3 1");
    }

    @Test
    public void 해설_좌표찾기(){
        int n = 5;
        String xy = "R R R U D D";
        String xy2 = "L L L U D D";
        String r = Solution_1.sampleVector(n, xy);
        String r2 = Solution_1.sampleVector(n, xy2);

        assertEquals(r, "3 4");
        assertEquals(r2, "3 1");
    }
}