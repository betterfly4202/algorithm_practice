package com.algorithm.kakao.first;

/**
 * Created by betterFLY on 2018-06-30.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**

     [입력 형식]

     입력으로는 str1과 str2의 두 문자열이 들어온다.
     - 각 문자열의 길이는 2 이상, 1,000 이하이다.
     - 입력으로 들어온 문자열은 두 글자씩 끊어서 다중집합의 원소로 만든다.
     - 이때 영문자로 된 글자 쌍만 유효하고, 기타 공백이나 숫자, 특수 문자가 들어있는 경우는 그 글자 쌍을 버린다.
       예를 들어 “ab+”가 입력으로 들어오면, “ab”만 다중집합의 원소로 삼고, “b+”는 버린다.
     - 다중집합 원소 사이를 비교할 때, 대문자와 소문자의 차이는 무시한다. “AB”와 “Ab”, “ab”는 같은 원소로 취급한다.


     [출력 형식]

     입력으로 들어온 두 문자열의 자카드 유사도를 출력한다. 유사도 값은 0에서 1 사이의 실수이므로, 이를 다루기 쉽도록 65536을 곱한 후에 소수점 아래를 버리고 정수부만 출력한다.

 */
public class KakaoTest_5 {
    public static List<String> str1Arr = new ArrayList<>();
    public static List<String> str2Arr = new ArrayList<>();

    public static void main(String[] args) {
        String str1 = "handshake";
        String str2 = "shake hands";
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if(str1.equals(str2)){
            System.out.println(65536);
            return;
        }
        addStringArray(str1, str1Arr);
        addStringArray(str2, str2Arr);

        int interCnt = getInterCount(str1Arr, str2Arr);
        int unionCnt = str1Arr.size() + str2Arr.size() - interCnt;
        double calResult = ((double)interCnt/unionCnt) * 65536;
        System.out.println((int)Math.floor(calResult));

    }

    private static void addStringArray(String str, List<String> arr){
        for(int i=0; i<str.length()-1; i++){
            String subStr = str.substring(i,i+2);
            if(Pattern.matches("^[a-zA-Z]*$", subStr)){
                arr.add(subStr);
            }
        }
    }

    private static int getInterCount(List<String> str1Arr, List<String> str2Arr){
        int count = 0;
        for(int i=0; i<str1Arr.size(); i++){
            if(str1Arr.contains(str2Arr.get(i))){
                count ++;
            }
        }
        return count;
    }

}


