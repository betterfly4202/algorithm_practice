package com.algorithm.acmicpc.greedy;

import java.util.Scanner;
import java.util.Stack;

/*
    https://www.acmicpc.net/problem/11047
    필요한 동전 개수의 최솟값
     첫째 줄 , (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
     둘째 줄 , (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 */
public class CoinZero {
    /*
        배수가 있다는게 어떤 힌트로 쓸 수 있을까
        최대 1,000,000
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String line = sc.nextLine();

        int n = Integer.parseInt(line.split(" ")[0]);
        int k = Integer.parseInt(line.split(" ")[1]);

        int [] arr = new int[10];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(coinZero(arr, k));
    }

    public static int coinZero(int [] coinArr, int k){
        int result = 0;

        Stack<Integer> target = splitArr(k);

        for (int i = 0; i < getValueLength(k); i++) {
            int targetNum = target.pop();
            int valueLength = i+1;

            if(targetNum != 0){
                for (int j = coinArr.length-1; j >= 0; j--) {
                    if(valueLength == getValueLength(coinArr[j])){
                        int dividedNum = firstNum(coinArr[j]);
                        if(targetNum/dividedNum != 0){
                            result += targetNum/dividedNum;
                            targetNum -= dividedNum;
                            if (targetNum%dividedNum == 0){
                                break;
                            }
                        }
                    }
                }
            }
        }

        return result;
    }

    private static int getValueLength(int val){
        return (int)(Math.log10(val)+1);
    }

    private static int firstNum(int val){
        return Integer.parseInt(String.valueOf(val).substring(0, 1));
    }

    private static Stack<Integer> splitArr (int k){
        String parseString = String.valueOf(k);
        Stack<Integer> numStack = new Stack<>();
        for (int i = 0; i < parseString.length(); i++) {
            numStack.add(Integer.parseInt(parseString.substring(i, i+1)));
        }

        return numStack;
    }
}
