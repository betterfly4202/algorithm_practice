package com.algorithm.STUnitas.actual_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by betterFLY on 2018. 8. 23.
 * Github : http://github.com/betterfly88
 */

/*
리회사는 가끔 강사 선생님이 응원을 위해 아이스크림을 사주시곤한다. 이날은 점심시간이 끝나면 사원 모두가 한 줄로 줄을 서서 아이스크림을 탄다. 그런데 매일 같이 앞자리에 앉은 사원들이 앞에 줄을 서 먼저 점심을 먹고, 뒷자리에 앉은 사원들은 뒤에 줄을 서 늦게 아이스크림을 받게 된다. 어떻게 하면 이러한 상황을 바꾸어 볼 수 있을까 고민하던 중 알고리즘 초고수 인턴 사원이 한 가지 방법을 내 놓았다. 그 방법은 다음과 같다.

사원들이 한 줄로 줄을 선 후, 첫 번째 사원부터 차례로 번호를 뽑는다. 첫 번째로 줄을 선 사원은 무조건 0번 번호를 받아 제일 앞에 줄을 선다. 두 번째로 줄을 선 사원은 0번 또는 1번 둘 중 하나의 번호를 뽑는다. 0번을 뽑으면 그 자리에 그대로 있고, 1번을 뽑으면 바로 앞의 사원 앞으로 가서 줄을 선다. 세 번째로 줄을 선 사원은 0,1 또는 2 중 하나의 번호를 뽑는다. 그리고 뽑은 번호만큼 앞자리로 가서 줄을 선다. 마지막에 줄을 선 사원까지 이와 같은 방식으로 뽑은 번호만큼 앞으로 가서 줄을 서게 된다. 각자 뽑은 번호는 자신이 처음에 선 순서보다는 작은 수이다.

예를 들어 5명의 사원이 줄을 서고, 첫 번째로 줄을 선 사원부터 다섯 번째로 줄을 선 사원까지 차례로 0, 1, 1, 3, 2번의 번호를 뽑았다고 하자, 첫 번째 사원부터 다섯 번째 사원까지 1부터 5로 표시하면 사원들이 줄을 선 순서는 다음과 같이 된다.

첫 번째 사원이 번호를 뽑은 후 : 1

두 번째 사원이 번호를 뽑은 후 : 2 1

세 번째 사원이 번호를 뽑은 후 : 2 3 1

네 번째 사원이 번호를 뽑은 후 : 4 2 3 1

다섯 번째 사원이 번호를 뽑은 후 : 4 2 5 3 1

따라서 최종적으로 사원들이 줄을 선 순서는 4, 2, 5, 3, 1이 된다.

줄을 선 사원들이 차례로 뽑은 번호가 주어질 때 사원들이 최종적으로 줄을 선 순서를 출력하는 프로그램을 작성하시오.

입력
5
0 1 1 3 2
1 2 3 4 5

출력
4 2 5 3 1
 */

public class solution_2 {
    static List<Integer> memList = new ArrayList<>();
    static List<Integer> resultList = new ArrayList<>();

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String lines = sc.nextLine();

        String [] userNumStr = lines.split("\\s");

        for(String temp : userNumStr){
            memList.add(Integer.parseInt(temp));
        }

        int [] resultArr = new int[memList.size()];
        int user = 1;

        /*
            1. 0은 내 자신의 위치
            2. 처음 들어오면 0부터 시작
            3. size > 1 일때, length -1 까지 이동 가능
            4. 만약 [length -1] 위치에 누가 있다면 그 뒤에 모든 수는 ++1 씩 이동함

         */



        for(int i=0; i<memList.size(); i++){
            int userOrder = memList.get(i);
            if(user == 1){
                resultArr[i] = user;
            }else {
                int d = user - userOrder;
            }
            user++;
        }

        for(int a : resultArr){
            System.out.println(a + " ");
        }
    }
}
