package com.algorithm.yanolja;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Four {

    public static int solution(int[] A) {


        return Collections.min(integerList(A));
    }

    public static List<Integer> integerList(int [] A){
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<A.length-1; i++){

            if(i+2 < A.length-1){
                for(int j=i+2; j<A.length-1; j++){
                    if (list.size() == 3){
                        return list;
                    }

                    list.add(A[i] + A[j]);
                }
            }
        }

        return list;
    }
}
