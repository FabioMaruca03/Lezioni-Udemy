package com.marufeb.learning.mossio.arrays.base;

import java.util.Arrays;
import java.util.Random;

public class BaseArrayLesson {

    public static void main(String[] args) {
        final String s = "Hello world";
        final char[] chars = s.toCharArray();

        // For each char in string s
        for (char c : chars) {

            // If c is lowercase then print otherwise do nothing
            if (Character.isLowerCase(c)) {
                System.out.print(c);
            }
        }

        System.out.println();

        final Integer[] i1 = new Integer[] {1, 2, 3};
        final Integer[] i2 = new Integer[10];

        final Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < i2.length; i++) {
            i2[i] = random.nextInt();
        }

        System.out.println(Arrays.toString(i2));

        // Mod chars into ASCII codes
        for (char c : chars) {
            System.out.printf("%3d | ", (int) c - ('a'- 'A'));
        }

        // Unicode
        System.out.println("\uD83E\uDD23");

        System.out.println();

        // Switch lowercase with uppercase and vice versa
        for (int i = 0; i < chars.length; i++) {
            if (Character.isLowerCase(chars[i]))
                chars[i] = Character.toUpperCase(chars[i]);
            else
                chars[i] = Character.toLowerCase(chars[i]);
        }

        System.out.println(String.valueOf(chars));
        System.out.println(s);

    }

}
