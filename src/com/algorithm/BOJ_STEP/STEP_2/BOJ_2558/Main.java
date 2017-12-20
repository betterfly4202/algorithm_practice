package com.algorithm.BOJ_STEP.STEP_2.BOJ_2558;


/**
 * Created by betterFLY on 2017. 12. 17.
 * Github : http://github.com/betterfly88
 */

import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        if(A<1){
            System.out.println("A는 0보다 큰 정수를 입력해주세요");
            return;
        }
        if(B>9){
            System.out.println("B는 10보다 작은 정수를 입력해주세요");
            return;
        }

        if(A+B > 10){
            System.out.println("A와 B의 합은 10보다 작아야합니다");
        }
        System.out.println(A+B);
    }
}
