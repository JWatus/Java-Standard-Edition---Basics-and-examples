package com.infoshare;

import java.util.*;

public class Compartment {

    public static void setCompartment() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ilość liczb");
        int x = scanner.nextInt();

        System.out.println("Podaj ilość przedziałów");
        int y = scanner.nextInt();

        System.out.println("Podaj zakres liczb");
        int z = scanner.nextInt();

        int przedział = z / y;

        int[] tab = new int[y];

        for (int i = 0; i < x; i++) {

            double[] p = new double[x];
            p[i] = (int) (z * Math.random() + 1);

            for (int j = 0; j < y; j++) {
                if (p[i] >= j * przedział + 1 && p[i] <= (j + 1) * przedział) {

                    tab[j] += 1;
                }
            }

        }
        for (int i = 0; i < y; i++)
            System.out.println(tab[i]);

    }

}

