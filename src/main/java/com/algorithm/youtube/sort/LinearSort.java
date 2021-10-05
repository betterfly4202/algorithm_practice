package com.algorithm.youtube.sort;

public class LinearSort {

    public static int[] basicLinearSort(int [] list){
        for (int i = 0; i <list.length ; i++) {
            int compare = Integer.MAX_VALUE;
            int temp = list[i];
            int idx = 0;
            for (int j = i+1; j <list.length ; j++) {
                if (compare > list[j]){
                    compare = list[j];
                    idx = j;
                }
            }

            if (temp > compare){
                list[i]= compare;
                list[idx] = temp;
            }
        }

        return list;
    }

    public static int[] basicLinearSortUseMin(int [] list){
        for (int i = 0; i <list.length ; i++) {
            int min_idx = i;
            for (int j = i+1; j <list.length ; j++) {
                if (list[min_idx] > list[j]){
                    min_idx = j;
                }
            }

            int tmp = list[i];
            list[i]= list[min_idx];
            list[min_idx] = tmp;
        }

        return list;
    }


}
