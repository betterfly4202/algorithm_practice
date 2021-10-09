package com.algorithm.yanolja;

import java.util.Arrays;

public class ArrayShift {

    public static int shift(int [] A){
        int result = 0;
        int [] std = new int[A.length];

        for (int i = 0; i <A.length ; i++) {
            std[i] = i+1;
        }

        Arrays.sort(A);

        for (int i = 0; i <A.length ; i++) {
            if(A[i] != std[i]){
                result += A[i] > std[i] ? A[i]-std[i] : std[i] - A[i];
                if (result >= 1_000_000_000){
                    return -1;
                }
            }
        }

        return result;
    }
}
