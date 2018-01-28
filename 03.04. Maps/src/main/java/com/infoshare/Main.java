package com.infoshare;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Integer a = 1;
        Integer b = 2;
        Integer c = 3;
        Integer d = 4;

        String sOne = "one";
        String sTwo = "two";
        String sThree = "three";
        String sFour = "four";

        Map<Integer, String> mapa = new HashMap<Integer, String>();
        mapa.put(1, "one");
        mapa.put(2, "two");
        mapa.put(3, "three");
        mapa.put(4, "four");
        mapa.put(1, "four");            // wartość dla klucza 1 zostaje nadpisana
        mapa.putIfAbsent(2, "four");    // daje pewność ze do klucza nie zostanie przypisana nowa wartość jeżeli już ma jakąś przypisaną

        for (Integer key : mapa.keySet()) {

            System.out.println(key);           // wypisze klucz
            System.out.println(mapa.get(key)); // wypisze wartość dla klucza
            System.out.println(key+" - "+mapa.get(key));
        }

        // klucze muszą być unikalne a wartości mogą sie powtarzać

        // nadpisuje klucze o tych samych wartościach

//        for (String obj : mapa.values()){   // wypisze wartości
//            System.out.println(obj);
//        }
    }

}