package com.algorithm.hackerrank.diagonalDifference;

import java.util.List;

public class Solution {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int [][] calArr = new int[arr.size()][2];
        int reverseIndex = arr.get(0).size() -1;

        int left = 0;
        int right = 0;
        for (int i = 0; i < arr.size(); i++) {
            calArr[i][0]= arr.get(i).get(i);
            calArr[i][1]= arr.get(i).get(reverseIndex);

            left += arr.get(i).get(i);
            right += arr.get(i).get(reverseIndex);

            reverseIndex --;
        }


        return Math.abs(left-right);
    }
}
