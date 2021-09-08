package com.algorithm.kakao.second;


import java.util.*;

public class SearchRankAnswer {
    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> infoMap = new HashMap<>();
        for (String s : info) {
            String[] s_split = s.split(" ");
            int score = Integer.parseInt(s_split[4]);

            for (int i = 0; i < (1 << 4); i++) {
                StringBuilder key = new StringBuilder();
                for (int j = 0; j < 4; j++) {
                    if ((i & (1 << j)) > 0) key.append(s_split[j]);
                }
                infoMap.computeIfAbsent(key.toString(), k -> new ArrayList<>()).add(score);
            }
        }

        for (Map.Entry<String, List<Integer>> entry : infoMap.entrySet())
            Collections.sort(entry.getValue());

        int[] answer = new int[query.length];
        for (int i = 0; i < query.length; i++) {
            String[] q_split = query[i].replaceAll("-", "").split(" and | ");
            String key = "";
            for (int j = 0; j < 4; j++)
                key += q_split[j];
            int score = Integer.parseInt(q_split[4]);

            List<Integer> list = infoMap.getOrDefault(key, new ArrayList<Integer>());
            int l = 0, r = list.size();

            while (l < r) {
                int mid = (l + r) / 2;
                if (list.get(mid) < score) l = mid + 1;
                else r = mid;
            }
            answer[i] = list.size() - l;
        }
        return answer;
    }
}
