package com.algorithm.BOJ.BOJ_11720;

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
//        String B="";
        if(A<1 || A>100)
            return;
//        for(int i=A; i>5; i--){
//            B+=i;
//        }
        System.out.println(B);
        System.out.println(pibo(A));
    }
    public static int pibo(int A){
        if(A<1)
            return A;
        return A + pibo(A-1);
    }
}
