package com.infoshare;

import java.util.HashSet;
import java.util.Set;

public class Setter {

    public static void setter() {

        Set<String> zbior = new HashSet<String>();
        zbior.add("pierwszy");
        zbior.add("drugi");
        zbior.add("drugi");
        zbior.add("trzeci");
        zbior.add("drugi");

        for (String mySigns : zbior) {
            System.out.println(mySigns);
        }
    }
}
