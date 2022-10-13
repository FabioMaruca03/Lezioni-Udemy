package com.marufeb.learning.mossio.exercises;

public class StringReverse {
    public static void main(String[] args) {
        final String s = "Hello World";

        for (int i = s.length()-1; i >= 0; i--) {
            System.out.print(s.charAt(i));        // prende il carattere in una stringa in una determinata posizione
        }

        for (int i = s.length() - 1 ; i >= 0; i--) {
            System.out.print(s.toCharArray()[i]); // prende il carattere in un array di caratteri in una determinata posizione
        }

    }
}
