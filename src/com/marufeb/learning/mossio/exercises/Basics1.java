package com.marufeb.learning.mossio.exercises;

public class Basics1 {

    public static void main(String[] args) {

        /*
         * Stampare a video la seguente figura:
             ******
             *****
             ****
             ***
             **
             *
         */
        for (int i = 6; i >= 1; i--) {
            System.out.println("*".repeat(i));
        }

        for (int i = 6; i >= 1; i--) {
            System.out.println("******".substring(0, i));
        }

        for (int i = 6; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }

}
