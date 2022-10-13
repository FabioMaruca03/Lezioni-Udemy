package com.marufeb.learning.mossio.exercises;

import java.util.Scanner;

public class basics2 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > max){
//                max = array[i];
//            }
//        }

        for (int i : array) {
            max = Math.max(max, i);
        }


        System.out.println(max);
    }
}
