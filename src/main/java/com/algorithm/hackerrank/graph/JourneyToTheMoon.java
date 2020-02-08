package com.algorithm.hackerrank.graph;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    int journeyToMoon(int n, int[][] astronaut) {
//        assert n == 1;
        List<Set<Integer>> list = this.arrToList(astronaut);

        return calculator(checkDuplicatedArr(list));
    }

    public int calculator(List<Set<Integer>> list){
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            int s = list.get(i).size();

            if(list.size() > i+1){
                for(int j=i+1; j<list.size(); j++){
                    sum += s + list.get(j).size();
                }
            }else{
                sum = s;
            }
        }

        return sum;
    }

    public List<Set<Integer>> arrToList(int[][] astronaut){
        return Stream.of(astronaut)
                .map(arr -> Arrays.stream(arr).boxed().collect(Collectors.toSet()))
                .collect(Collectors.toList())
                ;
    }

    public List<Set<Integer>> checkDuplicatedArr(List<Set<Integer>> list){
        IntStream.range(0, list.size())
                .filter(i -> list.size() > i+1)
                .forEach(i -> {
                    IntStream.range(i+1, list.size())
                            .forEach(next ->{
                                if (list.size() > next){
                                    if(compare(list.get(i), list.get(next))){
                                        list.get(i).addAll(list.get(next));

                                        list.remove(next);
                                        checkDuplicatedArr(list);
                                    }



//                                    when List Collection
//                                    if(compare(list.get(i), list.get(next))){
//                                        list.get(i).addAll(list.get(next));
//                                        List<Integer> temp = distinct(list.get(i));
//                                        list.add(temp);
//
//                                        list.remove(i);
//                                        list.remove(next);
//
//                                        checkDuplicatedArr(list);
//                                    }
                                }
                            });
                })
        ;

        return list;
    }



    public List<Integer> distinct(List<Integer> list){
        return list.stream().distinct().collect(Collectors.toList());
    }


    public boolean compare(List<Integer> t1, List<Integer> t2){
        return IntStream.range(0, t2.size())
                .anyMatch(i -> t1.contains(t2.get(i)));
    }

    public boolean compare(Set<Integer> t1, Set<Integer> t2){
        return IntStream.range(0, t2.size())
                .anyMatch(i -> t1.contains(t2.iterator().next()));
    }

    public List<List<Integer>> distinctElement(List<List<Integer>> list){
        list.stream()
                .flatMap(v -> v.stream().distinct())
                .collect(Collectors.toList());

        return list;
    }
}
