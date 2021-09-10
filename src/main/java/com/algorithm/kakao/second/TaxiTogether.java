package com.algorithm.kakao.second;

import java.util.*;

/*
    https://programmers.co.kr/learn/courses/30/lessons/72413
 */
public class TaxiTogether {
    List<int []> fareList = new ArrayList<>();

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        int result = 0;
        fareList = Arrays.asList(fares);

        List<int []> ordered = new ArrayList<>();
        for (int i = 0; i < fares.length; i++) {
            int [] input = new int[3];

            int left = fares[i][0];
            int right = fares[i][1];

            if(left < right){
                input[0] = left;
                input[1] = right;
            }else{
                input[0] = right;
                input[1] = left;
            }
            input[2] = fares[i][2];

            ordered.add(input);
        }


        int cnt = 0;
        while(cnt < 1){

        }


        return answer;
    }

    public Map<Integer, List<Map<Integer, Integer>>> extracted(int key, Map<Integer, List<Map<Integer, Integer>>> listMap) {
        if (true){
            // 종료 되는 조건은 마지막 배열의 value값을 리스트에 리턴

        }

        Map<Integer, List<Map<Integer, Integer>>> course = new HashMap<>();
        List<Map<Integer, Integer>> linked = new LinkedList<>();
        for (int i = 0; i < fareList.size(); i++) {
            Map<Integer, Integer> m = new HashMap<>();
            int left  = fareList.get(i)[0];
            int right  = fareList.get(i)[1];
            int charge  = fareList.get(i)[2];

            if(left == key){
                m.put(right, charge);
                linked.add(m);
            }else if (right == key){
                m.put(left, charge);
            }

            if(!m.isEmpty()){
                fareList.remove(i);
                linked.add(m);
            }
        }
        course.put(key, linked);

        return extracted(key, course);
    }
}
