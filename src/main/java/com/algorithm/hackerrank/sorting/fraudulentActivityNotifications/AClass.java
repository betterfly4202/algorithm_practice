package com.algorithm.hackerrank.sorting.fraudulentActivityNotifications;

import java.util.*;

public class AClass {
    /*
        2개의 정렬된 링크리스트를 하나의 정렬된 링크리스트로 병합하는 함수를 구현하세요.

        Input:
        1->2->4
        1->3->4

        Output:
        1->1->2->3->4->4
     */

    private static List<Integer> resultList = new ArrayList<>();

    public static void main(String[] args) {
        int [] a = {1,2,4};
        int [] b = {1,3,4};

        List<Integer> listA= makeList(a);
        List<Integer> listB= makeList(b);

        addResultList(listA);
        addResultList(listB);
        Collections.sort(resultList);

        print();
    }

    private static void print(){
        for(int i=0; i<resultList.size(); i++){
            System.out.println(resultList.get(i));
        }
    }

    private static void addResultList(List<Integer> list){
        for(int i=0; i<list.size(); i++){
            resultList.add(list.get(i));
        }
    }

    private static List<Integer> makeList(int [] arr){
        List<Integer> list = new LinkedList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }

        return list;
    }
}
