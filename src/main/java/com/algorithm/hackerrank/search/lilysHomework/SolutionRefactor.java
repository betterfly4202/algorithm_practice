package com.algorithm.hackerrank.search.lilysHomework;

import java.util.Arrays;

public class SolutionRefactor {
    static int lilysHomework(int[] arr) {
        int result = 0;

        int descArr [] = new int[arr.length];
        System.arraycopy(arr, 0, descArr, 0, arr.length);

        // 오름차순 배열, 내림차순 배열 각각 준비
        int [] ascArr = new int [arr.length];
        Arrays.sort(ascArr);
        for(int i=0; i<arr.length; i++){

        }

        return result;
    }
}
