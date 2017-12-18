package com.algorithm.BOJ.BOJ_2839;

import java.util.Scanner;

public class Main {
    public static void main(String [] sugar){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N < 3 || N > 5000){
            return;
        }
        System.out.println(deliverySugar(N));
    }
    static int result = 0;
    public static int deliverySugar(int N) {
        if (N == 0) {
            return result;
        }
        if (N%5==0 || N % 5 == 3 && N > 4) {
            result++;
            return deliverySugar(N - 5);
        } else if (N > 2) {
            result++;
            return deliverySugar( N - 3);
        }else{
            return -1;
        }
    }
}