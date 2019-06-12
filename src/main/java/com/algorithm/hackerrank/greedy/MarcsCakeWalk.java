package com.algorithm.hackerrank.greedy;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by betterfly
 * Date : 2019.06.04
 */

// https://www.hackerrank.com/challenges/marcs-cakewalk/problem
public class MarcsCakeWalk {

    // Complete the marcsCakewalk function below.


    /*
        [input]
        3
        1 3 2

        [output]
        11

        [input]
        4
        7 4 9 6

        [output]
        79
     */
    static long marcsCakewalk(int[] calorie) {

        return 1;
    }

    public long walks(int[] calorie) {
        /*
            1. sorting
            2. Math.pow 각 제곱근 순회
            3. 전체 더하기
         */

        IntStream.rangeClosed(0, calorie.length)
                 .forEach(v ->{

                 });

        Map<String, String> map = new HashMap<>();
        return 1;
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
