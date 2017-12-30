package com.algorithm.BOJ_STEP.STEP_4.BOJ_4344;

import java.util.Scanner;

public class Main {
    public static void main (String [] avg){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int [] score = new int[A];
        double totalScore = 0;

        for(int i=0; i<A; i++){
            int temp = sc.nextInt();
            score[i] = temp;
            totalScore += temp;
        }

        float avgScore = Float.parseFloat(String.format("%.2f%n", totalScore/A));
        double cnt = 0;
        for(int i=0; i<A; i++){
            if(score[i]>avgScore){
                cnt++;
            }
        }
        System.out.print(String.format("%.3f", cnt/A*100)+"%");
    }
}