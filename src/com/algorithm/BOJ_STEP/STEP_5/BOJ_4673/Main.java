package com.algorithm.BOJ_STEP.STEP_5.BOJ_4673;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by betterFLY on 2018. 1. 4.
 * Github : http://github.com/betterfly88
 */

public class Main {
    public static void main(String [] func){
        int plusResult = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<101; i++){
            if(i<10){
                plusResult = i+i;
            }else if(i >= 10){
                String temp = String.valueOf(i);
                int a = Integer.parseInt(String.valueOf(temp.charAt(0)));
                int b = Integer.parseInt(String.valueOf(temp.charAt(1)));
                plusResult = i+a+b;
            }
            list.add(plusResult);
        }

        Ascending asc = new Ascending();
        Collections.sort(list, asc);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
//            if(i != list.get(i)){
//                System.out.println(i);
//            }
        }
    }
}

// 오름차순
class Ascending implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }

}