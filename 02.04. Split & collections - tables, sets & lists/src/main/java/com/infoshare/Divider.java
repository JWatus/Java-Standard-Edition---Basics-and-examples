package com.infoshare;

public class Divider {

    public void separate() {

        String toJestString = "to:jest:ten:tekst";
        String[] s = toJestString.split(":");

        System.out.println(s.length);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
