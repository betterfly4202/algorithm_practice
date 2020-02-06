package com.algorithm.hackerrank.graph;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @link : https://www.hackerrank.com/challenges/journey-to-the-moon/problem
 */
public class JourneyToTheMoon {

    /*
        1. 주어진 배열에서 그룹핑 재배열.
        - 흩어져 있는 그룹군에서, 동일한 국가가 있는 경우 하나의 그룹으로 묶어야함

        2. 전체 배열 완성 후 경우의 수 구하기
            a. 전체 사이즈만큼 순회하면서
            b. 각 배열 길이 만큼 곱한 후, 각각의 곱을 더함

        예)
        A: [0 ,1, 4]
        B: [2 , 3]
        C: [5]

        - (A.length * B.length) + (A.length + C.length) + (B.length * C.length)
        - (3 * 2) + (3 * 1) + (2 * 1)
        > result = 11
     */
    static int journeyToMoon(int n, int[][] astronaut) {
        assert n == 1;

        return 0;
    }

    public List<List<Integer>> arrToList(int[][] astronaut){
        return Stream.of(astronaut)
                .map(arr -> Arrays.stream(arr).boxed().collect(Collectors.toList()))
                .collect(Collectors.toList())
                ;
    }

    public List<List<Integer>> checkDuplicatedArr(List<List<Integer>> list){

        IntStream.range(0, list.size())
                .filter(i -> list.size() > i+1)
                .forEach(i -> {
                    IntStream.range(i+1, list.size())
                            .forEach(next ->{
                                if (list.size() > next){
                                    if(compare(list.get(i), list.get(next))){
                                        list.get(i).addAll(list.get(next));
                                        list.remove(next);
                                    }
                                }
                            });
                })
        ;

        return list;
    }


    public boolean compare(List<Integer> t1, List<Integer> t2){
        return IntStream.range(0, 1)
                .anyMatch(i -> t1.contains(t2.get(i)));
    }

}
