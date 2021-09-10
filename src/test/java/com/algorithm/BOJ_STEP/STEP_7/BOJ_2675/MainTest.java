package com.algorithm.BOJ_STEP.STEP_7.BOJ_2675;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    Main m = new Main();

    @Test
    public void loopTest(){
        String S = "3 ABC";

        System.out.println(m.loop(S));
    }
}