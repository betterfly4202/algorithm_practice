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

        System.out.println(secretMaps(5));
    }

    /*
        n : 5
        arr1 : [9, 20, 28, 18, 11]
        arr1 : [30, 1, 21, 17, 28]
     */
     /*
        n : 6
        arr1 : [46, 33, 33, 22, 31, 50]
        arr1 : [27, 56, 19, 14, 14, 10]
     */

    // problem 1. Secret Maps
    public static String secretMaps(int n){
        int [] arr1= {28};
        int [] arr2= {21};
//        int [] arr1= {9, 20, 28, 18, 11};
//        int [] arr2= {0, 1, 21, 17, 28};


        List<String> resultArray = new ArrayList<>();
        int temp1;
        int temp2;
        int mok1=0;
        int mok2=0;
        String result;
        String resultString = "";


        for(int j=0; j<arr1.length;j++){
            for(int i=0; i<n; i++){
                // arr1
                System.out.println(i+"번째 : "+arr1[j] + " /// "+arr2[j]);
                temp1 = arr1[j] % 2;
                arr1[j]=arr1[j]/2;

                // arr2
                temp2 = arr2[j] % 2;
                mok2=arr2[j]/2;

                System.out.println("temp값 : "+temp1 + "/// "+temp2);

                if(temp1+temp2>0){
                    result = "#";
                }else{
                    result =" ";
                }
                resultString +=result;
//                System.out.println(resultString);
            }

        }
        resultArray.add(resultString);
        Collections.reverse(resultArray);
        System.out.println("result : "+resultString);
//        System.out.println("resultArray : "+resultArray);

        return "";
    }

    public static List resultMethod(String result){
        result+=result;
        List<String> resultList = new ArrayList<>();

        return resultList;
    }
}

