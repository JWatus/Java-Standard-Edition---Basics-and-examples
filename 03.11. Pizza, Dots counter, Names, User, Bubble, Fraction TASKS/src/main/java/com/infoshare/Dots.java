package com.infoshare;

import java.util.Scanner;

public class Dots {

    public void dotCounter() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj tekst: ");
        String s = scanner.nextLine();

        char[] tab = s.toCharArray();
        /// abcdef => [a,b,c,d,e,f]

        int sumaKropek = 0;
        for (char c : tab) {
            if (c == '.') {
                sumaKropek++;
            }
        }
        System.out.println("Suma kropek: " + sumaKropek);
    }


}