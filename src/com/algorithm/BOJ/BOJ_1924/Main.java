package com.algorithm.BOJ.BOJ_1924;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 19.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] calender){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A<1 || A>12)
            return;
        switch (A){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                if(B<1 || B>31)
                    return;
                System.out.println("1 3 5 월 아웃");
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                if(B<1 || B>31)
                    return;
                    System.out.println("4 6 9월 아웃");
                break;
            case 2 :
                if(B<1 || B>28)
                    return;
                    System.out.println("2월 아웃");
                break;
            default :
                System.out.println("A월 아웃");
                break;
        }

    }
}
