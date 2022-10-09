package com.marufeb.learning.mossio.arrays.intermediate;

import java.util.Arrays;

public class IntermediateArrayLesson {

    public static void main(String[] args) {
        final int[] ints = new int[50];

        Arrays.fill(ints, 30);

        System.out.println(Arrays.toString(ints));

        System.out.println(Arrays.toString(Arrays.copyOf(ints, 10)));

        System.out.println(Arrays.toString(Arrays.copyOfRange(ints, 10, 40)));

//        final int[] a = {10, 5}; // Other way to declare and use arrays
        System.out.println(Arrays.compare(new int[]{10, 5}, new int[]{10, 5}));


        final int[] array = {10, 5, 9, 0, 10, 3, 2};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));

//        BinarySearch needs to operate with sorted arrays! READ JAVA DOCS
        System.out.println(Arrays.binarySearch(array, 5));
        System.out.println(Arrays.binarySearch(array, -1));
        System.out.println(Arrays.binarySearch(array, 10));

    }

}
