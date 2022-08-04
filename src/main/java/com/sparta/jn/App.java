package com.sparta.jn;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] myArray = {5, 1, 9, 20, 4, -3, 0, 15};
        System.out.println(Arrays.toString(BubbleSort.intArraySorter(myArray)));
    }
}
