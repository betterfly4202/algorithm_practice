package com.algorithm.ref;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by betterFLY on 2017-11-16.
 */

public class LinkedDemo {

    private static final int MAX_ENTRIES = 3;

    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap(MAX_ENTRIES + 1, .75F, true) {

            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > MAX_ENTRIES;
            }
        };
        lhm.put(0, "H");
        lhm.put(1, "E");
        lhm.put(2, "L");
        lhm.put(3, "L");
        lhm.put(4, "O");

        System.out.println("" + lhm);

    }
}