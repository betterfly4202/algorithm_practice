package com.algorithm.hackerrank.sorting.fraudulentActivityNotifications;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by betterfly
 * Date : 2019.08.12
 * URL : https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem
 */
public class Solution {
    static int executor(int[] arr, int range) {
        for (int i = 0; i < range; i++) {
            if(i < arr.length - range){
                System.out.println();
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
            }
        }


        return arr[1];
    }

    public static void main(String[] args) {

    }
}
