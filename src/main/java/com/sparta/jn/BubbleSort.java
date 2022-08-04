package com.sparta.jn;

public class BubbleSort {
    static int[] intArraySorter(int[] arrayIn) {
        int[] arrayToSort = arrayIn;
        int length = arrayIn.length;
        boolean swapped = false;
        do {
            for (int i = 1; i < length - 1; i++) {
                if (arrayToSort[i - 1] > arrayToSort[i]) {
                    int temp = arrayToSort[i - 1];
                    arrayToSort[i - 1] = arrayToSort[1];
                    arrayToSort[1] = temp;
                    swapped = true;
                }
            }
        } while (!swapped);
        return arrayToSort;
    }
}
