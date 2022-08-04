package com.sparta.jn.bubblesort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    @DisplayName("Test If array has 1 number then no change")
    void testIfArrayHas1NumberThenNoChange() {
        int[] numbers = {99};
        int[] expected = {99};
        int[] sorted = BubbleSort.intArraySorter(numbers);
        Assertions.assertArrayEquals(expected, sorted);

    }

    @Test
    @DisplayName("Test an unsorted array should return a sorted array")
    void testAnUnsortedArrayShouldReturnASortedArray() {
        int[] numbers = {99, 1, 4, 2, 32, -1};
        int[] sorted = BubbleSort.intArraySorter(numbers);
        int[] expected = {-1, 1 , 2, 4, 32, 99};
//        Assertions.assertAll((() -> Assertions.assertEquals(-1,sorted[0])),
//                            () -> Assertions.assertEquals(1,sorted[1]),
//                            () -> Assertions.assertEquals(2,sorted[2]),
//                            () -> Assertions.assertEquals(4,sorted[3]),
//                            () -> Assertions.assertEquals(32,sorted[4]),
//                            () -> Assertions.assertEquals(99,sorted[5]));
        Assertions.assertArrayEquals(expected, sorted);
    }

    @Test
    @DisplayName("Test for all negative numbers in array should return sorted array")
    void testForAllNegativeNumbersInArrayShouldReturnSortedArray() {
        int[] numbers = {-99, -1, -4, -2, -32, -1};
        int[] sorted = BubbleSort.intArraySorter(numbers);
        int[] expected = {-99, -32, -4, -2, -1, -1};
        Assertions.assertArrayEquals(expected, sorted);
    }


}
