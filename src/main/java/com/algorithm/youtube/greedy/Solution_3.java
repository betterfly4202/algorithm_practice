package com.algorithm.youtube.greedy;

public class Solution_3 {
    /*
        0~9까지 주어진 문자열 S
        각 숫자에 대해서 '*', '+' 연산자를 넣어서 만들어 질 수 있는 가장 큰 수를 구하기
        (+, * 연산의 일반적인 연산이 아닌, 모든 연산은 왼쪽부터 오른쪽 순서대로 연산 처리)

        예를들어, 02984 의 가장 큰 수는 ((((0+2)*9) * 8) * 4) = 576
    */
    public static int solution(String S){
        int result = 0;
        int first = Integer.parseInt(String.valueOf(S.charAt(0)));
        int second = Integer.parseInt(String.valueOf(S.charAt(1)));


        if (S.length() > 2){
            result = getResult(S, first, second);
        }else {
            return getResult(S, first, second);
        }

        for (int i = 2; i <S.length() ; i++) {
            int v = Integer.parseInt(String.valueOf(S.charAt(i)));

            if(v == 0 || v == 1){
                result += v;
            }else{
                result *= v;
            }
        }

        return result;
    }

    private static int getResult(String S, int first, int second) {
        int result = 0;
        if (S.substring(0, 2).contains("0") || S.substring(0, 2).contains("1")){
            result = first + second;
        }else {
            result = first * second;
        }
        return result;
    }


}
