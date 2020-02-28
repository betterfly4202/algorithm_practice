package com.algorithm.hackerrank.search.lilysHomework;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    static int lilysHomework(int[] arr) {
        int result = 0;

        List<Integer> list = new ArrayList<>();
//        List<Integer> list = IntStream.range(0, arr.length)
//                .map(i -> arr[i])
//                .boxed()
//                .collect(Collectors.toList());

        for (int v : arr) {
            list.add(v);
        }


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
