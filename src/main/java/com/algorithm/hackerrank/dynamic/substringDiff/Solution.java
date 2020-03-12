package com.algorithm.hackerrank.dynamic.substringDiff;

import java.util.List;

/*
    같은거 나오면 그 기준으로 앞 뒤로 k 만큼 찾으면된다.
 */
public class Solution {
    static int substringDiff(int k, String s1, String s2) {
        char [] str_a = s1.toCharArray();
        char [] str_b = s2.toCharArray();

        return max(solve(str_a, str_b, k), solve(str_b, str_a, k));
    }

    public static int max(int a, int b){
        return a > b ? a : b;
    }
    private static int min(int a, int b){
        return a < b ? a : b;
    }
    public static int solve(char[] str_a, char[] str_b, int max_misses){
        int max_len = 0;
        int str_a_len = str_a.length;
        int[] points = new int[str_a_len + 2];
        points[0] = -1;
        int str_a_max = str_a_len - max_misses;
        for(int i_a = 0; i_a < str_a_max; ++i_a){
            int num_points = 1;
            int str_b_max = str_a_len - i_a;
            for(int i_b = 0; i_b < str_b_max; ++i_b){
                if (str_a[i_a + i_b] != str_b[i_b]){
                    points[num_points++] = i_b;
                }
            }
            points[num_points++] = str_b_max;
            int offset = min(max_misses+1, num_points-1);
            for(int i_p = offset; i_p < num_points; ++i_p){
                int len = points[i_p] - points[i_p - offset] - 1;
                max_len = max(max_len, len);
            }
            str_a_max = str_a_len - max_len;
        }
        return max_len;
    }

//    static int substringDiff(int k, String s1, String s2) {
//        int result = 0;
//        int [][] box = new int [s1.length()][s2.length()];
//
//        for (int i = 0; i < s1.length() ; i++) {
//            box[i][0] = 0;
//            box[0][i] = 0;
//        }
//        s1 = " "+s1;
//        s2 = " "+s2;
//
//        for(int i=1; i<s1.length()-1; i++){
//            String c1 = s1.substring(i, i+1);
//
//            for (int j = 1; j < s2.length()-1 ; j++) {
//                String c2 = s2.substring(i, i+1);
//
//                if(c1.equals(c2)){
//                    box[i][j] = box[i-1][j-1] +1;
//                }else{
//                    int left = box[i-1][j];
//                    int up = box[i][j-1];
//
//                    if(left > up){
//                        box[i][j] = left;
//                    }else{
//                        box[i][j] = up;
//                    }
//                }
//            }
//        }
//
//        return result;
//    }
}
