package com.algorithm.youtube.bfs;

import org.junit.jupiter.api.Test;

class FindMiroTest {
    @Test
    public void 미로_최단거리_찾기(){
        String s = "5 6";
        String [] arr = {
                "101010",
                "111110",
                "110100",
                "000110",
                "010011"
        };

//        assertEquals(FindMiro.resultCount(s, arr), 10);
        System.out.println(FindMiro.resultCount(s, arr));
    }
}