package com.algorithm.hackerrank.search.gridlandMetro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SolutionWithMap {
    /**
     * @link : https://www.hackerrank.com/challenges/gridland-metro/problem
     * @param n row(행), 세로
     * @param m column(열), 가로
     * @param k
     * @param track 2차원 배열 [start ~ end]
     * @return track이 거치지 않은 공간의 수
     */
    public static int gridlandMetro(int n, int m, int k, int[][] track) {
        Map<Integer, List<Boolean>> lampMap = new HashMap<>();
        for(int i=0; i<n; i++){
            List<Boolean> list = new ArrayList<>();
            for(int j=0; j<m; j++){
                list.add(false);
            }

            lampMap.put(i, list);
        }

        int trueCount =0;
        for(int i=0; i<k; i++){
            int r = track[i][0] - 1;

            for(int j=track[i][1]-1; j<=track[i][2]-1; j++){
                if(!lampMap.get(r).get(j)){
                    lampMap.get(r).set(j, true);
                    trueCount++;
                }

            }
        }

        return n*m-trueCount;
    }
}

/*
    timeout 이 발생함..
    이중 loop를 제거하기 위한 방법..
    2차원 (고차원) 배열에서 이중루프를 어떻게 제거할것인지 고민해보기
 */
