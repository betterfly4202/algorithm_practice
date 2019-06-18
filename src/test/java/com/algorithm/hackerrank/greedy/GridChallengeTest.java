package com.algorithm.hackerrank.greedy;

import org.junit.Test;
import org.junit.runner.notification.RunListener;

import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.06.16
 */
public class GridChallengeTest {

    final String resultNo =
            "eba\n" +
            "fgh\n" +
            "olm";

    /**
     * n*n 배열을 만들고
     * 세로 열을 비교해서 순차적인지 검증하여 YES를 출력해줘야함
     */
    private enum RESULT{
        Y("YES", true),
        N("NO", false);

        private String result;
        private boolean isTrue;

        RESULT(String result, boolean isTrue) {
            this.result = result;
            this.isTrue = isTrue;
        }

        public String getResult(){
            return this.result;
        }

        public boolean getIsTrue(){
            return this.isTrue;
        }
    }

    @Test
    public void sortedValue(){
        String [] gridArray = makeGridArray(resultNo);

        boolean flag = false;

        char compareValue;

        // TODO : charAt 하나씩 검증하면서 gridArray[i] 와 charAt[i] 값 비교.. 바로 이전 값보다 더 뒤에 있으면됨
        for(int i=0; i<gridArray.length; i++){

            compareValue = gridArray[i].charAt(i);
            if(i+1 < gridArray.length){
                // 알파벳 정렬(순서) 검증 방법 적용하기
                // compareValue == gridArray[i+1].charAt(i+1);
            }

        }
    }

    private String [] makeGridArray(String val){
        return val.split("\n");
    }
}