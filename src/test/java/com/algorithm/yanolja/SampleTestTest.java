package com.algorithm.yanolja;

import com.algorithm.practice.sorting.QuickSort;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SampleTestTest {
    SampleTest test = new SampleTest();
    QuickSort sort;
    @Test
    public void ts(){
        int [] A = new int[]{1, 3, 5, 10, 22, 7, 5};
        int [] B = new int[]{1,2,3};
        int [] C = new int[]{-1,-2,-3};
        int [] D = new int[]{1};
        int [] E = new int[]{1, 3, 6, 4, 1, 2};
        int [] F = new int[]{9, 3, 6, 4, 1, 2};
//        assertThat(test.solution(A), is(2));
//        assertThat(test.solution(B), is(4));
//        assertThat(test.solution(C), is(1));
//        assertThat(test.solution(D), is(2));
        assertThat(test.solution(E), is(5));
        assertThat(test.solution(F), is(5));
    }


    // quick sort -> 맨앞으로..
    @Test
    public void quick(){
        int [] A = new int[]{1, 3, 5, 10, 22, 7, 5};
        int result [] = test.quickSort(A);
//        int result [] = new int[]{1,2,3};
//        int result [] = new int[]{-1,-2,-3};

        System.out.println(result);

        int a = 0;
        for (int i=0; i<result.length; i++){
            if(result.length > i+1){
                int sample = result[i+1] - result[i];
                if(sample > 1){
                    a = sample;
//                    System.out.println(sample);
                    break;
                }
            }
            a = result[result.length-1] +1;
//            System.out.println(result[result.length-1]+1);
        }

        if(a < 0){
            a = 1;
        }
        System.out.println(a);
    }


}