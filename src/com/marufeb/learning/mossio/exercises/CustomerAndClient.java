package com.marufeb.learning.mossio.exercises;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerAndClient {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] prodotto = new String[5];

        // Finché l'utente non inserisce 'stop' continuare a salvare i dati del proprietario in formato [nome prezzo€]

        // tastiera.nextLine().equalsIgnoreCase("Stop")
        int i = 0;
        do {
            if (prodotto.length == i) {
                prodotto = Arrays.copyOf(prodotto, prodotto.length + 5);
            }
            prodotto[i] = tastiera.nextLine();
        } while (!prodotto[i++].equalsIgnoreCase("stop"));
        System.out.println(Arrays.toString(prodotto));

        double[] prezzi = new double[i - 1];
        double budget = tastiera.nextDouble();
        for (int j = 0; j <= budget && j != i - 1; j++) {
            final String prezzoStampato = prodotto[j].split(" ")[1].replace("€", ""); // Separo il prezzo dai prodotti
            System.out.println(prodotto[j]);
            prezzi[j] = Double.parseDouble(prezzoStampato); // Converto il prezzo in double

            if (budget >= prezzi[j])
                budget -= prezzi[j];
            else break; // Finito i soldi
        }


    }
}
