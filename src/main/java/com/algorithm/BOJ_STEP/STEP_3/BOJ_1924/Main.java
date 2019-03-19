package com.algorithm.BOJ_STEP.STEP_3.BOJ_1924;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 19.
 * Github : http://github.com/betterfly88
 */

public class Main {
    static int untilDays = 0;
    static String day = null;
    public static void main(String [] calender){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int tempDays = 0;

        if(A<1 || A>12)
            return;
        if(B<1 || B>31)
            return;

        for(int j=1; j<=A-1; j++){
            tempDays += getTotalDays(j);
        }
        System.out.println(resultDay(tempDays+B));
    }

    public static int getTotalDays(int A){
        switch (A){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
                untilDays = 31;
                break;
            case 4 :
            case 6 :
            case 9 :
            case 11 :
                untilDays = 30;
                break;
            case 2 :
                untilDays = 28;
                break;
            default :
                break;
        }

        return untilDays;
    }

    public static String resultDay(int totalDays){
        switch (totalDays % 7){
            case 0 :
                day = "SUN";
                break;
            case 1 :
                day = "MON";
                break;
            case 2 :
                day = "TUE";
                break;
            case 3 :
                day = "WED";
                break;
            case 4 :
                day = "THU";
                break;
            case 5 :
                day = "FRI";
                break;
            case 6 :
                day = "SAT";
                break;
        }
        return day;
    }
}
