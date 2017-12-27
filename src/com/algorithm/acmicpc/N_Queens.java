package com.algorithm.acmicpc;

/**
 * Created by betterFLY on 2017. 11. 19.
 * Github : http://github.com/betterfly88
 */


/**
 *
 *   N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.

     N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.

     입력
     첫째 줄에 N이 주어진다. (1 ≤ N < 15)

     출력
     첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.

     예제 입력  복사
     8
     예제 출력  복사
     92
 */

public class N_Queens {
    private static int N = 8;
    private static int [] cols = new int [N+1];

    public static void main(String [] nQueen){
//        queens(5);
    }

    public static boolean queens(int level){
        if(!promising(level))
            return false;
        else if(level == N){
            for(int i=1; i<=N; i++)
                System.out.println(" ("+ i +" ,"+cols[i] +")");
            return true;
        }
        for (int i=1; i<=N; i++){
            cols[level+1] = i;
            if(queens(level+1))
                return true;
        }
        return false;
    }

    public static boolean promising(int level){
        for(int i=0; i <level; i++){
            if(cols[i] == cols[level])
                return false;
            else if(level-i == Math.abs(cols[level])-cols[i])
                return false;
        }
        return true;
    }
}