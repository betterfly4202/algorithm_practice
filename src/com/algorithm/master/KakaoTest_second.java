package com.algorithm.master;

import java.util.StringTokenizer;

/**
 * Created by betterFLY on 2017. 11. 12.
 * Github : http://github.com/betterfly88
 */

public class KakaoTest_second {

    /**
        다트 게임은 총 3번의 기회로 구성된다.
        각 기회마다 얻을 수 있는 점수는 0점에서 10점까지이다.
        점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수^1 , 점수^2 , 점수^3 )으로 계산된다.
        옵션으로 스타상(*) , 아차상(#)이 존재하며 스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 아차상(#) 당첨 시 해당 점수는 마이너스된다.
        스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
        스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
        스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
        Single(S), Double(D), Triple(T)은 점수마다 하나씩 존재한다.
        스타상(*), 아차상(#)은 점수마다 둘 중 하나만 존재할 수 있으며, 존재하지 않을 수도 있다.
        0~10의 정수와 문자 S, D, T, *, #로 구성된 문자열이 입력될 시 총점수를 반환하는 함수를 작성하라.


         1  1S2D*3T	    37	    1^1 * 2 + 2^2 * 2 + 3^3
         2	1D2S#10S	9	    1^2 + 2^1 * (-1) + 10^1
         3	1D2S0T	    3	    1^2 + 2^1 + 0^3
         4	1S*2T*3S	23	    1^1 * 2 * 2 + 2^3 * 2 + 3^1
         5	1D#2S*3S	5	    1^2 * (-1) * 2 + 2^1 * 2 + 3^1
         6	1T2D3D#	    -4	    1^3 + 2^2 + 3^2 * (-1)
         7	1D2S3T*	    59	    1^2 + 2^1 * 2 + 3^3 * 2


     */

    public static void main (String [] args){
        String p = "1S2D*3T";
        StringTokenizer st = new StringTokenizer(p);
        System.out.println(p);

//        int [] result = null; // 0<= score <= 10;
//
//
//        int singleScore = 0;
//        int doubleSocre = 0;
//        int tripleScore = 0;
//
//        int starBounus = 0;
//        int sharpBonus = 0;
//
//        // 기회는 총 3번 --> (i-1), i, (i+1)
//        for(int i=1; i <= 3; i++ ){
//            singleScore = result[i]^1; // S
//            doubleSocre = result[i]^2; // D
//            tripleScore = result[i]^3; // T
//
//            if(i-1 == 0 ){
//                starBounus = (result[i]*2);
//            }else{
//                starBounus = (result[i-1]*2)+(result[i]*2);
//            }
//
//            sharpBonus -= result[i];
//
//        }
//
//        result();
    }

    public static int result(){
        int result = 0;

        return result;
    }
}
