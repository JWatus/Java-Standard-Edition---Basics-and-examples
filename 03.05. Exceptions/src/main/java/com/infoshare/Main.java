package com.infoshare;

public class Main {

    public static void main(String[] args) {
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        try {
            System.out.println(tab[15]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nie ma takiego miejsca w tablicy.");
        }

        System.out.println("Max indeks do którego można się odwołać wynosi " + tab[tab.length - 1] + ".");
    }
}


