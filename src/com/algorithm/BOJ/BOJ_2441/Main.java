package com.algorithm.BOJ.BOJ_2441;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 18.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        if(A<0 || A>100)
            return;

        boolean flag = false;
        for(int i=A; i>0; i--){
            flag = false;
            for(int j=i; j>0; j--){
                for(int h=0; h<A-i; h++){
                    if(flag == false)
                    System.out.print(" ");
                }
                System.out.print("*");
                flag = true;
            }
            System.out.println("");
        }
    }
}
