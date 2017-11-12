package com.algorithm.master;

/**
 * Created by betterFLY on 2017. 11. 6.
 * Github : http://github.com/betterfly88
 */

public class RecursionClass {
    public static void main(String [] args){
        // fibonacci test
        int n=10;

        int resultValue=0;
        for(int i=0; i<n; i++){
            resultValue+=fibonacciFunc(n);
        }
        System.out.println("Fibonacci result : "+resultValue);

        // euclidMethod test
        System.out.println("euclidMethod result : "+euclidMethod(6,35));
    }

    // Fibonacci Number
    public static int fibonacciFunc(int n){
        if(n < 2){
            return n;
        }else{
            return fibonacciFunc(n-1)+fibonacciFunc(n-2);
        }
    }

    // euclidMethod
    public static int euclidMethod(int a, int b){
        if(a>b){
            int temp = b;
            b = a;
            a = temp;
        }
        if(b%a == 0){
            return a;
        }else{
            return euclidMethod(a, b%a);
        }
    }
}
