package com.algorithm.inflearn.recursion;

/**
 * Created by betterFLY on 2017. 11. 6.
 * Github : http://github.com/betterfly88
 */

public class RecursionClass {
    public static void main(String [] args){
        int n = 4;
        int result = recursionSumFunc(n);
        System.out.println("결과 : "+result);
    }

    public static int recursionSumFunc(int k){
        if(k<=0)
            return 0;
        else{
            return k + recursionSumFunc(k-1);
        }
    }
}
