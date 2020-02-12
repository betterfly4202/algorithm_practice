package com.algorithm.yanolja;

import java.util.ArrayList;
import java.util.List;

public class Tow {
    public static int solution(int [] A){
        int result = 1;

        List<Integer> pointList = new ArrayList<>();
        pointList.add(1);

        for(int i=1; i<A.length-1; i++){
            if(A[i] == A[i+1]){
                pointList.clear();
                pointList.add(i);
                continue;
            }


            if(i+1 == A.length-1){
                if(A[pointList.get(0)-1] > A[i] && A[i+1] > A[i]
                        || A[pointList.get(0)-1] < A[i] && A[i+1] < A[i]){
                    result += 2;
                    break;
                }else{
                    result ++;
                    break;
                }
            }



            if(A[i] != A[i+1]){

                if(i+1 < A.length){
                    // 계곡
                    if(A[pointList.get(0)-1] > A[i] && A[i+1] > A[i]){
                        result++;
                        pointList.clear();
                        pointList.add(i);
                        continue;
                    }

                    // 언덕
                    if(A[pointList.get(0)-1] < A[i] && A[i+1] < A[i]){
                        result++;
                        pointList.clear();
                        pointList.add(i);
                        continue;
                    }

                    // 둘 다 아닌 경우
                    pointList.clear();
                    pointList.add(i);
                }

            }

        }

        return result;
    }
}
