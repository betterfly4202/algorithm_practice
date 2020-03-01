package com.algorithm.hackerrank.sorting.fraudulentActivityNotifications;

import java.util.*;

public class SolutionFirst {
    static int activityNotifications(int[] expenditure, int d) {
        int result = 0;

        Map<Integer, Integer> alertMap = new HashMap<>();

        for(int i=0; i<expenditure.length-d+1; i++){
            List<Integer> tempList = new ArrayList<>();

            for(int j=i; j<i+d; j++){
                tempList.add(expenditure[j]);
            }

            alertMap.put(i, arrAvg(tempList, d));
        }

        for(int i=0; i<alertMap.size(); i++){
            for(int j=i+d; j<expenditure.length; j++){
                if (alertMap.get(i) <= expenditure[j]){
                    result ++;
                    break;
                }
            }
        }


        return result;
    }

    public static int arrAvg(List<Integer> list , int d){
        int pivot = 0;
        int avg = 0;

        Collections.sort(list);
        if(d%2 == 0){
            // 짝수일때는 가운데 두 수의 평균
            pivot = d/2;
            avg = (list.get(pivot) + list.get(pivot+1)) / 2;

        }else{
            //홀수 일때는 중간 값
            pivot = d/2;
            avg = list.get(pivot);
        }

        return avg*2;
    }
}
