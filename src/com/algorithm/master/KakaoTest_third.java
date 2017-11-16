package com.algorithm.master;

/**
 * Created by betterFLY on 2017-11-14.
 */

import java.util.Map;
import java.util.regex.Pattern;

/**
 *
 *   [입력 형식]

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


public class KakaoTest_third {

    private static LRUCache<String, String> lruCache;


    public static void main(String[] args) {
        String problem = "[“Jeju”, “Pangyo”, “NewYork”, “newyork”]";
        int cacheSize = 2;

        getLowerString(problem, cacheSize);
        System.out.print(lruCache.cnt());
    }

    public static void getLowerString(String cities, int size) {
        String[] tempArray = cities.split("");
        lruCache = new LRUCache<>(size);

        for (int i = 0; i < tempArray.length; i++) {

            String temp = tempArray[i].toLowerCase();

            boolean checkAlphabet = Pattern.matches("^[a-zA-Z]*$", temp);
            if (checkAlphabet) {
                lruCache.put("" + i, temp);
            }
        }

        for (Map.Entry<String, String> e : lruCache.getAll()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}

