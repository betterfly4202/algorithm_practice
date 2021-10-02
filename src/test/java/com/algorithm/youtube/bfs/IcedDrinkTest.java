package com.algorithm.youtube.bfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IcedDrinkTest {

    @Test
    public void 얼린_음료수_찾기(){
        String s = "4 5";
        String [] arr = {
            "00110",
            "00011",
            "11111",
            "00000"
        };

         assertEquals(IcedDrink.resultCount(s, arr), 3);
    }
}