package com.algorithm.BOJ_STEP.STEP_4.BOJ_1546;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 28.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main (String [] avg){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double [] doubleArray = new double[N];

        if(N < 1 || N > 1000)
            return;

        for(int i=0; i<N; i++){
            doubleArray[i] = sc.nextInt();
        }

        double maxScore = doubleArray[0];
        double score = 0;
        for(int i=0; i<doubleArray.length; i++){
            maxScore = maxScore > doubleArray[i] ? maxScore : doubleArray[i];
            if(maxScore != doubleArray[i]){
                score = doubleArray[i]/maxScore * 100;
            }
        }
        System.out.format("%.2f%n", score);

    }
}
