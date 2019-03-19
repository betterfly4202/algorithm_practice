package com.algorithm.inflearn.recursion;

/**
 * Created by betterFLY on 2018-01-08.
 */
public class Multiplication {
    public static void main (String [] multi){
        System.out.println(multiple(10));
    }

    public static int multiple(int a){

        if(a < 2)
            return a;

        return a * multiple(a-1);
    }
}
