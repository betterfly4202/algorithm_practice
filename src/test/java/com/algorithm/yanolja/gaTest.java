package com.algorithm.yanolja;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class gaTest {

    @Test
    public void 가위바위보(){
        ga g= new ga();


        String GG = "RSPRS";
        String GG1 = "PRPRRPP";
        int a0 = g.solution(GG);
        int a1 = g.solution(GG1);

        assertTrue(a0 == 6);
        assertTrue(a1 == 10);
    }
}