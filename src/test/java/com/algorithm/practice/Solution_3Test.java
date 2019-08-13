package com.algorithm.practice;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.08.07
 */
public class Solution_3Test {
    @Test
    public void dfdf(){
//        List<Integer> dd = Arrays.asList(1,0,1,0,1,1);
//        List<Integer> dd = Arrays.asList(0,1,0);
//        List<Integer> dd = Arrays.asList(0,0,0,0,1,1);
        int [] dd ={0,1,1,0};
//        Arrays.asList(as);
//        List<Integer> dd = Arrays.asList(0,1,1,0);
//        dd.set(0, 0);

        int finalCnt = compareCount(dd);
        System.out.println(finalCnt);
    }

    private int compareCount(int [] A){
        int std = stdValue(A); // 0
        int cKey = std > 0 ? 0 : 1;

        int cnt = 0;

        for(int i=0; i<A.length; i++){
            if(i == A.length-1){
                if(A[i -1] == A[i]){
                    cnt++;
                }
                break;
            }

            if(i%2==0){
                if(A[i] != std){
                    A[i] = std;
                    cnt++;
                }
            }else{
                if(A[i] != cKey){
                    A[i] = cKey;
                    cnt++;
                }
            }
        }

        return cnt;
    }  

    private int stdValue(int [] A){
        int frontOne = 0;
        int frontZero = 0;
        for(int i=0; i<A.length; i+=2){
            if(i+1 >= A.length){
                break;
            }

            if (A[i] != A[i+1]){
                if(A[i] == 1){
                    frontOne ++;
                }else{
                    frontZero ++;
                }
            }
        }

        return frontOne > frontZero ? 1 : 0;
    }

    @Test
    public void dfdd(){
//        List<Integer> dd = Arrays.asList(1,0,1,0,1,1);
        List<Integer> dd = Arrays.asList(0,1,0);
//        List<Integer> dd = Arrays.asList(0,0,0,0,1,1);


    }

}