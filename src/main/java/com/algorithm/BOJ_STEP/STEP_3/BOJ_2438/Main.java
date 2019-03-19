package com.algorithm.BOJ_STEP.STEP_3.BOJ_2438;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 18.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] stars){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A > 0 && A > 100)
            return;
        String star = "*";
        for(int i=1; i <= A; i++){
            for(int j=0;j<i;j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
