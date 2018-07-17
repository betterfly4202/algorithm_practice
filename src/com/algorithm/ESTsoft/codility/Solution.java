package com.algorithm.ESTsoft.codility;

import java.util.ArrayList;

/**
 * Created by betterFLY on 2018. 7. 17.
 * Github : http://github.com/betterfly88
 */


/*
    that, given an array A consisting of N integers, returns the number of distinct values in array A.

    Assume that:

    N is an integer within the range [0..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].
    For example, given array A consisting of six elements such that:

     A[0] = 2    A[1] = 1    A[2] = 1
     A[3] = 2    A[4] = 3    A[5] = 1
    the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

    Complexity:

    expected worst-case time complexity is O(N*log(N));
    expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
 */

public class Solution {
    public static void main (String [] args){
        int [] A = new int[6];
        A[0] = 2; A[1] = 1; A[2] = 1;
        A[3] = 2; A[4] = 3; A[5] = 1;

        ArrayList<Integer> resultList = setResultList(A);
        int resultValues = getResultValues(resultList);

        System.out.println(resultValues);

    }

    private static ArrayList<Integer> setResultList(int [] A){
        ArrayList<Integer> resultArray = new ArrayList<>();

        for (int values : A) {
            if(!resultArray.contains(values)){
                resultArray.add(values);
            }
        }

        return resultArray;
    }

    private static int getResultValues(ArrayList<Integer> resultList){
        int result = 0;
        for (int values : resultList){
            if(values > result){
                result = values;
            }
        }
        return result;
    }
}
