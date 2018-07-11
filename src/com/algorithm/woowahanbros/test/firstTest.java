package com.algorithm.woowahanbros.test;

import java.util.Stack;

/**
 * Created by betterFLY on 2018. 7. 6.
 * Github : http://github.com/betterfly88
 */

public class firstTest {

    /*
     *  요구사항
     *  정수 X (0과 2^20 - 1사이) : 기계가 스택에 X를 푸시
     *  POP : 기계가 스택에서 맨 위에 번호를 제거
     *  DUP : 기계가 최상위 번호의 중복을 스택으로 푸시
     *  + : 스택에서 맨 위에 있는 두개의 원소를 띄우고 합쳐서 합계를 스택에 푸시
     *  - : 스택에서 두 개의 최상위 요소를 팝하고, 첫 번째(최상위) 요소에서 두 번째 요소를 뺴고 스택에 밀어 넣음
     *
     *  모든 작업을 처리 한 후 스택에서 최상위 값을 반환
     *
     */

    static Stack<Integer> integerStack = new Stack<>();

    public static void main(String [] args){
        String problem =  "13 DUP 4 POP 5 DUP + DUP + -";
        String [] spl = problem.split("\\s");

        for(String value : spl){
            if(isInteger(value)){
                integerStack.push(Integer.parseInt(value));
            }
            selectOperator(value);
        }

        int result = integerStack.pop();
        System.out.println(result);
    }

    public static void selectOperator(String value){
        switch(value){
            case "POP" : isPop();
                break;
            case "DUP" : isDuplicate();
                break;
            case "+" : isPlus();
                break;
            case "-" : isMinus();
                break;
        }
    }

    public static boolean isInteger(String value){
        try{
            Integer.parseInt(value);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public static void isPop(){
        integerStack.pop();
    }

    public static void isDuplicate(){
        integerStack.push(integerStack.peek());
    }

    public static void isPlus(){
        int v1 = integerStack.pop();
        int v2 = integerStack.pop();
        integerStack.push(v1+v2);
    }

    public static void isMinus(){
        int v1 = integerStack.pop();
        int v2 = integerStack.pop();
        integerStack.push(v1-v2);
    }

}
