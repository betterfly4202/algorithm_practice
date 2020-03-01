package com.algorithm.hackerrank.sorting.bigSorting;

import org.junit.Test;

import java.math.BigInteger;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class SolutionTest {
    String [] a = {"2" ,"100" ,"12303479849857341718340192371","1","3084193741082937" ,"3084193741082938" ,"111" ,"200"};

    @Test
    public void parseLong(){
        String t1= "12303479849857341718340192371";
        String t2= "31415926535897932384626433832795";
        BigInteger big = new BigInteger(t1);
        BigInteger big2 = new BigInteger(t2);

        System.out.println(big);
        System.out.println(big2);
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
        assertTrue(cc[2].equals("12303479849857341718340192371"));
    }

    @Test
    public void 퀵_소트(){
        String [] cc = {"123", "13342", "198273", "5123","23299", "232", "1442"};

        Solution.quickSort(cc);
        System.out.println(cc);
    }
}