package com.algorithm.hackerrank.sorting.fraudulentActivityNotifications;

public class Solve {
    private static final int MAX_EXPENDITURE = 200;

    static int activityNotifications(int[] expenditure, int d) {
        int ans = 0;
        int[] histogram = new int[MAX_EXPENDITURE + 1];

        for (int i = 0; i < d; i++) {
            histogram[expenditure[i]] = histogram[expenditure[i]] + 1;
        }

        for (int i = d; i < expenditure.length; i++) {
            int cursor = 0;
            int currentAmount = expenditure[i];
            double median = 0;
            int left = -1;
            int right = -1;
            for (int e = 0; e <= MAX_EXPENDITURE; e++) {
                cursor += histogram[e];
                if (d % 2 == 1) {
                    // Odd -> Pick middle one for median
                    if (cursor >= d / 2 + 1) {
                        median = e;
                        break;
                    }
                } else {
                    if (cursor == d / 2) {
                        left = e;
                    }

                    if (cursor > d / 2 && left != -1) {
                        right = e;
                        median = (left + right) / 2.0;
                        break;
                    }

                    if (cursor > d / 2 && left == -1) {
                        median = e;
                        break;
                    }
                }

            }

            if (currentAmount >= 2 * median) {
                ans++;
            }

            histogram[expenditure[i - d]] = histogram[expenditure[i - d]] - 1;
            histogram[expenditure[i]] = histogram[expenditure[i]] + 1;
        }


        return ans;
    }
}
