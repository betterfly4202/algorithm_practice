package com.algorithm.NHN_Ent.cording_party_2018_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by betterFLY on 2018. 6. 17.
 * Github : http://github.com/betterfly88
 */


/*
    Canvas size: 600 x 400
    Background color: 0xfa023d
    Number of frames: 5
    No.: width height alpha duration
    1: 360 360 yes 150
    2: 360 360 yes 120
    3: 360 360 yes 110
    4: 360 360 no 140
    5: 360 360 yes 115

    받은걸 \n 으로 스플릿해서 하나씩 처리하면..
 */
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> resultArr = new ArrayList<>();


        // 입력 받는 걸 수정해서 한줄씩 input.split("\n"); 리스트 뽑고, 파싱해서 결과 처리하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(input);

        if(input.length() > 255){

        }

        input.split("\n");

        arr.add(input);
//        /*
//            라인 1
//         */
//        String canvas [] =arr.get(0).split("x");
//        resultArr.add(canvas[0].replaceAll("[^0-9]",""));
//        resultArr.add(canvas[1].replaceAll("[^0-9]",""));
//        System.out.println("Hello Goorm! Your input is " + input);
//
//        /*
//            라인 2
//         */
//        int hexLength = arr.get(1).indexOf("0x");
//        String hexStr = arr.get(1).substring(hexLength, arr.get(1).length());
//        String decValue = getHexToDec(hexStr);
//        System.out.println(decValue);
//
//        /*
//            라인 3
//         */
//        resultArr.add(canvas[2].replaceAll("[^0-9]",""));
//        int frameCount = Integer.parseInt(arr.get(2).replaceAll("[^0-9]",""));
//
//        /*
//            라인 4
//         */
//        //arr.get(4) 부터 진행
//        String frameContents [] = arr.get(4).split(" ");
//
//        String result = "";
//        for(int i=0; i< frameCount; i++){
//            String alpha = frameContents[3].trim().equals("yes") ? "1" : "0";
//            result = frameContents[1]+"x"+frameContents[2]
//                    +", "+frameContents[4]
//                    +", "+alpha;
//        }
//
//        System.out.println(result);
    }

    private static String getHexToDec(String hex) {
        hex = hex.replaceFirst("^0x", "");
        long v = Long.parseLong(hex, 16);
        return String.valueOf(v);
    }

}
