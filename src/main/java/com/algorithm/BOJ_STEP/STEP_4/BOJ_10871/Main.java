package com.algorithm.BOJ_STEP.STEP_4.BOJ_10871;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 26.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main (String [] das) {
        Scanner sc = new Scanner(System.in);
        int n,x;
        n = sc.nextInt();
        x = sc.nextInt();
        int[] ary = new int[n];

        for(int i=0; i<n; i++){
            ary[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            if(ary[j]<x){
                System.out.print(ary[j]+ " ");
            }
        }
    }
}