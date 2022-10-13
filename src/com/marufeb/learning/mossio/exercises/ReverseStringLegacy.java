package com.marufeb.learning.mossio.exercises;

public class ReverseStringLegacy {

    public static void main(String[] args) {
        final char[] chars = getGreetingsString();
        char temp;

        for (int i = 0, j; i < chars.length / 2; i++) {
            j = (chars.length - 1) - i; // ricordiamo che i + j è = a chars.length
            temp = chars[j];            // con la variabile temp, salviamo il carattere nella posizione j (altrimenti sarebbe sovrascritto)
            chars[j] = chars[i];        // inverto i caratteri (male)
            chars[i] = temp;            // sposto l'ultimo carattere
        }

        System.out.println(chars);
        
    }

    private static char[] getGreetingsString() {
        return "Hello World".toCharArray();
    }

}
