package com.algorithm.hackerrank.search.radioTransmitter;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by betterfly
 * Date : 2019.08.06
 */
public class RadioSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        System.out.println(process(x, k, n));
    }

    public static int process (int [] arr, int range, int size) {
        Arrays.sort(arr);
        int numOfTransmitters = 0;
        int i = 0;

        /* Key is to use greedy algorithm to always place the transmitter at the house furthest to the right possible
         * to cover the range.
         */
        while (i < size) {
            numOfTransmitters++;
            int loc = arr[i] + range;

            //go to right as far as we cover i_orig as well.
            while (i < size && arr[i] <= loc) {
                i++;
            }

            loc = arr[--i] + range;

            // this is where we place the transmitter
            //now go to the right of arr[i] by range because transmitter at arr[i] covers houses to its right as well.

            while (i < size && arr[i] <= loc) {
                i++;
            }
        }

        return numOfTransmitters;
    }
}
