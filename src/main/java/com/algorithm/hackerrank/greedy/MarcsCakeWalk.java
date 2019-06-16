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
        int [] result = compareAllValues(calorie);
        long sum = 0;
        for (int i=0; i<result.length; i++){
            sum += powValues(i) * result[i];
        }
        return sum;
    }

    private static int[] compareAllValues(int [] values){
        int [] newResult = new int[values.length];

        for (int i=0; i<values.length; i++){
            int maxVal = values[i];
            for (int k=i+1; k < values.length; k++){
                if (maxVal < values[k]){
                    maxVal = values[k];
                    int temp = values[i];
                    values[k] = temp;
                    values[i] = maxVal;
                }
            }

            newResult[i] = maxVal;
        }

        return newResult;
    }

    private static long powValues(int n){
        int x = 2;
        return (long) Math.pow(x,n);
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
