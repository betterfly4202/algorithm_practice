package com.algorithm.BOJ_STEP.STEP_4.BOJ_10817;

import java.util.*;

public class Main {
    public static void main (String [] test){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A < 1)
            return;
        if(B < 1)
            return;
        if(C > 100)
            return;

        List<Integer> list = new LinkedList<>();
        list.add(A);
        list.add(B);
        list.add(C);

        Descending descending = new Descending();
        Collections.sort(list, descending);
        System.out.println(list.get(1));
    }
}

class Descending implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}