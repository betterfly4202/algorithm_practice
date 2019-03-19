package com.algorithm.STUnitas.actual_test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 8. 23.
 * Github : http://github.com/betterfly88
 */

/*
    선행기술개발실은 현재 10명이다. 카자흐스탄에서 온 줌마는 이름 외우기가 귀찮아 각 사원들에게 1번부터 10번까지의 번호를 부여하고 준비해온 초콜릿뇌물을 선물하려고 한다.
    숫자를 좋아하는 줌마는 각 초콜릿마다 고유번호를 매겨두었다.

    1번 초콜릿은 1번 사원이, 2번 초콜릿은 2번 사원이, 3번 초콜릿은 3번 사원이, ... ,

    10번 초콜릿은 10번 사원이, 11번 초콜릿은 1번 사원이, 12번 초콜릿은 2번 사원이, ...

    총 초콜릿의 개수는 항상 a^b개의 형태로 주어진다. 줌마는 문득 마지막 초콜릿을 먹게될 사원의 번호가 궁금해졌다. 이를 수행해주는 프로그램을 작성하라.

    입력
    5
    1 6
    3 7
    6 2
    7 100
    9 635

    출력
    1
    7
    6
    1
    9
 */

public class solution_1 {
    public static void main(String [] args){
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = null;
//        int a

        Scanner sc = new Scanner(System.in);
        int TestCase = sc.nextInt();
        String caseOne = sc.nextLine();

//        int B = sc.nextInt();
        System.out.println(TestCase);
        System.out.println(caseOne);

//        System.out.println(3^7);

    }
}
