package com.algorithm.youtube.implementation;

import java.util.HashSet;
import java.util.Set;

public class Solution_2 {
    /*
        00시 00분 00초 부터 N시 59분 59초까지 모든 시각 중 3이 하나라도 포함되는 경우의 수
     */
    public static int countThree(int n){
        Set<String> threelist = new HashSet<>();
        for (int i = 0; i <60 ; i++) {
            String s = String.valueOf(i);
            for (char c : s.toCharArray()) {
                if(String.valueOf(c).equals("3")){
                    threelist.add(s);
                }
            }
        }

        int minus = 0;
        for (int i = 0; i <n ; i++) {
            for (char c :String.valueOf(i).toCharArray()) {
                if(String.valueOf(c).equals("3")){
                    minus ++;
                }
            };
        }

        // 왜 n-1이 아니라, n을 곱하는게 정답일까? 3을 포함한 시간을 별도로 계산하기 때문에 n에서 3이 포함된 시간을 제외한 값을 구한 후
        // 3이 포함된 전체시간 3600(60분 * 60초)를 더해줘야하는데...?
        int result = (((45 * threelist.size()) + (threelist.size() * 60))) * n;
        result += ((60*60) * minus);
        return result;
    }

    public static int sampleSolution(int n){
        int cnt = 0;

        for (int hour = 0; hour <= n ; hour++) {
            for (int min = 0; min <60 ; min++) {
                for (int second = 0; second <60 ; second++) {
                    if(check(hour, min, second)){
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    private static boolean check(int hour, int min, int second) {
        if(hour % 10 == 3 || min / 10 == 3|| min % 10 == 3 || second / 10 == 3 || second % 10 == 3){
            return true;
        }
        return false;
    }
}
