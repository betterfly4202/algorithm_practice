package com.algorithm.BOJ_STEP.STEP_3.BOJ_1463;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 17.
 * Github : http://github.com/betterfly88
 */

/**
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

    - X가 3으로 나누어 떨어지면, 3으로 나눈다.
    - X가 2로 나누어 떨어지면, 2로 나눈다.
    - 1을 뺀다.

    정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최소값을 출력하시오.

    <입력>
    첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 자연수 N이 주어진다.

    <출력>
    첫째 줄에 연산을 하는 횟수의 최소값을 출력한다.

    <예시>
    입력 : 10 --> 출력 : 3 (10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.)
 */

public class Main {
    static int resultCount = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int insertNum = sc.nextInt();
        if(insertNum < 1 || insertNum > 1000000){
            System.out.println("1부터 999999까지의 자연수만 입력 가능합니다");
            return;
        }
        System.out.println("최종 결과 : "+result(insertNum));
    }

    public static int result(int insertNum){
        if (insertNum % 3 == 0) {
            resultCount++;
            return result(insertNum/3);
        }else if(insertNum > 1){
            resultCount++;
            return result(insertNum - 1);
        }
        else if(insertNum % 2 ==0) {
            resultCount++;
            return result(insertNum / 2);
        }else{
            return resultCount;
        }
    }
}