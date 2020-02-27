package com.algorithm.hackerrank.search.gridlandMetro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.algorithm.hackerrank.search.gridlandMetro.MergeOverlappingIntervals.mergeIntervals;

public class Solution {
    /**
     * @link : https://www.hackerrank.com/challenges/gridland-metro/problem
     * @param n row(행), 세로
     * @param m column(열), 가로
     * @param k
     * @param track 2차원 배열 [start ~ end]
     * @return track이 거치지 않은 공간의 수
     */
    public static int gridlandMetro(int n, int m, int k, int[][] track) {
        Map<Integer, int []> metroMap = new HashMap<>();
        if(k == 0){
            return n*m;
        }


        Interval arr[]=new Interval[k];
        for (int i=0; i<k; i++){
            int arrIndex = track[i][0] -1;
            arr[arrIndex] = new Interval(track[i][1], track[i][2]);
        }
        mergeIntervals(arr);

        return n*m-0;
    }
}
