package com.algorithm.BOJ_STEP.STEP_4.BOJ_10871;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 26.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main (String [] das){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        if(N< 1)
            return;
        if(X > 10000)
            return;

        List<Integer> list = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        for(int i=0;i<N;i++){
            int A = (int)(Math.random()*N)+1;

            output.add(A);
            if(X > A) {
                list.add(A);
            }
        }
        for(int i=0; i<output.size(); i++){
            System.out.print(output.get(i)+" ");
        }

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}