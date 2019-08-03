package com.algorithm.hackerrank.search;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.01
 */
public class MissingNumberTest {

    private List<Integer> missingArr = new ArrayList<>();
    private List<Integer> originArr = new ArrayList<>();
    private List<Integer> resultArr = new ArrayList<>();

    @Before
    public void init(){
        originArr = Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204); // indx :
        missingArr = Arrays.asList(203,204,205,206,207,208,203,204,205,206);
    }


    @Test
    public void 중복_출력(){
        List<Integer> resultArr = new ArrayList<>();

        resultArr.add(203);
        resultArr.add(204);
        resultArr.add(211);
        resultArr.add(212);

        resultArr.retainAll(originArr);

        resultArr.forEach(System.out::println);

    }


    /*
        originArr =  Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204);
        missingArr = Arrays.asList(203,204,205,206,207,208,203,204,205,206);
     */
    @Test
    public void 순차접근(){
        int oriIdx = 0;
        int missIdx = 0;

        while(oriIdx< originArr.size()){
            if (missIdx > missingArr.size()){
                return;
            }

            int cValue = originArr.get(oriIdx);

            if (cValue != missingArr.get(missIdx)){
                if(!resultArr.contains(cValue)){
                    resultArr.add(cValue);
                }

                oriIdx++;
                continue;
            }

            missIdx++;
            oriIdx++;
        }

        // 204 205 206
        Collections.sort(resultArr);
        resultArr.forEach(System.out::println);
    }

    @Test
    public void 검증(){
        int [] arr = new int [] {203,204,204,205,206,207,205,208,203,206,205,206,204};
        int [] brr = new int [] {203,204,205,206,207,208,203,204,205,206};

//        int [] arr =new int [] {11,4,11,7,13,4,12,11,10,14};
//        int [] brr =new int [] {11,4,11,7,3,7,10,13,4,8,12,11,10,14,12};
        int [] aa = MissingNumber.missingNumbers(arr, brr);

    }
}