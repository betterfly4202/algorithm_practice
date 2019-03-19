package com.algorithm.BOJ_STEP.STEP_3.BOJ_2741;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 18.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] nums){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A > 100000) {
            return;
        }
        for(int i=0; i<=A ;i++){
            if(A-i == 0)
                return;
            System.out.println(A-i);
        }
    }
}
