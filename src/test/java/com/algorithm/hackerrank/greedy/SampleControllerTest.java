package com.algorithm.hackerrank.greedy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.06.23
 */
public class SampleControllerTest {
    private SampleController sampleController;

    @Before
    public void setUp(){
        sampleController = new SampleController();
    }
    @Test
    public void 인터페이스_테스트() {
        System.out.println(sampleController.asdf());
        System.out.println(sampleController.getNum());
        System.out.println(sampleController.ddd());
    }
}