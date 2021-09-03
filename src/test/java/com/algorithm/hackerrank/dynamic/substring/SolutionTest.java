package com.algorithm.hackerrank.dynamic.substring;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    String a = "16";
    String b = "123";
    String c = "123456";
    String d = "972698438521";

    /*
        1,2,3,4,5,6
        12,23,34,45,56
        123,234,345,456
        1234,2345,3456
        12345,23456
        123456
     */

    @Test
    public void 검증(){
        assertTrue(Solution.substrings(a) == 23);
        assertTrue(Solution.substrings(b) == 164);
//        assertTrue(Solution.substrings(d) == 445677619);
    }

    @Test
    public void substring(){
        String aa = "123";

        System.out.println(aa.substring(0,1));
        System.out.println(aa.substring(1,2));
        System.out.println(aa.substring(2,3));
    }

    @Test
    public void 모듈러_연산(){
        String mod = "972698438521";

        System.out.println((Long.parseLong(mod)%1000000000) +7);
    }

    @Test
    public void 제곱근(){
        System.out.println(2*(Math.pow(10,5)));
    }
}