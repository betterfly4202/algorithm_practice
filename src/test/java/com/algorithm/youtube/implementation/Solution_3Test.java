package com.algorithm.youtube.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_3Test {

    @Test
    public void 나이트_이동_경로(){
        String start = "a1";
        String start2 = "c2";

        assertEquals(Solution_3.nightMovingCount(start), 2);
        assertEquals(Solution_3.nightMovingCount(start2), 6);

    }
}