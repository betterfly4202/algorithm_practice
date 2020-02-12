package com.algorithm.yanolja;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Three {
    public int solution(String S) {

        AtomicInteger integer = new AtomicInteger();
        IntStream.range(0, S.length())
                .filter(i -> S.substring(i).equals(")"))
                .forEach(v ->{
                    integer.getAndAdd(1);
                });
        return integer.get();
    }
}
