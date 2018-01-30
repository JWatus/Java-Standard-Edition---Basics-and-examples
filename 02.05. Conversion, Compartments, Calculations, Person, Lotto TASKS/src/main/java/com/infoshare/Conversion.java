package com.infoshare;

import java.util.Scanner;

public class Conversion {

    public void translate(){

        Integer i;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Liczba do konwersji: ");
        i = scanner.nextInt();

        System.out.println(Integer.toBinaryString(i));

    }

}