package com.algorithm.hackerrank.sorting.bigSorting;

import org.junit.Test;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SolutionTest {
    String [] a = {"2" ,"100" ,"12303479849857341718340192371","1","3084193741082937" ,"3084193741082938" ,"111" ,"200"};
    String [] b = {"31415926535897932384626433832795", "1" , "3", "10", "3", "5"};
    String [] c = {"1", "1" , "1", "10", "3", "5"};

    @Test
    public void unsorted_with_quickSort(){
//        print(Solution.bigSorting(a));
//        print(Solution.bigSorting(b));
        print(ComparableSolution.bigSorting(a));
        print(ComparableSolution.bigSorting(b));
        print(ComparableSolution.bigSorting(c));

    }

    private void print(String [] arr){
        Stream.of(arr).forEach(v -> System.out.println(v));
    }

    @Test
    public void charAtTest(){
        String t1= "12303479849857341718340192371";
        String t2= "12303479849857341718340192373";
        for(int i=0; i<t1.length(); i++){
            int a = (int)t1.charAt(i);
            int b = (int)t2.charAt(i);
            System.out.println(a + " // "+ b);
            System.out.println("======================================");
        }
    }

    @Test
    public void 중복허용(){
        Map<String, Integer> unsortedList = new LinkedHashMap<>();
        unsortedList.put("3", 123);
        unsortedList.put("3", 22);

        System.out.println(unsortedList);
    }

    @Test
    public void swapTest(){
        String [] ab = {"123", "13342", "123222", "4","23299"};
//        String [] cc = {"123", "13342", "12303479849857341718340192371", "12303479849857341718340192372","23299"};
        String [] cc = {"123", "13342", "12303479849857341718340192372", "12303479849857341718340192371","23299"};

        Solution.swap(ab,0 ,3);
        Solution.swapEqualsLength(cc,2 ,3);

        assertTrue(ab[0].equals("4"));
        assertFalse(cc[2].equals("12303479849857341718340192371"));
    }

    @Test
    public void 퀵_소트(){
        String [] cc = {"1", "3", "9", "5","4", "2", "6"};

        Solution.quickSort(cc);
        System.out.println(cc);
    }
}