package com.algorithm.hackerrank.graph;

import java.util.Arrays;
import java.util.List;

/**
 * @link : https://www.hackerrank.com/challenges/journey-to-the-moon/problem
 */
public class JourneyToTheMoon {

    /*
        1. 주어진 배열에서 그룹핑 재배열.
        - 흩어져 있는 그룹군에서, 동일한 국가가 있는 경우 하나의 그룹으로 묶어야함

        2. 전체 배열 완성 후 경우의 수 구하기
            a. 전체 사이즈만큼 순회하면서
            b. 각 배열 길이 만큼 곱한 후, 각각의 곱을 더함

        예)
        A: [0 ,1, 4]
        B: [2 , 3]
        C: [5]

        - (A.length * B.length) + (A.length + C.length) + (B.length * C.length)
        - (3 * 2) + (3 * 1) + (2 * 1)
        > result = 11
     */
    static int journeyToMoon(int n, int[][] astronaut) {
        assert n == 1;

        return 0;
    }


    // 다른 배열에 값이 있는 경우 합치기
    public int [][] checkDuplicatedArr(int[][] astronaut){
//        List<List<Integer>> list = (List<List<Integer>>) Arrays.asList(astronaut);

        for(int i=0; i<astronaut.length; i++){
            if(astronaut[i+1] != null){

                for(int j=0; i<2; j++){
                    for (int k=0; k<2; k++){
                        if(astronaut[i][j] == astronaut[i+1][k]){
                            astronaut[i][astronaut[i].length+1]= 14;
                        }
                    }
                }
            }
        }
        return null;
    }

}
