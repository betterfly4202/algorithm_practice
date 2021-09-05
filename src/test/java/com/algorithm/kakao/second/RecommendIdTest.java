package com.algorithm.kakao.second;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecommendIdTest {
    RecommendId recommendId;

    @BeforeEach
    public void init(){
        recommendId = new RecommendId();
    }

    @Test
    public void 전체_실행(){
        String test1 ="z-+.^.";
        String test2 ="...!@BaT#*..y.abcdefghijklm";
        String test3 ="=.=";
        String test4 ="123_.def";
        String test5 ="abcdefghijklmn.p";

        System.out.println(recommendId.recommendUserId(test1));
        System.out.println(recommendId.recommendUserId(test2));
        System.out.println(recommendId.recommendUserId(test3));
        System.out.println(recommendId.recommendUserId(test4));
        System.out.println(recommendId.recommendUserId(test5));

    }

    @Test
    public void 규식이_검증(){
        String test ="asdf";
        String test1 ="dfa01";
        String test2 ="dfd-1_a";
        String test3 ="vvcd.a";
        String test4 ="Abdf";
        String test5 ="A=bdf";

        assertTrue(recommendId.regex(test));
        assertTrue(recommendId.regex(test1));
        assertTrue(recommendId.regex(test2));
        assertTrue(recommendId.regex(test3));
        assertFalse(recommendId.regex(test4));
        assertFalse(recommendId.regex(test5));
    }

    @Test
    public void asdf(){
        String a = ".a..bD......D=c.";
//        String a = ".a.dc.";
        System.out.println(recommendId.step2_reformId(a));;
    }

    @Test
    public void cutTest(){
        String aa = "cd1234opqasl............a2";
        System.out.println(recommendId.cuttingLastPoint(aa));;
//        System.out.println(aa.length());;
    }

    @Test
    public void append(){
        String a = "bbcd";
        System.out.println(recommendId.appendLastValue(a));
    }

    @Test
    public void generateId(){
//        String id = "...!@BaT#*..y.abcdefghijklm";
        String id = "abcdefghijklmn.p";
        String id2 = "z-+.^.";
        System.out.println(recommendId.recommendUserId(id));
        System.out.println(recommendId.recommendUserId(id2));
    }
}