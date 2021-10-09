package com.algorithm.yanolja;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


class ArrayShiftTest {


    @Test
    public void 이동하기(){
        int [] a = {6,2,3,5,6,3};
        int [] b = {2,1,4,4};
        int [] c = {1,2,1};

        assertTrue(ArrayShift.shift(a) == 4);;
        assertTrue(ArrayShift.shift(b) == 1);;
        assertTrue(ArrayShift.shift(c) == 2);;

    }
}