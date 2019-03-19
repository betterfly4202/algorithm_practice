package com.algorithm.BOJ_STEP.STEP_3.BOJ_11721;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by betterFLY on 2017. 12. 21.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] split){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if(A.length()<1 || A.length()>100)
            return;

        List<String> resultList = setStringList(A);
        for(int i=0; i<resultList.size();i++){
            System.out.println(resultList.get(i));
        }
    }


    public static List<String> setStringList(String insertString){
        List<String> tempList = new ArrayList<>();
        int cnt = insertString.length()/10;
        for(int i=0; i < cnt+1 ;i++){
            if(insertString.length()>9){
                tempList.add(insertString.substring(0,10));
                insertString = insertString.substring(10);
            }else{
                tempList.add(insertString);
            }
        }
        return tempList;
    }
}
