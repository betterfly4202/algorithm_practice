package com.algorithm.kakao.first;

/**
 * Created by betterFLY on 2017-11-14.
 */

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**

     [입력 형식]

     입력으로는 str1과 str2의 두 문자열이 들어온다. 각 문자열의 길이는 2 이상, 1,000 이하이다.
     입력으로 들어온 문자열은 두 글자씩 끊어서 다중집합의 원소로 만든다. 이때 영문자로 된 글자 쌍만 유효하고, 기타 공백이나 숫자, 특수 문자가 들어있는 경우는 그 글자 쌍을 버린다. 예를 들어 “ab+”가 입력으로 들어오면, “ab”만 다중집합의 원소로 삼고, “b+”는 버린다.
     다중집합 원소 사이를 비교할 때, 대문자와 소문자의 차이는 무시한다. “AB”와 “Ab”, “ab”는 같은 원소로 취급한다.


     [출력 형식]

     입력으로 들어온 두 문자열의 자카드 유사도를 출력한다. 유사도 값은 0에서 1 사이의 실수이므로, 이를 다루기 쉽도록 65536을 곱한 후에 소수점 아래를 버리고 정수부만 출력한다.


     [조건]

     캐시 교체 알고리즘은 LRU(Least Recently Used)를 사용한다.
     cache hit일 경우 실행시간은 1이다.
     cache miss일 경우 실행시간은 5이다.


     [입출력 예제]

     캐시크기(cacheSize)	    도시이름(cities)	                                                                                                  실행시간
             3	            [“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”, “Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”]	                        50
             3	            [“Jeju”, “Pangyo”, “Seoul”, “Jeju”, “Pangyo”, “Seoul”, “Jeju”, “Pangyo”, “Seoul”]	                                21
             2	            [“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”, “SanFrancisco”, “Seoul”, “Rome”, “Paris”, “Jeju”, “NewYork”, “Rome”]	60
             5	            [“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”, “SanFrancisco”, “Seoul”, “Rome”, “Paris”, “Jeju”, “NewYork”, “Rome”]	52
             2	            [“Jeju”, “Pangyo”, “NewYork”, “newyork”]	                                                                        16
             0	            [“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”]                                	                                    25
 */
public class KakaoTest_5 {

    private static int cnt = 0;
    private static int cacheSize = 2;


    public static void main(String[] args) {
        String problem = "[“Jeju”, “Pangyo”, “Seoul”, “NewYork”, “LA”]";
        resultLRU(problem);
    }

    public static void resultLRU(String cities){
        String [] tempArray = cities.split(",");
        String tempString = "";

        // Linked HashMap... cacheSize로 중복값 제거
        float   hashTableLoadFactor = 0.75f;
        int hashTableCapacity = (int)Math.ceil(cacheSize / hashTableLoadFactor) + 1;
        LinkedHashMap  map = new LinkedHashMap(hashTableCapacity, hashTableLoadFactor, true) {
            public boolean removeEldestEntry(Map.Entry  eldest) {
                return size() > cacheSize;
            }
        };

        for(int i=0; i<tempArray.length;i++){
            // cacheSize == 0 이면, 계속 새로운값으로 대체되니까 계속 ++해줌..
            // ==> 근데 이거 아님 계속 같은 도시 이름이 있을 수 있는데???
            if(cacheSize == 0){
                cnt+=5;
            }else{
                for(int k=0; k<tempArray[i].length(); k++){
                    char temp = tempArray[i].charAt(k);
                    boolean checkAlphabet = Pattern.matches("^[a-zA-Z]*$", String.valueOf(temp));
                    if(checkAlphabet){
                        tempString += temp;
                    }
                }
                if(map.containsValue(tempString.toLowerCase())){
                    cnt+=1;
                }else{
                    cnt+=5;
                }

                map.put(i, tempString.toLowerCase());
                tempString ="";
            }
        }
        System.out.println(map);
        System.out.println("최종 스코어 : "+cnt);
    }
}


