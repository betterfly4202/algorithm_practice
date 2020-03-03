package com.algorithm.acmicpc.greedy;

import java.util.Scanner;

public class CoinZeroSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int maxAble = 0;

        int[] coin = new int [n];
        int result = 0;

        for (int i = 0; i < n ; i++) {
            coin[i] = sc.nextInt();
            if(coin[i] <= k){
                maxAble=i;
            }
        }

        for(int i=maxAble; i>=0; i--){
            result += k/coin[i];
            k%=coin[i];
        }

        System.out.println(result);
    }
}
