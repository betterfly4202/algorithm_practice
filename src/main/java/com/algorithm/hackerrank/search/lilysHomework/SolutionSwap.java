package com.algorithm.hackerrank.search.lilysHomework;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SolutionSwap {
    static int lilysHomework(int[] arr) {
        int result = 0;

        for(int i=0; i<arr.length-1; i++){
            int temp = Integer.MAX_VALUE;
            int jIdx = 0;
            for(int j=i; j<arr.length; j++){
                if (temp > arr[j]){
                    temp = arr[j];
                    jIdx = j;
                }
            }

            if(temp != 0 && arr[i] > temp){
                arr = swap(arr, i, temp, jIdx);
                result ++;
            }
        }

        return result;
    }

    private static int[] swap(int[] arr, int i, int temp, int jIdx) {
        int iTemp = arr[i];
        arr[i] = temp;
        arr[jIdx] = iTemp;

        return arr;
    }


    static int lilysHomeworkWithList(int[] arr) {
        int result = 0;

        List<Integer> list = IntStream.range(0, arr.length)
                .map(i -> arr[i])
                .boxed()
                .collect(Collectors.toList());

        for(int i=0; i<list.size()-1; i++){
            int std = list.get(i);
            int jIdx = 0;

            for(int j=i+1; j<list.size(); j++){
                if(std > list.get(j)){
                    std = list.get(j);
                    jIdx = j;
                }
            }

            if(list.get(i) != std){
                list.remove(jIdx);
                list.add(i, std);
                result++;
            }
        }

        return result;
    }
}
