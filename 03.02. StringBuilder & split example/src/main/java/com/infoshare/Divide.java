package com.infoshare;

public class Divide {

    public static void myBuilder() {

        StringBuilder nowy = new StringBuilder();
        nowy.append("TO#");
        nowy.append("JEST#");
        nowy.append("NOWY#");
        nowy.append("TEKST#");

        System.out.println(nowy);

        String s1 = nowy.toString();

        String[] k = s1.split("#");

        for (int i = 0; i < k.length; i++)
            System.out.println(k[i]);
    }

}
