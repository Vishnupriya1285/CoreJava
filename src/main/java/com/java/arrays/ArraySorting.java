package com.java.arrays;

import java.util.Arrays;
import java.util.Collections;

import static java.lang.Integer.reverse;

public class ArraySorting {
    public static void main(String[] args) {
        Integer[] numArray = {20, 15, 40, 30, 50, 10};
        System.out.println("The original Array is::"+Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("The sorted Array in Ascending order is ::"+Arrays.toString(numArray));

        Arrays.sort(numArray, Collections.reverseOrder());
        System.out.println("The sorted array in descending order is::"+Arrays.toString(numArray));
    }
}
