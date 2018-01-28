package com.infoshare;

import java.util.Arrays;

public class Tab {

    public void methodTab(int a) {

        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = i + a;
        }

        System.out.println(Arrays.toString(tab));  // pokazuje wartości tablicy w szyku
    }
}
