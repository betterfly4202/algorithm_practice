package com.algorithm.youtube.greedy;

import java.util.*;
import java.util.stream.Collectors;

public class Solution_4 {
    /*
        모험가 N명의 사람이 있고, 각각 사람들은 공포도가 X의 수치를 갖고 있다.
        사람들은 자신의 공포도 X명 이상으로만 그룹을 참여할 수 있다면,
        모험가 N명에 대하여 그룹을 지을 수 있는 최댓값을 구하여라

        ex) N = 5
        2,1,3,2,2
        답 : 2
     */
    public static int getedGuildGroupCount(int N, String users){
        int cnt = 0;

        List<Integer> userList = Arrays.stream(users.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i <userList.size() ; i++) {
            int cursor = userList.get(i);
            temp.add(cursor);

            if (cursor == temp.size()){
                cnt++;
                temp.clear();
            }else if ( (userList.size() - i) < userList.get(i)){
                break;
            }
        }
        return cnt;
    }
    
    public static int sampleResult(int N, String users){
        int result = 0;
        int cnt = 0;

        List<Integer> userList = Arrays.stream(users.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());


        for (Integer integer : userList) {
            cnt++;

            if (integer <= cnt) {
                result++;
                cnt = 0;
            }

        }
        return result;
    }
}
