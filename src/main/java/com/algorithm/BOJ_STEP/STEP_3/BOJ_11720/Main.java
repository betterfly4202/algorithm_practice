package com.algorithm.BOJ_STEP.STEP_3.BOJ_11720;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 19.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] rePibo){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        String B = sc.next();
        if(A<1 || A>100)
            return;

        int resultNum = 0;

        for(int i=0; i<A; i++){
            resultNum += B.charAt(i)-48;
        }
        System.out.println(resultNum);
    }
}
