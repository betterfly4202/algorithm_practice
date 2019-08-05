package com.algorithm.hackerrank.search.radioTransmitter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.notification.StoppedByUserException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static com.algorithm.hackerrank.search.radioTransmitter.Solution.getMaxKeyValue;
import static com.algorithm.hackerrank.search.radioTransmitter.Solution.houseLocationWithMap;
import static com.algorithm.hackerrank.search.radioTransmitter.Solution.neededTransmitter;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.05
 */
public class SolutionTest {
//    int [] k = {1,2,3,4,5}; // 1 , 2
//    int [] k = {9,5,4,2,6,15,12}; // 2 , 2
//    int [] k = {7,2,4,6,5,9,12,11}; // 2, 3
//    int [] k = {2,2,2,2,1,1,1,1}; // 1, 1
    int [] k = {9,5,4,2,6,15,12}; // 2, 4
    int [] x = {7, 2};

    @Before
    public void init(){

    }

    @Test
    public void 검증(){
        assertThat(neededTransmitter(k, x[1]), is(1));
    }

    @Test
    public void arr_2_map(){
        assertThat(houseLocationWithMap(x).size(), is(x.length));
    }


    /*
    int [] k = {9,5,4,2,6,15,12}; // 2, 4

     */
    @Test
    public void 검증하기(){
        Map<Integer, Boolean> m = houseLocationWithMap(k);
        int range = x[1];
        List<Integer> transList = new ArrayList<>();

        m.forEach((key, value) -> {
            int stdKey = key+range;

            if (!m.get(key) && m.containsKey(stdKey)){
                for(int i = key; i <= stdKey + range; i++){
                    if(m.containsKey(i)){
                        m.replace(i, true);
                    }
                }

                transList.add(stdKey);
            }else{
                if(!m.get(key) && m.containsKey(key)){
                    transList.add(key);
                }
            }
        });

        System.out.println(transList.size());
    }

    @Test
    public void 최대값뽑기(){
        System.out.println(getMaxKeyValue(houseLocationWithMap(k)));
    }
}