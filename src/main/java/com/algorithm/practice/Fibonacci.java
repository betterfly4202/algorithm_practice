package com.algorithm.practice;

public class Fibonacci {
    public static int fibo(int n){
        if(n <= 1){
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

}
