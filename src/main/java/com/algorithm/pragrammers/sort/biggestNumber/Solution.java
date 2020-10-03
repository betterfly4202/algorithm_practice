package com.algorithm.pragrammers.sort.biggestNumber;

import java.util.*;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 */
public class Solution {
    /*
    0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

    예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

    0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

    [제한 사항]
    - numbers의 길이는 1 이상 100,000 이하입니다.
    - numbers의 원소는 0 이상 1,000 이하입니다.
    - 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.


    [입출력 예]
    numbers	            return
    [6, 10, 2]	        6210
    [3, 30, 34, 5, 9]	9534330
     */

    public String solution(int[] numbers) {
        Map<Integer, List<String>> m = sortMap(numbers);

        String answer = "";

        for (int i = 9; i >= 0; i--) {
            if (m.get(i)!= null){
                answer += combineReverseArray(m.get(i));
            }

        }
        return answer;
    }

    public String combineReverseArray(List<String> list){
        String str = "";

        for (String i : list){
            str = str+i;
        }

        return str;
    }

    /*
         1. 2자리 이상인 경우 쪼개야함
         2. 무조건 맨 앞자리가 제일 큰 수
         3. 키가 같을때, 무조건 다음수보다 큰 것으로 정렬
         4. 마지막 자리가 무조건 맨 앞자리보다 커야함
     */
    public Map<Integer, List<String>> sortMap(int [] numbers){
        Map<Integer, List<String>> m = new HashMap<>();

        for (int i = 0; i <numbers.length ; i++) {
            int key = getNum(numbers[i], 0);

            List<String> list = m.getOrDefault(key, new LinkedList<>());
            list = compareAdd(list, String.valueOf(numbers[i]));

            m.put(key, list);
        }

        return m;
    }


    private int getNum(int target, int index){
        String first = String.valueOf(target);
        return Integer.parseInt(String.valueOf(first.charAt(index)));
    }

    public List<String> compareAdd(List<String> list, String input){
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j <=list.get(i).length()-1 ; j++) {
                if (list.get(i).length() == 1 && input.length() > 1){

                    if(list.get(i).charAt(0) > input.charAt(input.length()-1)){
                        list.add(i+1, input);
                    }else{
                        list.add(i, input);
                    }

                    return list;
                }

                if (list.get(i).length() <= input.length()){
                    if(input.charAt(j) >= list.get(i).charAt(0) || list.get(i).charAt(j) < input.charAt(j)){
                        list.add(i, input);
                        return list;
                    }
                }
            }


        }

        list.add(input);
        return list;
    }
}
