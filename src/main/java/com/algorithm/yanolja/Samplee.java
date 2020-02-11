package com.algorithm.yanolja;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Samplee {
    private static final String CODILITY = "Codility";
    private static final String TEST = "Test";
    private static final String CODERS = "Coders";

    public static void solution(int N) {
        Map<Integer, String> solutionMap = getMap();

        for(int i=1; i<=N; i++){

            boolean flag = false;
            int temp = 0;
            for (Integer key : solutionMap.keySet()){
                if(i%key == 0) {
                    temp = key;
                    flag = true;
                }
            }

            if(flag){
                System.out.println(solutionMap.get(temp));
                continue;
            }

            System.out.println(i);
        }

    }

    public static Map<Integer, String> getMap(){
        Map<Integer, String> map = new HashMap<>();

        map.put(2, CODILITY);
        map.put(3, TEST);
        map.put(5, CODERS);
        map.put(6, CODILITY+TEST);
        map.put(10, CODILITY+CODERS);
        map.put(15, TEST+CODERS);
        map.put(30, CODILITY+TEST+CODERS);

        return map;
    }
}
