package com.algorithm.hackerrank.sorting.bigSorting;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableSolution {
    static String[] bigSorting(String[] unsorted) {

        /**
         * @param a
         * @param b
         * @return
         *          -1 : o1 < o2
         *          0 : o1 == o2
         *          +1 : o1 > o2
         */
        Arrays.sort(unsorted, (a,b) -> {
            return StringAsIntegerCompare(a,b);
        });

        return unsorted;
    }

    private static int StringAsIntegerCompare(String o1, String o2) {
        if(o1.length() > o2.length())
            return 1;
        if(o1.length() < o2.length())
            return -1;

        for(int i=0; i<o1.length(); i++){
            int left = o1.charAt(i);
            int right = o2.charAt(i);

            if(left > right){
                return 1;
            }

            if(left < right){
                return -1;
            }
        }

        return 0;

    };

}
