package com.algorithm.BOJ_STEP.STEP_4.BOJ_1463;

import java.util.Scanner;

/*
    정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

    X가 3으로 나누어 떨어지면, 3으로 나눈다.
    X가 2로 나누어 떨어지면, 2로 나눈다.
    1을 뺀다.
    정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.


 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int insertNum = sc.nextInt();
        if(insertNum < 1 || insertNum > 1000000){
            System.out.println("1부터 999999까지의 자연수만 입력 가능합니다");
            return;
        }
        System.out.println("최종 결과 : "+recursive(insertNum, 0));
    }

    public static int recursive(int X, int cnt){
        if(X == 1){
            return cnt;
        }

        switch(X%3){
            case 2 : X = X/2;
                break;
            case 1 : X = X-1;
                break;
            case 0 : X = X/3;
                break;
        }
        cnt++;

        return recursive(X, cnt);
    }
}
