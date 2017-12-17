package com.algorithm.inflearn.recursion;

/**
 * Created by betterFLY on 2017. 11. 6.
 * Github : http://github.com/betterfly88
 */

public class RecursionThinking {

    public static void main(String [] chungil){

        // 문자열 잘라 넣기
        printChars("betterfly");
    }

    public static void printChars(String str){
        if (str.length() == 0) {
            return;
        }else{
            System.out.println(str.charAt(0));
            printChars(str.substring(1));
        }
    }

    public static void printReverseChars(String str){

    }

}
