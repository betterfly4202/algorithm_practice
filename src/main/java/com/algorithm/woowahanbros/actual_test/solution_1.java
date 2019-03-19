package com.algorithm.woowahanbros.actual_test;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by betterFLY on 2018. 8. 11.
 * Github : http://github.com/betterfly88
 */

/*
    3개의 숫자를 더하여 술래가 원하는 숫자를 만드세요

      문제의 입력값은 각 언어의 표준입력(stdin) 함수를, 출력값은 표준출력(stdout) 함수를 사용해주세요.
    우아한형제들의 주문팀은 팀워크 향상을 위하여 가평으로 워크숍을 가게 됐습니다.

    주문팀 팀원 A는 워크숍에서 팀원들끼리 같이 할 수 있는 게임을 생각하던 중 숫자를 이용한 게임을 떠올리게 됩니다.

    0-20까지의 숫자 중 무작위로 하나가 적힌 종이를 바닥에 여러 장 뿌려놓고 술래가 숫자 하나를 크게 외칩니다.

    술래를 제외한 나머지 팀원들은 바닥에 뿌려진 종이 중 3장을 집어 종이에 적힌 숫자의 합이 술래가 외친 숫자와 같다면 게임에서 승리하게 됩니다.



    입력조건

    1. 표준입력으로 첫 번째 줄에는 0에서 20까지의 int형 숫자들이 공백으로 구분되어 최대 20개까지 주어집니다.

    2. 최대 20개의 숫자는 중복되어 주어질 수 있고, 정렬되지 않았습니다.

    3. 표준입력으로 두 번째 줄에는 술래가 외친 숫자 하나가 주어집니다.


    출력조건

    1. 결괏값으로 3개의 숫자는 왼쪽부터 오름차순으로 출력되어야 합니다. 1 3 2가 답이라면 1 2 3으로 출력해야 합니다.

    2. 결괏값으로 3개의 숫자는 아래로 오름차순으로 출력되어야 합니다. 1 5 2, 1 3 4이 결괏값이라면 1 3 4를 먼저 출력해야 합니다.

    3. 결괏값으로 3개 숫자의 조합 중 같은 조합이 여러 개 존재한다면 한 번만 출력해야 합니다. 1 2 3, 1 2 3이 결괏값이라면 1 2 3 한 번만 출력되어야 합니다.

    4. 결괏값이 없다면 NO를 출력합니다.


 */

public class solution_1{
    static ArrayList<Integer> gameNumList = new ArrayList<>();
    static StringBuffer sb = new StringBuffer();

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String secondInput = br.readLine();
        int taggerNum = Integer.parseInt(secondInput);

        gameNumList = setInputNumList(input);

        if(failedGame(taggerNum)){
            sb.append("NO");
        }else{
            resultGame(taggerNum);


        }



        System.out.println(sb);
    }

    public static ArrayList<Integer> setInputNumList(String input){
        String [] unitNum = input.split("\\s");
        for(String temp : unitNum){
            int inputNum = Integer.parseInt(temp);
            exitProcess(inputNum);
            gameNumList.add(inputNum);
        }
        Collections.sort(gameNumList, Integer::compareTo);

        return gameNumList;
    }

    public static void resultGame(int taggerNum){
        int iterNum = gameNumList.size() - gameNumList.size() % 3;

        for(int i=0; i<iterNum; i++){
            int firstNum = gameNumList.get(i);
            for(int k=i+1; k <gameNumList.size(); k++){
                int secondNum = gameNumList.get(k);
                for(int j=k+1; j <gameNumList.size(); j++){
                    int thirdNum = gameNumList.get(j);

                    int tempSum =firstNum + secondNum + thirdNum;
                    if(tempSum == taggerNum){
                        sb.append(firstNum).append(" ").append(secondNum).append(" ").append(thirdNum).append("\n");
                    }
                }
            }
        }

        if(sb.length() < 1){
            sb.append("NO");
        }
    }

    private static void exitProcess(int inputNum){
        if(inputNum > 20){
            System.out.println("20보다 작은수를 입력해주세요.");
            System.exit(0);
        }
    }

    public static boolean failedGame(int taggerNum){
        int sum = 0;
        for(int i=0; i<3; i++){
            sum += gameNumList.get(i);
        }

        if (sum < taggerNum){
            return false;
        }
        return true;
    }

}
