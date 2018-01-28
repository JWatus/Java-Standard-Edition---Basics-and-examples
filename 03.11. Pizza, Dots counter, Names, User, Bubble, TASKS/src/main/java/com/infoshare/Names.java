package com.infoshare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Names {

    public static void getName() {

        int ilosc;

        Scanner name = new Scanner(System.in);
        System.out.println("Podaj ilość imion");
        ilosc = name.nextInt();

        String[] tab = new String[ilosc];

        for (int i = 0; i < ilosc; i++) {
            System.out.println("Podaj imię: ");
            tab[i] = name.nextLine();
        }
        checkNames(tab);
    }


    public static void checkNames(String tab[]) {

        String min = tab[0];
        String max = tab[0];
        int suma = 0;

        for (int i = 0; i < tab.length; i++) {

            if (tab[i].length() < min.length()) {
                min = tab[i];
            }
        }

        System.out.println("Najkrótsze imię to: " + min + ".");

        for (int i = 0; i < tab.length; i++) {

            if (tab[i].length() > max.length()) {
                max = tab[i];
            }
        }

        System.out.println("Nadłuższe imię to: " + max + ".");


//        List<String> lista = new ArrayList<String>();
//
//        for (int i = 0; i < tab.length; i++) {
//            lista.add(tab[i]);
//        }

    }
}


