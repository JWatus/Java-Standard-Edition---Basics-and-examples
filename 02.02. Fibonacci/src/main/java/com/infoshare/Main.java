package com.infoshare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        int param = scanner.nextInt();

        for(int i = 0; i < param; i++) {
            System.out.println(i+". "+fibonacci(i));
        }

    }

    private static int fibonacci(int x)  {
        if(x == 0)
            return 0;
        else if(x == 1)
            return 1;
        else
            return fibonacci(x - 1) + fibonacci(x - 2);
    }

}


// Ciąg Fibonacciego - trzecia liczba jest sumą dwóch poprzednich