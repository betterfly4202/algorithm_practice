package com.algorithm.hackerrank.search.missingNumber;

import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.algorithm.hackerrank.search.missingNumber.Solution.countMapFromArr;
import static com.algorithm.hackerrank.search.missingNumber.Solution.distinguishMissedValues;
import static com.algorithm.hackerrank.search.missingNumber.Solution.printlnResult;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.04
 */
public class SolutionTest {
    private int [] arr = null;
    private int [] brr = null;

    @Before
    public void init(){
        arr = new int [] {203,204,205,206,207,208,203,204,205,206};
        brr = new int [] {203,204,204,205,206,207,205,208,203,206,205,206,204};
    }

    @Test
    public void 카운팅(){
        Map<Integer, Integer> mArr = countMapFromArr(arr);
        assertThat(mArr.get(203), is(2));
    }

    @Test
    public void 중복검사(){
        Map<Integer, Integer> mArr = countMapFromArr(arr);
        Map<Integer, Integer> mBrr = countMapFromArr(brr);

        List<Integer> resultList = distinguishMissedValues(mArr, mBrr);
        Collections.sort(resultList);

        printlnResult(resultList);
    }
}