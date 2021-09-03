package com.algorithm.ref;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class QuickTest {
    String ss = "abcd";

    @Test
    public void 검증(){
        int [] a = {3,2,4,1,5,9};

//        Quick.partition(a, 1, a.length-1);
        Stack<Character> stack = new Stack<>() ;

        for(int i=0;i<ss.length(); i++){
            stack.push(ss.charAt(i));
        }

        for(int i=0; i<stack.size(); i++){
            System.out.println(stack.pop());
        }
    }

    int [] arr = {3 ,10, -5, 6};

    @Test
    public void asdf(){
        List<Integer> arr= Arrays.asList(3, 10, -5, 6);
        int result = 0;
        int left = 0;

        for(int i=0; i<arr.get(0)-1; i++){
            left += arr.get(i);
            int right = 0;
            for(int j=i+1; j<arr.get(0); j++){
                right += arr.get(j);
            }

            if(left - right > 0){
                result++;
            }
        }

        System.out.println(result);
    }

    @Test
    public void 어레이사용(){
        List<Integer> arr= Arrays.asList(10, -5, 6);
        int result = 0;

        List<Integer> leftList = new ArrayList<>();
        Stack<Integer> rightList = new Stack<>();

        int left = 0;
        for(int i=0; i<arr.size()-1; i++){
            left += arr.get(i);
            leftList.add(left);
        }

        int right = 0;

        for(int i=arr.size()-1; i>0; i--){
            right += arr.get(i);
            rightList.add(right);
        }

        for(int i=0; i<arr.size()-1; i++){
            if(leftList.get(i) - rightList.pop() > 0){
                result++;
            }
        }

        System.out.println(result);
    }

    @Test
    public void asdaa(){
        List<Integer> arr= Arrays.asList(2, 5, 4, 6, 8);
        int x = 3;

        Map<List<Integer>, Integer> map = new HashMap<>();

        for (int i=0; i<arr.size()-x+1; i++){
            List<Integer> l = new ArrayList<>();
            l.add(arr.get(i));

            int sum = arr.get(i);

            for(int j=i+1; j<i+x; j++){
                l.add(arr.get(j));
                sum += arr.get(j);
            }

            map.put(l, sum);
        }


        System.out.println(map);


    }

    @Test
    public void requestsServed() {
        List<Integer> timestamp= Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 13, 16);
        List<Integer> top= Arrays.asList(10, 15);

        Stack<Integer> timestampStack = new Stack<>();
        int maxRequestCount = 6;
        int result = 0;


        for(int j=0 ; j<top.size(); j++) {
            for (int i = 0; i < timestamp.size(); i++) {
                timestampStack.add(timestamp.get(i));

            }
        }

        for(int j=0; j<top.size(); j++) {
            int cnt = 1;
            for(int i=timestampStack.size()-1; i>=0; i--) {
                if(cnt % maxRequestCount != 0){
                    if(timestampStack.get(i) < top.get(j)){
                        timestampStack.pop();
                        cnt++;
                    }
                }
            }

            result += cnt;
        }

        System.out.println(result-1);
    }
}