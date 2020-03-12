package com.algorithm.hackerrank.dynamic.substring;

// https://www.hackerrank.com/challenges/sam-and-substrings/forum
public class Solution {
    private static final double MOD   = (Math.pow(10,9)) + 7;
    private static final double LIMIT = (Math.pow(10,5)) * 2;

    static int substrings(String n) {
        int result = 0;

        for(int i=0; i<n.length(); i++){
            result += substringCalculator(n, n.length()-i, i+1);
        }
        return result;
    }

    private static int substringCalculator(String n, int length, int next){
        int result = 0;
        for(int i=0; i<length; i++) {
            int calNum = Integer.parseInt(n.substring(i, i + next));

            if(calNum > LIMIT){
                calNum %= MOD;
            }
            result += calNum;
        }

        return result;
    }

    static int fib(int n){
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
