package com.algorithm.hackerrank.search.iceCreamParlor;

/**
 * Created by betterfly
 * Date : 2020.02.12
 * URL : https://www.hackerrank.com/challenges/icecream-parlor/problem
 */
public class Solution {

    static int[] icecreamParlor(int m, int[] arr) {
        for(int i=0; i<arr.length; i++){
            int start = arr[i];

            if(i+1 < arr.length){
                for(int j=i+1; j<arr.length; j++){

                    if(start+arr[j] == m){
                        return new int[]{i+1, j+1};
                    }
                }
            }

        }
        return null;
    }
}
