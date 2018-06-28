package com.algorithm.kakao.first;

/**
 * Created by betterFLY on 2017-11-14.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**

     [입력 형식]

     캐시 크기(cacheSize)와 도시이름 배열(cities)을 입력받는다.
     cacheSize는 정수이며, 범위는 0 ≦ cacheSize ≦ 30 이다.
     cities는 도시 이름으로 이뤄진 문자열 배열로, 최대 도시 수는 100,000개이다.
     각 도시 이름은 공백, 숫자, 특수문자 등이 없는 영문자로 구성되며, 대소문자 구분을 하지 않는다. 도시 이름은 최대 20자로 이루어져 있다.


     [출력 형식]

     입력된 도시이름 배열을 순서대로 처리할 때, “총 실행시간”을 출력한다.

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
public class KakaoTest_3 {

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


