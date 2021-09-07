package com.algorithm.kakao.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
    https://programmers.co.kr/learn/courses/30/lessons/72412
 */
public class SearchRank {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];

        List<String[]> members = new ArrayList<>();

        for (int i = 0; i < info.length; i++) {
            members.add(info[i].split(" "));
        }

        for (int j = 0; j < query.length; j++) {
            int count = 0;
            boolean flag = false;
            for (int i = 0; i < members.size(); i++) {
                String[] target = query[j].split("and");
                List<String> targets = new LinkedList<>();
                targets.addAll(Arrays.asList(target));
                targets.set(3, target[3].trim().split(" ")[0]);
                targets.add(target[3].trim().split(" ")[1]);


                for (int k = 0; k < targets.size(); k++) {
                    String c = targets.get(k).trim();

                    if (k < 4) {
                        if (members.get(i)[k].equals(c) || c.equals("-")) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }

                    if (k == 4) {
                        if (Integer.parseInt(members.get(i)[4]) >= Integer.parseInt(c)) {
                            flag = true;
                        } else {
                            flag = false;
                            break;
                        }
                    }
                }


                if (flag) {
                    count++;
                }
            }

            answer[j] = count;
        }

        return answer;
    }

}
