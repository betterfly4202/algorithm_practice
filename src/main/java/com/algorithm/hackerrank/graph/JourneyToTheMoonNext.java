package com.algorithm.hackerrank.graph;


import java.util.*;
import java.util.stream.IntStream;

/**
 * @link : https://www.hackerrank.com/challenges/journey-to-the-moon/problem
 */
public class JourneyToTheMoonNext {

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
        List<Set<Integer>> list = convertToList(n, astronaut);
        list = addNewNum(n, list);
        list = combineDuplicatedValues(list);

        return calculator(list);
    }

    static public List<Set<Integer>> convertToList(int n, int [][] arr){
        List<Set<Integer>> list = new LinkedList<>();

        for(int i=0; i<arr.length; i++){
            Set<Integer> set = new HashSet<>();

            if(arr.length > i){
                for (int k=0; k<n; k++){
                    for(int j=0; j<arr[i].length; j++){
                        set.add(arr[i][j]);
                    }
                    list.add(set);
                }
            }
        }
        return list;
    }

    static public List<Set<Integer>> addNewNum(int n, List<Set<Integer>> list){
        for(int i=0; i<n; i++){
            boolean check = false;

            for(int j=0; j<list.size(); j++){
                check = list.get(j).contains(i);
                if(check){
                    break;
                }
            }

            if(!check){
                Set<Integer> set = new HashSet<>();
                set.add(i);
                list.add(set);
            }
        }

        return list;
    }


    static public List<Set<Integer>> combineDuplicatedValues(List<Set<Integer>> list) {
        for(int i=0; i<list.size(); i++){

            if(list.size() > i+i){
                for(int next=i+1 ; next<list.size(); next++){
                    if(compare(list.get(i), list.get(next))){
                        list.get(i).addAll(list.get(next));

                        list.remove(next);
                        combineDuplicatedValues(list);
                    }
                }
            }
        }

        return list;
    }

    static public boolean compare(Set<Integer> t1, Set<Integer> t2){
        Iterator<Integer> itr = t2.iterator();

        while(itr.hasNext()){
            if(t1.contains(itr.next().intValue())){
                return true;
            }
        }

        return false;
    }

    static public int calculator(List<Set<Integer>> list){
        if (list.size() == 1){
            return 0;
        }
        int sum = 0;

        for(int i=0; i<list.size(); i++){
            int s = list.get(i).size();

            if(list.size() > i+1){
                for(int j=i+1; j<list.size(); j++){
                    sum += (s * list.get(j).size());
                }
            }
        }

        return sum;
    }
}
