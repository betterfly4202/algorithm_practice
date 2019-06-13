package com.algorithm.hackerrank.greedy;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by betterfly
 * Date : 2019.06.11
 */
public class MinimumAbsoluteDifferenceTest {

    private MarcsCakeWalk marcsCakeWalk;

    @Before
    public void setUp(){
        marcsCakeWalk = new MarcsCakeWalk();
    }

    @Test
    public void getMarcsCakeWalkCalorie(){
        int [] calorie = {1, 5, 8, 4};

        long result = marcsCakeWalk.walks(calorie);

        assertThat(result, is(42));
    }

    @Test
    public void jegob(){
        int a = 2;
        int b = 4;
        int result = castToInt(Math.pow(a,b));

        assertThat(result, is(16));
    }

    /*
    마음을 다 보여줬던 너와는 다르게
    지난 사랑에 겁을 잔뜩 먹은 나는
    뒷걸음질만 쳤다

    너는 다가오려 했지만
    분명 언젠가 떠나갈 것이라 생각해
    도망치기만 했다

    같이 구름 걸터앉은 나무 바라보며
    잔디밭에 누워
    한 쪽 귀로만 듣던 달콤한 노래들이
    쓰디쓴 아픔이 되어
    다시 돌아올 것만 같아

    분명 언젠가 다시 스칠 날 있겠지만
    모른 척 지나가겠지
    최선을 다한 넌 받아들이겠지만
    서툴렀던 나는 아직도 기적을 꿈꾼다
    눈 마주치며 그땐 미안했었다고
    용서해달라고 얘기하는 날
    그때까지 잘 지내자 우리, 우리

    지금 생각해보면 그까짓 두려움
    내가 바보 같았지 하며
    솔직해질 자신 있으니
    돌아오기만 하면 좋겠다

    분명 언젠가 다시 스칠 날 있겠지만
    모른 척 지나가겠지
    최선을 다한 넌 받아들이겠지만
    서툴렀던 나는 아직도 기적을 꿈꾼다

    눈 마주치며 그땐 미안했었다고
    용서해달라고 얘기하는 날
    그때까지 잘 지내자 우리, 우리

    눈 마주치며 그땐 미안했었다고
    용서해달라고 이야기하는 날
    그때까지
    잘 지내자
    우리
     */

    private int castToInt(Double val){
        return val.intValue();
    }
}