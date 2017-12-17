package com.algorithm.BOJ.BOJ_2839;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 17.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] sugar){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 4 || N > 4999){
            System.out.println("N의 값은 3보다 크고 5000보다 작아야 합니다.");
            return;
        }
        System.out.println(deliverySugar(N));
    }
    static int result = 0;
    public static int deliverySugar(int N){
        if (N == 0) {
            return result;
        }

//        if(N%3==0 && (N%5) < 3){
        if(N<10 && N%3==0){
            result += N / 3;
            return deliverySugar( N % 3);
        }

        if(N > 4){
            result += N / 5;
            return deliverySugar(N % 5);
        }else if(N > 2){
            result += N / 3;
            return deliverySugar( N % 3);
        }else{
            return -1;
        }
    }
}
