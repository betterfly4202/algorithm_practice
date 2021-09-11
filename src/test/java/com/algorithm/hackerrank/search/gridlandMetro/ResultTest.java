package com.algorithm.hackerrank.search.gridlandMetro;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ResultTest {

    @Test
    public void gridlannd(){
        int n = 4;
        int m = 4;
        int k = 3;
        int [][] track = {{2,2,3}, {3,1,4}, {4,4,4}};

        List<List<Integer>> list = new ArrayList<>();
        for (int[] ints : track) {
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < ints.length; j++) {
                t.add(ints[j]);
            }
            list.add(t);
        }

        Result.gridlandMetro(n,m,k,list);
    }
}