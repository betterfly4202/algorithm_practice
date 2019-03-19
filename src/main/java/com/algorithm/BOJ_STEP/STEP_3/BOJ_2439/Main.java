package com.algorithm.BOJ_STEP.STEP_3.BOJ_2439;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 18.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] addPoint){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A < 1 || A > 100)
            return;

        boolean flag = false;
        for(int i=0; i<A; i++){
            flag = false;
            for(int j=0; j<=i; j++){
                for(int oh=A-i; oh>1; oh--){
                    if(flag == false){
                        System.out.print(" ");
                    }
                }
                System.out.print("*");
                flag = true;
            }
            System.out.println();
        }
    }
}
