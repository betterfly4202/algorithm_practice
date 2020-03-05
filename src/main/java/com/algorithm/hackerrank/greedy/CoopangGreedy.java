package com.algorithm.hackerrank.greedy;

import java.util.*;

public class CoopangGreedy {
    /*
        [[1,3],[2,6],[8,10],[15,18]]
        [[1,6],[8,10],[15,18]]

        [[1,3],[4,6]]
        [[1,3],[4,6]]

        [[1,3],[4,6],[8,10],[15,18],[2,4]]
        [[1,3],[2,4],[4,6],[8,10],[15,18],]
        [[1,6],[8,10],[15,18]]
    */
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        List<List<Integer>> calList = new Stack<>();

        for (int i = 0; i <intervals.length ; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(intervals[i][0]);
            temp.add(intervals[i][1]);

            calList.add(temp);
        }

        int idx = 0;
        while (true) {
            if(calList.size()-1 == idx){
                break;
            }

            List<Integer> left = calList.get(idx);
            List<Integer> right = calList.get(idx+1);

            int leftMax = left.get(1);
            int rightMin = right.get(0);

            if(leftMax >= rightMin){
                calList.get(idx).set(0, left.get(0));
                calList.get(idx).set(1, right.get(1));
                calList.remove(idx+1);
            }else{
                idx++;
            }
        }

        return null;
    }
    private static List<Integer> merge(int[][] left, int[][] right){
        List<Integer> tempList = new ArrayList<>();


        return tempList;
    }

}
