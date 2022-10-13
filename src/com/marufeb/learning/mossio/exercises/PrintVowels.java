package com.marufeb.learning.mossio.exercises;

public class PrintVowels {
    public static void main(String[] args) {
        final String s = "Ciao bello";
        final char[] chars = s.toCharArray();  // abbiamo CONVERTITO la stringa s in un array di caratteri
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                System.out.println(chars[i]);
            }
        }

        for (char c : chars) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println(c);
            }
        }

        for (char c : chars) {
            switch (c) {
                case 'a', 'e', 'i', 'o', 'u' -> System.out.println(c);
            }
        }

    }
}
