package com.algorithm.woowahanbros.actual_test;

import com.sun.xml.internal.ws.policy.sourcemodel.AssertionData;
import jdk.nashorn.internal.runtime.arrays.ArrayIndex;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.jvm.hotspot.utilities.Assert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by betterFLY on 2018. 8. 11.
 * Github : http://github.com/betterfly88
 */

/*
    예시로 주어진 기간 내 주문 정보를 이용하여, 특정 기간의 판매 통계를 구하십시오.


    문제의 입력값은 각 언어의 표준입력(stdin) 함수를, 출력값은 표준출력(stdout) 함수를 사용해주세요.
    2018년 8월 1일 새롭게 상거래사이트를 오픈한 A 씨는 오늘까지(2018년 8월 10일) 자신의 사이트에서 일어난 주문 목록을 '판매일|상품번호|지역코드'의 형태로 예시와 같이 출력해 보았습니다.

    A 씨는 사이트 오픈일인 2018년 8월 1일과 아직 마감이 이루어지지 않은 오늘 2018년 8월 10일 제외하고 2018년 8월 2일부터 2018년 8월 9일까지(2일,9일 포함) 주문 목록을 기준으로 많이 판매된 상품과 그 상품이 어느 지역에서 판매가 되었는지 상위 3개의 데이터가 궁금해졌습니다.

    A 씨가 출력하고 싶은 형태의 데이터는 보기와 같습니다. 예시 데이터를 이용하여 보기와 같은 형태로 출력하십시오.

    보기)

    상품번호:판매횟수=>지역코드:판매횟수,지역코드:판매횟수,지역코드:판매횟수

    상품번호:판매횟수=>지역코드:판매횟수,지역코드:판매횟수,지역코드:판매횟수

    상품번호:판매횟수=>지역코드:판매횟수,지역코드:판매횟수,지역코드:판매횟수



    공통)

    - JAVA 8 기준으로 작성합니다.( 컬렉션,람다 사용 )

    - 많이 판매된 상품을 기준으로 최대 3개까지 정렬됩니다.

    - 상품의 판매횟수가 같을 경우 상품번호로 순차 정렬됩니다.

    - 상품별 판매지역의 경우 판매횟수가 많은 순으로 왼쪽에서 오른쪽으로 최대 3개까지 정렬됩니다.

    - 판매지역의 판매횟수가 같을 경우 지역 코드로 순차 정렬됩니다.

    - 관련 데이터가 없는 경우 결과는 'NO RESULT' 입니다.
 */

/**
 2018-08-03|10001|A02
 2018-08-01|10004|A09
 2018-08-02|10001|A02
 2018-08-05|10001|A05
 2018-08-09|10001|A07
 2018-08-10|10007|A09
 2018-08-08|10001|A05
 2018-08-08|10001|A02
 2018-08-04|10003|A01
 2018-08-02|10003|A04
 2018-08-04|10003|A01
 2018-08-04|10003|A06
 2018-08-03|10006|A01
 2018-08-02|10006|A02
 2018-08-03|10006|A04
 2018-08-10|10007|A09
 */


/*
 2018-08-03|10006|A01
 2018-08-04|10003|A01
 2018-08-04|10003|A01

 2018-08-02|10006|A02
 2018-08-03|10001|A02
 2018-08-02|10001|A02
 2018-08-08|10001|A02

 2018-08-03|10006|A04
 2018-08-02|10003|A04

 2018-08-08|10001|A05
 2018-08-05|10001|A05

 2018-08-04|10003|A06

 2018-08-09|10001|A07

 2018-08-10|10007|A09 //false
 2018-08-01|10004|A09 //false
 2018-08-10|10007|A09 //false
 */
public class solution_2 {
    static ArrayList<String> codeList = new ArrayList<>();
    static HashMap<String, HashMap<String, Integer>> codeMap = new HashMap<>();
    static HashMap<String, Integer> areaMap = new HashMap<>();

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;

        while((input=br.readLine()) != null){
            if(input.length() < 1){
                br.close();
                break;
            }
            statisticsProcedure(input);
        }

        System.out.println(codeMap.keySet());
        System.out.println(codeMap.values());
        for(String a : codeList){
            System.out.println(a);
        }
    }

    public static void statisticsProcedure(String lineStr){
        String [] splitValue = lineStr.split("\\|");
        String [] checkDate = splitValue[0].split("-");
        int date = Integer.parseInt(checkDate[2]);

        //codeList
//        ArrayList<HashMap<String, String>> codeList = new ArrayList<>();
//        HashMap<String, ArrayList<String>> codeMap = new HashMap<>();
//        codeMap.containsKey("A02");

        if(countDate(date)){
            if(areaMap.containsKey(splitValue[1])){
                areaMap.put(splitValue[1],areaMap.get(splitValue[1])+1);
            }else{
                areaMap.put(splitValue[1], 1);
            }
            codeMap.put(splitValue[2], areaMap);

            // <Area, Code List> area 안에 코드들있어서 그 코드 카운트하면되는데.
            if(!codeList.contains(splitValue[2])){
                codeList.add(splitValue[2]);
            }
        }
    }


    public static boolean countDate(int date){
        if(date < 2 || date > 9){
            return false;
        }
        return true;
    }
}
