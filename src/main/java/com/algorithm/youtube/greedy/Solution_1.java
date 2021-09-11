package com.algorithm.youtube.greedy;

public class Solution_1 {
    /*
        거스름돈 500원, 100원, 50원, 10원 짜리 동전이 무한히 존재한다
        손님에게 거슬러 주어야할 돈이 N원일때,
        거슬러주어야 할 동전의 최소 개수를 구하여라.
        (단, N은 항상 10의 배수)
     */

    public static int restMoney(int N){
        int rest = 0;

        rest += N/500;
        N = N % 500;

        rest += N/100;
        N = N % 100;

        rest += N/50;
        N = N % 50;

        rest += N/10;

        return rest;
    }

    public static int answer(int N){
        int count = 0;
        int [] money = {500, 100, 50, 10};

        for (int m :money) {
            count += N/m;
            N = N%m;
        }

        return count;
    }
}
