package com.algorithm.hackerrank.dynamic;


/**
 * https://www.hackerrank.com/challenges/construct-the-array/problem
 */
public class ConstructTheArray {
    static long countArray(int n, int k, int x) {
        long dp[][] = new long[n][2];

        dp[0][0] = 1;

        for (int i = 1; i < n; i++) {
            dp[i][0] = ((k - 1) * dp[i - 1][1]) % 1000000007;
            dp[i][1] = ((dp[i - 1][0] + ((k - 1) * dp[i - 1][1])) - dp[i - 1][1]) % 1000000007;

        }

        return x == 1 ? dp[n - 1][0] : dp[n - 1][1];
    }
}
