package com.algorithm.BOJ_STEP.STEP_4.BOJ_4344;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String [] avg){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        List<int[]> list = new ArrayList<>();

        for(int i=0; i<A; i++){
            int person = sc.nextInt();
            int [] scoreArray = new int[person];
            for(int j=0; j<person; j++){
                scoreArray[j] = sc.nextInt();
            }
            list.add(scoreArray);
        }

        for(int i=0; i<list.size(); i++){
            double totalScore = 0;
            double cnt = 0 ;
            for(int j=0; j<list.get(i).length; j++){
                totalScore += list.get(i)[j];
            }
            double avgScore = Double.parseDouble(String.format("%.2f%n", totalScore/list.get(i).length));
            for(int k=0; k<list.get(i).length; k++){
                if(avgScore < list.get(i)[k]){
                    cnt++;
                }
            }
            System.out.println(String.format("%.3f", cnt/list.get(i).length*100)+"%");
        }
    }
}