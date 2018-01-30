package com.infoshare;

import java.util.Scanner;

public class Lotto {

    public void draw() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zakres losowanych liczb :");
        int zakres = scanner.nextInt();

        System.out.println("Ilość losowanych liczb :");
        int ilosc = scanner.nextInt();

        int[] liczba = new int[ilosc];


        for (int i = 0; i < ilosc; i++) {

            liczba[i] = (int) (zakres * Math.random() + 1);

            for (int j = 0; j < i ; j++) {

                if (liczba[i] != liczba[j]) {
                    continue;

                } else {
                    liczba[i] = (int) (zakres * Math.random() + 1);
                    j = 0;
                }
            }

            System.out.println(liczba[i]);

        }
    }
}
