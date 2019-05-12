package com.algorithm.hackerrank.regex_2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.05.12
 */
public class SolutionsTest {

    @Test
    public void 중복_제거(){
        String origin = "Hello hello Ab aB";
        String subOrigin = "A B B C C C";

        List<String> splitValues = Arrays.asList(origin.split(" "));

        StringBuilder sb = new StringBuilder(splitValues.get(0));

        IntStream.range(1, splitValues.size())
                 .forEach(i -> {
                     if(i > 0){
                         if(!splitValues.get(i-1).equals(splitValues.get(i))
                             && upperCase(splitValues.get(i-1), splitValues.get(i))){
                             sb.append(" " + splitValues.get(i));
                         }
                     }
                 });

        System.out.println(sb.toString());
    }


    @Test
    public void matcher_test(){
        Pattern p = Pattern.compile("ABC");
        Matcher m = p.matcher("AAAABCCCCCBBBAA");

        while(m.find()){
            System.out.println(m.start() + " "+m.group());
        }
    }

    private boolean upperCase(String v1, String v2){
        return !v1.toUpperCase().equals(v2.toUpperCase());
    }

    private boolean 
}