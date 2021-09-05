package com.algorithm.kakao.second;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewIdMakerTest {
    NewIdMaker idMaker = new NewIdMaker();
    @Test
    public void aa(){
        String test = "sfdd...a";
        String test2 = ".sfdd...a";
        String test3 = "..sfdd...a..";
        String test4 = ".d.sfdd...a..axS";
        String test5 = "";
        String test6 = "asdfqwerzxcxqw.d..";
        System.out.println(idMaker.solution(test));;
        System.out.println(idMaker.solution(test2));;
        System.out.println(idMaker.solution(test3));;
        System.out.println(idMaker.solution(test4));;
        System.out.println(idMaker.solution(test5));;
        System.out.println(idMaker.solution(test6));;
    }

    @Test
    public void 아이디_생성기(){
        String test  = "...!@BaT#*..y.abcdefghijklm";
        String test2  = "z-+.^.";
        String test3  = "=.=";
        String test4  = "123_.def";
        String test5  = "abcdefghijklmn.p";

        assertEquals(idMaker.solution(test), "bat.y.abcdefghi");
        assertEquals(idMaker.solution(test2), "z--");
        assertEquals(idMaker.solution(test3), "aaa");
        assertEquals(idMaker.solution(test4), "123_.def");
        assertEquals(idMaker.solution(test5), "abcdefghijklmn");
    }
}