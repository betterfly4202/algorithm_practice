package com.algorithm.hackerrank.sorting.fraudulentActivityNotifications;

public class SolutionFinal {
    static int activityNotifications(int[] expenditure, int d) {
        int count = 0;
        int[] tmpArr = new int[201];

        for(int i = 0 ; i < d ; i++) {
            tmpArr[expenditure[i]]++;
        }

        for(int i = d ; i < expenditure.length ; i++) {
            double median = medianCalculator(tmpArr, d);
            if(median*2 <= expenditure[i]) {
                count++;
            }
            tmpArr[expenditure[i-d]]--;
            tmpArr[expenditure[i]]++;
        }
        return count;

    }

    static double medianCalculator(int[] tmpArr, int d) {
        int count = 0;
        double result = 0;

        if(d%2 != 0) {
            for(int i = 0 ; i < tmpArr.length ; i++) {
                count += tmpArr[i];
                if(count > d/2) {
                    result = i;
                    break;
                }
            }
        }else {
            int ftmpC = 0;
            int stmpC = 0;
            for(int i = 0 ; i < tmpArr.length ; i++) {
                count += tmpArr[i];
                if(ftmpC == 0 && count >= d/2) {
                    ftmpC = i;
                }

                if(stmpC == 0 && count >= d/2+1) {
                    stmpC = i;
                    break;
                }
            }
            result = (ftmpC+stmpC) /2.0;
        }
        return result;
    }
}
