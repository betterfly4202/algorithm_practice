package com.algorithm.youtube.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_3Test {

    @Test
    public void 최고의_합(){
        String s = "02984";
        String s1 = "576";
        String s2 = "01";
        String s3 = "81";
        String s4 = "85";

        assertEquals(Solution_3.solution(s), 576);
        assertEquals(Solution_3.solution(s1), 210);
        assertEquals(Solution_3.solution(s2), 1);
        assertEquals(Solution_3.solution(s3), 9);
        assertEquals(Solution_3.solution(s4), 40);
    }

}