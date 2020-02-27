package com.algorithm.hackerrank.search.gridlandMetro;

import java.util.Arrays;
import java.util.Comparator;

public class MergeOverlappingIntervals {
    public static void mergeIntervals(Interval arr[]){
        Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2){
                return i2.start - i1.start;
            }
        });

        int index = 0;
        for (int i=1; i<arr.length; i++){
            if (arr[index].end >=  arr[i].start)
            {
                arr[index].end = Math.max(arr[index].end, arr[i].end);
                arr[index].start = Math.min(arr[index].start, arr[i].start);
            }
            else {
                arr[index] = arr[i];
                index++;
            }
        }

        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++){
            System.out.print("[" + arr[i].start + ","
                    + arr[i].end + "]");
        }
    }
}
