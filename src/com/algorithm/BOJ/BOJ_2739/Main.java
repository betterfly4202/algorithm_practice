package com.algorithm.BOJ.BOJ_2739;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 18.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] gugudan){
       Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       if(A > 10)
           return;
       for(int i=1; i<10; i++){
           System.out.println(A+" * "+i+" = "+A*i);
       }
    }
}
