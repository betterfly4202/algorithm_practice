package com.algorithm.youtube.dfs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sample_1Test {
    int[][] graph = new int[][]{
            {},
            {2, 3, 8},
            {1, 7},
            {1, 4, 5},
            {3, 5},
            {3, 4},
            {7},
            {2, 6, 8},
            {1, 7}
    };

    @Test
    public void DFS_탐색_순서를_찾는다(){
        String result = Sample_1.dfs(graph);

        System.out.println(result);
    }
}