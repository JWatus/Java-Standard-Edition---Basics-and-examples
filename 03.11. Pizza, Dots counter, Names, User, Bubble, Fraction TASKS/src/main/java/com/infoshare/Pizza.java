package com.infoshare;

import java.util.Scanner;

public class Pizza {

    public void orderPizza() {
        Scanner scanner = new Scanner(System.in);

        boolean isIncorrect = true;
        int d = 0;
        int price = 0;

        while (isIncorrect) {
            System.out.println("Podaj cenę: ");
            try {
                price = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Cena musi być podana jako liczba całkowita");
                scanner.next();
            }
        }

        while (isIncorrect) {
            System.out.println("Podaj średnicę: ");
            try {
                d = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Średnica musi być podana jako liczba całkowita");
                scanner.next();
            }
        }

        if (d / price > 2) {
            System.out.println("Opłaca się.");
        } else if (d / price < 1) {
            System.out.println("Nie opłaca się.");
        } else {
            System.out.println("Może być.");
        }
    }
}
