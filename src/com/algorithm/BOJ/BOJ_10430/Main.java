package com.algorithm.BOJ.BOJ_10430;


import java.util.Scanner;
public class Main {
    public static void main(String [] fight){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if(A <= 2 || A >= 10000 || B<=2 || B>= 10000 || C<=2 || C>=10000){
            System.out.println("2부터 10000까지의 자연수를 입력해주세요.");
            return;
        }
        System.out.println((A+B)%C);
        System.out.println((A%C + B%C)%C);
        System.out.println((A*B)%C);
        System.out.println((A%C * B%C)%C);
    }
}