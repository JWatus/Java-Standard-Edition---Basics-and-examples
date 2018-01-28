package com.infoshare.Compartments;

import java.util.Scanner;

public class Compartment {

    int x;
    int y;
    int z;

    public void translate() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilość liczb: ");
        x = scanner.nextInt();

        System.out.println("Ilość przedziałów: ");
        y = scanner.nextInt();

        System.out.println("Zakres liczb: ");
        z = scanner.nextInt();

        Compartment nowy = new Compartment();
        nowy.generate(x, y, z);

    }


    public void generate(int x, int y, int z) {

        int[] tab = new int[z / y];


        for (int i = 0; i < x; i++) {
            int rand = (int) (z * Math.random() + 1);

            for (Integer j = 0; j < z / y; j++) {
                if (rand > j * (z / y) && rand < (j + 1) * (z / y)) {
                    tab[j]++;

                }
                System.out.print(tab[j] + " ");
            }
        }
    }
}