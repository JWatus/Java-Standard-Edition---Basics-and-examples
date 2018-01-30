package com.infoshare;

import java.util.Scanner;

public class Name {

    public void myName() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię: ");
        String name = scanner.nextLine();

        char[] tab = name.toCharArray();
        boolean x = false;

        outerloop:
        for (int i = 0; i < name.length(); i++) {

            for (int j = 0; j < i; j++)
                if (tab[i] == tab[j]) {
                    x = true;
                    System.out.println(x);
                    break outerloop;

                }

        }
        if (x == false)
            System.out.println(x);
    }
}
