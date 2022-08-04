package com.sparta.jn;

public class BubbleSort {
    static int[] intArraySorter(int[] arrayIn) {
        int[] arrayToSort = arrayIn;
        int length = arrayIn.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (arrayToSort[j] > arrayToSort[j+1]) {
                    int temp = arrayToSort[j];
                    arrayToSort[j] = arrayToSort[j+1];
                    arrayToSort[j+1] = temp;
                }
            }
        }
        return arrayToSort;
    }
}
