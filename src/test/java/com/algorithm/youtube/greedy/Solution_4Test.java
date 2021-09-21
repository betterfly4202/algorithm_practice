package com.algorithm.youtube.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution_4Test {

    @Test
    public void 기본_예제(){
        int N = 5;
        String users = "2 3 1 2 2 ";

        int result = Solution_4.getedGuildGroupCount(N, users);

        assertEquals(2, result);
    }

    @Test
    public void 추가풀이(){
        int N = 6;
        String users = "1 2 2 2 2 4";
        String users2 = "1 1 1 1 1 1 1";

        int result = Solution_4.getedGuildGroupCount(N, users);
        int result2 = Solution_4.getedGuildGroupCount(N, users2);

        assertEquals(3, result);
        assertEquals(7, result2);
    }

}