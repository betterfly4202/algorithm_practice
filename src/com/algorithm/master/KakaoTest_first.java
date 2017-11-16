package com.algorithm.master;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by betterFLY on 2017-11-06.
 */

// http://tech.kakao.com/2017/09/27/kakao-blind-recruitment-round-1/
public class KakaoTest_first {
    public static void main(String [] args){

        //problem 1 : Secret Maps
        System.out.println(secretMaps(6));

    }

    // problem 1
    public static List secretMaps(int n){
        int [] arr1= {46, 33, 33 ,22, 31, 50};
        int [] arr2= {27 ,56, 19, 14, 14, 10};

        List<String> resultArray = new ArrayList<>();
        int temp1;
        int temp2;
        String tempString;

        for(int j=0; j<arr1.length;j++){
            StringBuffer result = new StringBuffer();
            for(int i=0; i<n; i++){
                // arr1
                temp1 = arr1[j] % 2;
                arr1[j]=arr1[j]/2;

                // arr2
                temp2 = arr2[j] % 2;
                arr2[j]=arr2[j]/2;

                if(temp1+temp2>0){
                    tempString = "#";
                }else{
                    tempString =" ";
                }
                result.append(tempString);
            }
            resultArray.add(result.reverse().toString());
            result.append("");
        }

        return resultArray;
    }
}