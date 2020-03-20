package com.algorithm.hackerrank.warmingUp;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleArraySum {
    static int simpleArraySum(int[] ar) {
        return IntStream.of(ar)
                .sum();
    }
}
