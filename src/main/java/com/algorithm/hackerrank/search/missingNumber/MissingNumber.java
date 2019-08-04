package com.algorithm.hackerrank.search.missingNumber;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by betterfly
 * Date : 2019.08.01
 * URL : https://www.hackerrank.com/challenges/missing-numbers/problem
 */
public class MissingNumber {
    private static int maxNum = 0;
    private static int minNum = 0;

    public static int[] missingNumbers(int[] arr, int[] brr) {
        int oriIdx = 0;
        int missIdx = 0;
        List<Integer> resultArr = new ArrayList<>();
        minNum = brr[0];

        for (int aBrr : brr) {
            compareMaxNum(aBrr);
            compareMinNum(aBrr);
        }

        if (maxNum - minNum > 100) {
            throw new IllegalArgumentException("The difference between maximum and minimum number over 100.");
        }

        while(oriIdx< brr.length){
            int cValue = brr[oriIdx];

            if (missIdx >= arr.length
             || cValue != arr[missIdx]){
                if(!resultArr.contains(cValue)){
                    resultArr.add(cValue);
                }

                oriIdx++;
                continue;
            }

            missIdx++;
            oriIdx++;
        }
        Collections.sort(resultArr);
        return listToArray(resultArr);
    }


    private static void compareMaxNum(int val){
        if(maxNum < val){
            maxNum = val;
        }
    }

    private static void compareMinNum(int val){
        if(minNum > val){
            minNum = val;
        }
    }

    private static int [] listToArray(List<Integer> list){
        int [] result = new int[list.size()];

        for(int i=0; i<list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

//        for (int i = 0; i < result.length; i++) {
//            bufferedWriter.write(String.valueOf(result[i]));
//
//            if (i != result.length - 1) {
//                bufferedWriter.write(" ");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
        System.out.println(
                Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(" "))
        );
        scanner.close();
    }
}
