package com.algorithm.hackerrank.search.lilysHomework;

import java.util.Arrays;
import java.util.HashMap;

public class SolutionClear {
    public static int lilysHomework(int[] arr) {
        int answer_asc = 0;
        int answer_desc = 0;
        int idx, temp;
        int arr_length = arr.length;
        // 기존 arr은 오름차순에서 사용될 것
        // 내림차순에서 사용될 arr_desc을 만들고 기존 arr을 복사해서 넣는다.
        int[] arr_desc = new int[arr_length];
        System.arraycopy(arr, 0, arr_desc, 0, arr_length);

        // 오름차순으로 정렬된 sorted_arr
        int[] sorted_arr = new int[arr_length];
        System.arraycopy(arr, 0, sorted_arr, 0, arr_length);
        Arrays.sort(sorted_arr);

        // 내림차순으로 정렬된 reversed_arr
        int[] reversed_arr = new int[arr_length];
        for (int i = 0; i < arr_length; i++) {
            reversed_arr[i] = -1 * arr[i];
        }
        Arrays.sort(reversed_arr);
        for (int i = 0; i < arr_length; i++) {
            reversed_arr[i] *= -1;
        }

        // 오름차순을 위한 hash map.. 음
        // hashMap의 key는 정렬을 해줌. 각 key값의 index를 미리 파악할 수 있
        HashMap<Integer, Integer> idxMap_asc = new HashMap();
        for (int i = 0; i < arr_length; i++) {
            idxMap_asc.put(arr[i], i);
        }

        // 내림차순을 위한 hash map
        HashMap<Integer, Integer> idxMap_desc = new HashMap();
        for (int i = 0; i < arr_length; i++) {
            idxMap_desc.put(arr_desc[i], i);
        }

        // 오름차순을 통한 cost 계산
        for (int i = 0; i < arr_length; i++) {
            if (sorted_arr[i] != arr[i]) {
                idx = idxMap_asc.get(sorted_arr[i]);
                idxMap_asc.put(arr[i], idx);
                temp = arr[i];
                arr[i] = sorted_arr[i];
                arr[idx] = temp;
                answer_asc++;
            }
        }

        // 내림차순을 통한 cost 계산
        for (int i = 0; i < arr_length; i++) {
            if (reversed_arr[i] != arr_desc[i]) {
                idx = idxMap_desc.get(reversed_arr[i]);
                idxMap_desc.put(arr_desc[i], idx);
                temp = arr_desc[i];
                arr_desc[i] = reversed_arr[i];
                arr_desc[idx] = temp;
                answer_desc++;
            }
        }

        // 더 작은값을 반환한다.
        return answer_asc > answer_desc ? answer_desc : answer_asc;
    }
}