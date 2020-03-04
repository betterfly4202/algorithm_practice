package com.algorithm.hackerrank.search.validateWithOpenClose;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reMakeValid(){
        assertFalse(Solution.isValid("[}{()}]"));;
        assertFalse(Solution.isValid("[{()}"));;
        assertFalse(Solution.isValid("[{()})"));;
        assertTrue(Solution.isValid("[{()}]"));;
        assertFalse(Solution.isValid("]][["));;
    }

    @Test
    public void enumElse(){
//        SolutionValidRe.OpenClose o = SolutionValidRe.OpenClose.findClose("[");
        Solution.OpenClose o = Solution.OpenClose.findClose("]");
        assertTrue(Solution.OpenClose.EMPTY == o);
    }

}