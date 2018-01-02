package com.algorithm.BOJ_STEP.STEP_4.BOJ_1110;

import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 1. 3.
 * Github : http://github.com/betterfly88
 */

public class Main {
    static String N = null;
    static int cnt = 0;
    public static void main(String [] concentrate){
        Scanner sc= new Scanner(System.in);

        N = sc.next();

        if(Integer.parseInt(N) < 10)
            N = '0'+N;

        int a = Integer.parseInt(String.valueOf(N.charAt(0)));
        int b = Integer.parseInt(String.valueOf(N.charAt(1)));

        String resultOne = String.valueOf(a+b);
        cnt++;
        if(resultOne == N){
            System.out.println(cnt);
        }else{
            getResult(b, resultOne);
        }
        System.out.println(cnt);
    }

    public static String getResult(int b, String get){
        if(get.length()==1) {
            get = '0' + get;
        }
        String result = String.valueOf(b)+String.valueOf(get.charAt(1));
        if(result.equals(N)){
            return result;
        }

        int d = Integer.parseInt(String.valueOf(get.charAt(1)));
        String c = String.valueOf(b+d);
        cnt++;
        return getResult(d, c);
    }
}
