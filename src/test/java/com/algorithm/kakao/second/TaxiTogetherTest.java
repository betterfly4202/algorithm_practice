package com.algorithm.kakao.second;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

class TaxiTogetherTest {

    TaxiTogether taxi = new TaxiTogether();

    @Test
    public void taxi(){
        int n = 6; // 지점의 개수
        int s = 4; // 출발지점
        int a = 6; // a 도착지
        int b = 2; // b 도착지
        int farse [][] = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};

        taxi.solution(n,s,a,b,farse);

    }

    @Test
    public void 키뽑기(){
        int n = 6; // 지점의 개수
        int s = 4; // 출발지점
        int a = 5; // a 도착지
        int b = 2; // b 도착지
        int farse [][] = {{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};

        taxi.solution(n,s,a,b,farse);
    }

    @Test
    public void putTest(){
        Map<Integer, Integer> a = new HashMap<>();

        a.put(1, 3);
        a.put(1, 4);
        a.put(2, 5);

        System.out.println(a);
    }
}