package com.algorithm.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by betterfly
 * Date : 2019.08.07
 */
public class Solution_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println(pairCount(arr));
    }
    
    public static int pairCount(int [] arr){
        int i=0;
        int cnt = 0;

        while(i < arr.length){
            if(i+1 >= arr.length){
                break;
            }

            for(int k=i+1; k<arr.length; k++){
                if(arr[i] == arr[k]){
                    cnt++;
                }
            }
            i++;
        }

        return cnt;
    }
}
