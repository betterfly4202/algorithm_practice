package com.algorithm.BOJ_STEP.STEP_7.BOJ_2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int insertNum = sc.nextInt();
        String [] str = new String[insertNum+1];

        for (int i = 0; i < insertNum+1; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 1; i <insertNum+1 ; i++) {
            System.out.print(loop(str[i]+ " "));
            if (i != insertNum){
                System.out.println();
            }
        }
    }

    public static String loop(String S){

        StringBuilder sb = new StringBuilder();
        int loopCount = Integer.parseInt(S.split(" ")[0]);
        String target = S.split(" ")[1];
        for (int i = 0; i <target.length(); i++) {
            for (int j = 0; j <loopCount ; j++) {
                sb.append(target.charAt(i));
            }
        }

        return sb.toString();
    }
}
