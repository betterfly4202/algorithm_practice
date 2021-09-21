package com.algorithm.youtube.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Solution_4 {
    public static String orderingLiteral(String value){
        AtomicReference<String> result = new AtomicReference<>("");
        // integer -> 49~57
        List<Character> vList = new ArrayList<>();
        for (char c :value.toCharArray()) {
            vList.add(c);
        }

        AtomicInteger sum = new AtomicInteger();
        vList.sort(Character::compareTo);
        vList.forEach(v ->{
            if(v.charValue() < 58){
                sum.addAndGet(Integer.parseInt(String.valueOf(v)));
            }else {
                result.updateAndGet(v1 -> v1 + v.charValue());
            }
        });


        return result + sum.toString();
    }
}
