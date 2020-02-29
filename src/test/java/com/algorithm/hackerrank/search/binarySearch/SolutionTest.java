package com.algorithm.hackerrank.search.binarySearch;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    int [] binArr = {1,2,3,4,5,6,7,8};


    @Test
    public void 이진트리(){
        System.out.println(Solution.binarySearch(binArr, 6, 0, binArr.length));
    }
}