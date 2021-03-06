package com.algorithm.acmicpc.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

// https://www.acmicpc.net/problem/12865
public class NormalBag {

    /*

        첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
        두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
        입력으로 주어지는 모든 수는 정수이다.

        -> 이런 힌트가 주어질 때, DP 이용시 얼마나 메모리를 사용할 것인지 설계할 필요가 있음
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        int length = Integer.parseInt(line.split(" ")[0]);
        int maxWeight = Integer.parseInt(line.split(" ")[1]);

        int [][] wValue = new int[length][2];
        for (int i = 0; i <length ; i++) {

            String input = sc.nextLine();

            int weight = Integer.parseInt(input.split(" ")[0]);
            int value = Integer.parseInt(input.split(" ")[1]);

            wValue[i][0] = weight;
            wValue[i][1] = value;
        }

        System.out.println(solution(wValue, maxWeight));
    }

    public static int solution(int [][] wValue, int K){
        int [] N = new int[100];

        for (int i = 0; i < wValue.length ; i++) {
            int weight = wValue[i][0];

            if(weight <= K){
                N[weight] = wValue[i][1];

                for(int j=0; j<100; j++){
                    if(N[j] != 0){
                        if (weight+j <= K){
                            N[weight+j] = N[weight] + N[j];
                        }
                    }

                }
            }
        }

        Arrays.sort(N);
        return N[N.length-1];
    }
}
