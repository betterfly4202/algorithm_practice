package com.algorithm.BOJ_STEP.STEP_4.BOJ_10871;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by betterFLY on 2017. 12. 26.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main (String [] das) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        if(N < 1 || X < 1)
            return;
        if(N > 10000 || X > 10000)
            return;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        StringTokenizer str = new StringTokenizer(number," ");

        List<Integer> list = new ArrayList<>();

//        for(int i=0;i<N;i++){
//            int A = Integer.valueOf(str.nextToken());
//            if(X > A) {
//                list.add(A);
//            }
//        }
        while(str.hasMoreTokens()){
            int A = Integer.valueOf(str.nextToken());
            if(X > A){
                list.add(A);
            }
        }

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
    }
}