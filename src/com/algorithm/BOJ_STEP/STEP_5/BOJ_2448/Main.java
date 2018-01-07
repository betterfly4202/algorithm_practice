package com.algorithm.BOJ_STEP.STEP_5.BOJ_2448;

import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 1. 7.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] stars){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String space = " ";
        for(int j=0; j<N; j++){
            space += space;
        }

        for(int i=1; i<=N; i++){
            if(i % 3 == 1){

                System.out.println(space+"*");
            }else if(i% 3==2){
                System.out.println("**");
            }else if(i % 3 ==0){
                System.out.println("*****");
            }
        }
    }
}
