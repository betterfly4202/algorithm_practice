package com.algorithm.youtube.greedy;

public class Solution_2 {
    /*
        N - 1
        N / K

        N = 17
        k = 4
        -> [N-1 = 16] -> [16 / K = 4], [4 /K = 1] => 3회
     */
    public static int solution(int N, int K){

        return recursive(N, K , 0);
    }

    private static int recursive(int N, int K, int cnt){
        if(N == 1){
            return cnt;
        }
        int rest = rest(N,K);
        if (rest != 0){
            if(N < K){
                cnt = cnt + (K-N);
                N = K-N;
            }else{
                cnt = rest;
                N = N - rest;
            }
        }else{
            N = divide(N,K);
            cnt ++;
        }

        return recursive(N, K, cnt);
    }

    private static int divide(int N, int K){
        return N / K;
    }

    private static int rest(int N, int K){
        return N % K;
    }
}
