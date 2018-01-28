package com.infoshare;


public class Main {
    public static void main(String[] args) {

        fillTable(5);

    }

    private static void fillTable(int x) {

        int[] array = new int[x];
        int rand;

        for (int i = 0; i < x; i++) {
            rand = (int) Math.random() * 10;
            array[i] = rand;
            System.out.println(array[i]);
        }

    }
}


