package com.infoshare;

import java.util.ArrayList;
import java.util.List;

public class Lister {

    public static void array() {

        List<String> lista = new ArrayList<String>();

        lista.add("jeden");
        lista.add("dwa");
        lista.add("dwa");
        lista.add("dwa");
        lista.add("dwa");
        lista.add("trzy");
        lista.add("cztery");

        System.out.println(lista);
        System.out.println(lista.get(4));

    }
}
