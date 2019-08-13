package com.algorithm.practice;

/**
 * Created by betterfly
 * Date : 2019.08.07
 */
public class Solution_4 {
    public static void main(String[] args) {

    }

    public static String resultVal(int N){
        StringBuilder result = new StringBuilder(String.valueOf(N).replaceAll("[^0-9]", ""));

        if (result.length() > 3){
            return result.toString();
        }

        for(int i=0; i<result.length(); i++){
            int tmp = result.charAt(i)  - '0';
            if(N >= 0){
                if(tmp < 5){
                    result.insert(i, "5");
                    break;
                }
            }else{
                if(tmp < 5){
                    result.insert(i, "5").insert(0, "-");
                    break;
                }
            }
        }

        return result.toString();
    }
}
