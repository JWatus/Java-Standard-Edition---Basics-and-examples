package com.infoshare;

import java.util.Scanner;

public class Names {

    public static void getName() {

        Scanner name = new Scanner(System.in);
        System.out.println("Podaj ilość imion");
        int ilosc = Integer.parseInt(name.nextLine());

        String[] tab = new String[ilosc];

        for (int i = 0; i < ilosc; i++) {
            System.out.println("Podaj imię: ");
            tab[i] = name.nextLine();
        }

        checkNames(tab);

        ////////////////////////////////////////////////////////////////////////

        int[] tab2 = new int[ilosc];
        String[] tab3 = new String[ilosc];


        outerloop:
        for (int i = 0; i < tab.length - 1; i++) {
            for (int z = 0; z < i; z++) {
                if (tab[i].equals(tab3[z])) {
                    continue outerloop;
                }
            }

            for (int j = i + 1; j < tab.length; j++) {
                if (tab[i].equals(tab[j])) {
                    tab2[i] += 1;
                    tab3[i] = tab[i];
                }
            }
        }

        for (int x = 0; x < ilosc; x++) {
            if (tab2[x] > 0) {
                System.out.println("Imię powtarzające się to: "+tab3[x].toUpperCase()+" razy:"+(tab2[x] + 1));
            }

        }
    }

    public static void checkNames(String tab[]) {

        String min = tab[0];
        String max = tab[0];
        int suma = 0;

        ////////////////////////////////////////////////////////////////////////

        for (int i = 0; i < tab.length; i++) {

            if (tab[i].length() < min.length()) {
                min = tab[i];
            }
        }

        System.out.println("Najkrótsze imię to: " + min.toUpperCase() + ".");

        ///////////////////////////////////////////////////////////////////////

        for (int i = 0; i < tab.length; i++) {

            if (tab[i].length() > max.length()) {
                max = tab[i];
            }
        }

        System.out.println("Nadłuższe imię to: " + max.toUpperCase()+".");

        //////////////////////////////////////////////////////////////////////
    }
}