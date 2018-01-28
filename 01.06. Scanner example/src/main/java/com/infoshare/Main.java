package com.infoshare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //pobranie 2 liczb typu double z klawiatury i dodanie ich do siebie
        scannerExample();

    }

    private static void scannerExample() {
        double d1;
        double d2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj d1: ");
        d1 = scanner.nextDouble();
        System.out.println("Podaj d2: ");
        d2 = scanner.nextDouble();

        System.out.println("wynik: " + (d1 + d2));

    }
}