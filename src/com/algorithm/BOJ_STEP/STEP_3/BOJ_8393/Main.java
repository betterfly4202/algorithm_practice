package com.algorithm.BOJ_STEP.STEP_3.BOJ_8393;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 19.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] pibonacci){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A<1 || A>10000)
            return;
        System.out.println(pibonacci(A));
    }

    public static int pibonacci(int A){
        if(A< 1)
            return A;
        return A + pibonacci(A-1);
    }
}
