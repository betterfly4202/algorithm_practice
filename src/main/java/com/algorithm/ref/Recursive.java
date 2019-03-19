package com.algorithm.ref;

/**
 * Created by betterFLY on 2018. 8. 19.
 * Github : http://github.com/betterfly88
 */

public class Recursive {
    final static int a = 5;
    final String dd = "zz";

    public static void main(String [] args){
//        System.out.println(recursive(100));

        System.out.println(a);
    }

    public static int recursive(int n){
        if(n == 1){
            return n;
        }
        return n + recursive(n - 1);
    }
}
