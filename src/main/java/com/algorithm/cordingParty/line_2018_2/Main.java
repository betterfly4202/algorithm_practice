package com.algorithm.cordingParty.line_2018_2;

import java.io.*;
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
 */
public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> resultList = new ArrayList<>();

        // 라인 1
        String getCanvasSize = br.readLine();
        isValidationString(getCanvasSize);
        String canvas [] =getCanvasSize.split("x");
        String canvasX = canvas[0].replaceAll("[^0-9]","");
        String canvasY = canvas[1].replaceAll("[^0-9]","");
        isValidationNumber(canvasX);
        isValidationNumber(canvasY);
        resultList.add(canvasX);
        resultList.add(canvasY);

        // 라인 2
        String getBgColor = br.readLine();
        isValidationString(getBgColor);
        int hexLength = getBgColor.indexOf("0x");
        String hexStr = getBgColor.substring(hexLength, getBgColor.length());
        String decValue = getHexToDec(hexStr);
        resultList.add(decValue);

        // 라인 3
        String getFrameNum = br.readLine();
        isValidationString(getFrameNum);
        String frameNum = getFrameNum.replaceAll("[^0-9]","");
        isValidationNumber(frameNum);
        resultList.add(frameNum);

        // 라인 4 - Pass
        String pass = br.readLine();
        isValidationString(pass);

        // 라인 5
        int frameCnt = Integer.parseInt(frameNum);
        for(int i=0; i<frameCnt; i++){
            String frameInfo = br.readLine();
            isValidationString(frameInfo);

            frameInfo = frameInfo.replaceAll("^\\s+","");
            String frameContents [] = frameInfo.split(" ");

            String parsingResult = getSeperateString(frameContents);
            resultList.add(parsingResult);
        }

        for(String result : resultList){
            System.out.println(result);
        }
    }

    private static String getSeperateString(String [] frameInfo){
        String alpha = frameInfo[3].trim().equals("yes") ? "1" : "0";
        String result = frameInfo[1]+"x"+frameInfo[2]
                      + ", "+frameInfo[4]
                      + ", "+alpha;

        return result;
    }

    private static String getHexToDec(String hex) {
        hex = hex.replaceFirst("^0x", "");
        long v = Long.parseLong(hex, 16);
        return String.valueOf(v);
    }

    private static boolean isValidationNumber(String str){
        boolean result = false;
        try{
            int val = Integer.parseInt(str);
            if(val < 0 || val > 65535){
                throw new IllegalArgumentException("자연수의 범위는 0부터 65535까지 설정 가늫압니다.");
            }
            result = true;
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.exit(0);
        }

        return result;
    }

    private static boolean isValidationString(String str){
        boolean result = false;
        try{
            if(str.length() > 255){
                throw new IllegalArgumentException("문자열의 길이는 255byte 이내만 가능합니다.");
            }
            result = true;
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            System.exit(0);
        }
        return result;
    }

}