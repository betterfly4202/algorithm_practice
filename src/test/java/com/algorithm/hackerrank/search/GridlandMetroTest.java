package com.algorithm.hackerrank.search;

import org.junit.Test;

import static org.junit.Assert.*;

public class GridlandMetroTest {
    private GridlandMetro target;

    /*
        4 4 3
        2 2 3
        3 1 4
        4 4 4
     */


    /*
        1 5 3
        1 1 2
        1 2 4
        1 3 5
     */

    /*
        1 7 3
        1 1 2
        1 2 4
        1 3 5
     */

    /*
        3 7 4
        1 1 3
        2 2 2
        3 1 6
        3 6 6
     */

    /*
        2 9 3
        2 1 5
        2 2 4
        2 8 8
     */
    @Test
    public void 검증(){
        assertTrue(target.gridlandMetro(4, 4, 3, new int [][]{{2, 2 ,3}, {3, 1, 4},{4, 4, 4}}) == 9 );          // 9
        assertTrue(target.gridlandMetro(1, 5, 3, new int [][]{{1, 1 ,2}, {1, 2, 4},{1, 3, 5}}) == 0 );            // 0
        assertTrue(target.gridlandMetro(1, 7, 3, new int [][]{{1, 1 ,2}, {1, 2, 4},{1, 3, 5}}) == 2 );            // 2
        assertTrue(target.gridlandMetro(3, 7, 4, new int [][]{{1, 1 ,3}, {2, 2, 2},{3, 1, 6}, {3, 6, 6}}) == 11); // 11
        assertTrue(target.gridlandMetro(2, 9, 3, new int [][]{{2, 1, 5}, {2, 2, 4},{2, 8, 8}}) == 12 );            // 12
//      assertTrue(  assertTrue(target.gridlandMetro(4, 4, 3, new int [][]{{2, 2 ,3}, {3, 1, 4},{4, 4, 4}})  == 9 )== 9);
    }

}