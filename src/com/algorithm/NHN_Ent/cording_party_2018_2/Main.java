package com.algorithm.NHN_Ent.cording_party_2018_2;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

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
        ArrayList<String> resultList = new ArrayList<>();

        // 라인 1
        String getCanvasSize = br.readLine();

        String canvas [] =getCanvasSize.split("x");
        String canvasX = canvas[0].replaceAll("[^0-9]","");
        String canvasY = canvas[1].replaceAll("[^0-9]","");
        resultList.add(canvasX);
        resultList.add(canvasY);


        // 라인 2
        String getBgColor = br.readLine();

        int hexLength = getBgColor.indexOf("0x");
        String hexStr = getBgColor.substring(hexLength, getBgColor.length());
        String decValue = getHexToDec(hexStr);
        resultList.add(decValue);

        // 라인 3
        String getFrameNum = br.readLine();

        String frameNum =getFrameNum.replaceAll("[^0-9]","");
        resultList.add(frameNum);

        // 라인 4 - Pass
        String pass = br.readLine();

        // 라인 5
        int frameCnt = Integer.parseInt(frameNum);
        for(int i=0; i<frameCnt; i++){
            String frameInfo = br.readLine();
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

    private static boolean isValidatedNumber(String str){
        boolean result = false;

        try{
            int val = Integer.parseInt(str);
            if(val < 0 && val > 65535){
                //TODO : 숫자 검증 예외 처리
                throw new Exception();
            }
            return result;
        }catch (NumberFormatException n){
            return result;
        }catch (Exception e){
            return result;
        }
    }

    private static boolean isValidatedString(String str){
        boolean result = false;

        return result;
    }
}
