package com.algorithm.youtube.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_4Test {

    @Test
    public void 알파벳_오름차순과_숫자의합(){
        String aa ="a1dt9bc";
        String bb ="K1KA5CB7";
        String r = Solution_4.orderingLiteral(aa);
        String rr = Solution_4.orderingLiteral(bb);

        assertEquals(r, "abcdt10");
        assertEquals(rr, "ABCKK13");
    }
}