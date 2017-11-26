package com.algorithm.stduy;

import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 11. 26.
 * Github : http://github.com/betterfly88
 */



/*
피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.

n=17일때 까지 피보나치 수를 써보면 다음과 같다.

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.
 */
public class FibonacciFunction {

    public static void main(String [] pibo){
//        int n;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("피보나치 수열의 수를 입력하세요 : ");
//        n = scanner.nextInt();
//        if(n<1 || n>1000){
//            System.out.println("0부터 1000까지의 수를 입력해주세요.");
//        }else{
//            System.out.println("1~n까지의 합은 : ["+fibonacci(n)+"] 입니다");
//        }

        System.out.println(maxGong(5,9));
    }

    public static int fibonacci(int n){
        if(n < 2)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);

    }


    //최대 공약수 문제...
    public static int maxGong(int a, int b){
        if(b == 0){
            System.out.println("a == "+a);
            return a;
        }
        else{
            System.out.println("a % b == "+a%b);
            return maxGong(b, a%b);
        }
    }
}
