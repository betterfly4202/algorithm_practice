package com.algorithm.hackerrank.search;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.01
 */
public class MissingNumberTest {

    private List<Integer> missingArr = new ArrayList<>();
    private List<Integer> originArr = new ArrayList<>();
    @Before
    public void init(){
        originArr = Arrays.asList(203,204,204,205,206,207,205,208,203,206,205,206,204);
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

    @Test
    public void 순차접근(){
        List<Integer> resultArr = new ArrayList<>();
        int idx = 0;

        while(idx < missingArr.size()){
            int cValue = originArr.get(idx);
            if (cValue != missingArr.get(idx)){
                resultArr.add(cValue);
                continue;
            }

            idx++;
        }

        resultArr.forEach(System.out::println);
    }
}