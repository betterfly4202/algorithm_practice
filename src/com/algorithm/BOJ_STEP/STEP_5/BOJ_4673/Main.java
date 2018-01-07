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
    static int plusNum = 0;
    public static void main(String [] func){
        List<Integer> list = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for(int i=1; i<10001; i++){
            if(i<10){
                plusNum = i+i;
            }else if(i >= 10){
                String temp = String.valueOf(i);
                int tempNum[] = new int[temp.length()];
                for(int j=0; j<temp.length(); j++){
                    tempNum[j] = Integer.parseInt(String.valueOf(temp.charAt(j)));
                    if(j<1){
                        plusNum = i+tempNum[j];
                    }else{
                        plusNum += tempNum[j];
                    }
                }
            }
            list.add(plusNum);
        }
        Ascending asc = new Ascending();
        Collections.sort(list, asc);
        for(int i=1; i<list.size(); i++){
            if(!list.contains(i)){
                resultList.add(i);
            }
        }

        for(int i=0; i <resultList.size();i++){
            System.out.println(resultList.get(i));
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