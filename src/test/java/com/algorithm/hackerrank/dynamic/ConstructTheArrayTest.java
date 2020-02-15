package com.algorithm.hackerrank.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstructTheArrayTest {


    @Test
    public void Test(){
        assertTrue(ConstructTheArray.countArray(4, 3, 2) == 3);
        assertTrue(ConstructTheArray.countArray(5, 2, 2) == 0);
        assertTrue(ConstructTheArray.countArray(3, 2, 1) == 1);
        assertTrue(ConstructTheArray.countArray(1000, 100, 1) == 43813792);
        assertTrue(ConstructTheArray.countArray(17048, 14319, 1) == 803254122);

//        System.out.println(ConstructTheArray.countArray(1000, 100, 1) - (10*9)+7);
//        System.out.println(ConstructTheArray.countArray(1000, 100, 1) - (10*9)+7);
    }
}