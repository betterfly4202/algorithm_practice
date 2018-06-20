package com.algorithm.NHN_Ent.cording_party_2018_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String getCanvasSize = br.readLine();
        String getBgColor = br.readLine();
        String getFrameNum = br.readLine();
        String pass = br.readLine();
        String frameInfo_1 = br.readLine();
        String frameInfo_2 = br.readLine();
        String frameInfo_3 = br.readLine();
        String frameInfo_4 = br.readLine();
        String frameInfo_5 = br.readLine();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter( System.out ) );
        ArrayList<String> resultList = new ArrayList<>();

        // 라인 1
        String canvas [] =getCanvasSize.split("x");

        String canvasX = canvas[0].replaceAll("[^0-9]","");
        String canvasY = canvas[1].replaceAll("[^0-9]","");


        // 라인 2
        int hexLength = getBgColor.indexOf("0x");
        String hexStr = getBgColor.substring(hexLength, getBgColor.length());
        String decValue = getHexToDec(hexStr);

        resultList.add(decValue);


        // 라인 3
        String frameNum = getFrameNum.replaceAll("[^0-9]","");

//        //arr.get(4) 부터 진행

        // 라인 4
        // TODO : 반복문 처리하기
        String frameContents [] = frameInfo_1.split(" ");

        String result = "";
        int frameCount = Integer.parseInt(frameNum);
        for(int i=0; i< frameCount; i++){
            String alpha = frameContents[3].trim().equals("yes") ? "1" : "0";
            result = frameContents[1]+"x"+frameContents[2]
                    +", "+frameContents[4]
                    +", "+alpha;
        }
//
//        System.out.println(result);

        for(String result : resultList){
            System.out.println(result);
        }
    }

    private static String getHexToDec(String hex) {
        hex = hex.replaceFirst("^0x", "");
        long v = Long.parseLong(hex, 16);
        return String.valueOf(v);
    }

    private static boolean isNumber(String str){
        boolean result = false;

        try{
            int val = Integer.parseInt(str);
            if(val < 0 && val > 65535){
                throw new Exception();
            }
            return result;
        }catch (NumberFormatException n){
            return result;
        }catch (Exception e){
            return result;
        }
    }
}
