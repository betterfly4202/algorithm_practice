package com.algorithm.inflearn.recursion;

/**
 * Created by betterFLY on 2017. 11. 20.
 * Github : http://github.com/betterfly88
 */

public class N_Queens {
    // back tracking : 내가 지나온 모든 궤적들을 하나씩 수행하다가,
    // 막다른 길(더이상 해결이 안될 때)에서는 다시 최근에 내린 결정을 하나씩 번복하여 순차적으로 다시 회귀해서 실행한

    /*
        상태 공간 트리...
        그림참고하기
        찾는 해를 포함하는 트리.
        즉 해가 존재한다면 그것은 반드시 그 트리의 어떤 한 노드에 해당함.
        따라서 이 트리를 체계적으로 탐색하면 해를 구할 수 있음

        이 트리는 우리가 구현 가능한 모든 경우의 수를 그리기 때문에 이 문제의 해가 존재한다면
        이 트리를 통해 우리는 답을 구할 수 있다

     */

    /*
        // 매개변수는 내가 현재 트리의 어떤 노드에 있는지를 지정해야 한다
        design Recirsion

        int [] cols = new int[N+1];
        매개변수 level은 현재 노드의 값을 표현하고,
        1번에서 level
        말이 어디에 놓여있는지 전역변수 배열 clos로 표현하자
        cols[i]=j 는 i번 말이 i행 j열 에 놓였음을 의미한다

        return-type queens(arguments) -> (int level)
        // level 이라는 말은... 1~level 까지의 말은 어디에 놓였는지 정해졌다는 것이다.
        {
            if non-promising ==> 꽝...
                report failure and return;
            else if success
                report answer and return;
            else
               visit children recursively;
        }



    */
}
