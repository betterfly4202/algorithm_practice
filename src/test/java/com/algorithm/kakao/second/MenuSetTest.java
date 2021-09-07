package com.algorithm.kakao.second;

import org.junit.jupiter.api.Test;

class MenuSetTest {
    MenuSet kakao = new MenuSet();

    /**
     *
     *                      orders	                            course	                result
     *     ["ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"]	    [2,3,4]	    ["AC", "ACDE", "BCFG", "CDE"]
     *     ["ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"]	[2,3,5]	    ["ACD", "AD", "ADE", "CD", "XYZ"]
     *     ["XYZ", "XWY", "WXA"]	                            [2,3,4]	    ["WX", "XY"]
     */

    @Test
    public void 메뉴_구성(){
        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
        int[] course = {2, 3, 4};

        kakao.solution(orders, course);
    }
}