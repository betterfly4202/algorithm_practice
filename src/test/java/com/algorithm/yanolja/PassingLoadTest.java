package com.algorithm.yanolja;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassingLoadTest {


    @Test
    public void 패씽(){
        String L1 = ".xxx...x";
        String L2 = "..x.xxxx";

        assertEquals(PassingLoad.solution(L1, L2), 6);
    }
}