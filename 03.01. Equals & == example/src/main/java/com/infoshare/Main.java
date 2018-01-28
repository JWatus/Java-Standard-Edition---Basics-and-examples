package com.infoshare;


public class Main {
    public static void main(String[] args) {

        EqualsTest obiekt1 = new EqualsTest(1, 2.4, "Jeden");
        EqualsTest obiekt2 = new EqualsTest(1, 2.4, "Jeden");

        if (obiekt1 == obiekt2) {
            System.out.println("Są równe");
        } else {
            System.out.println("Nie są równe");
        }

        if (obiekt1.equals(obiekt2)) {
            System.out.println("Są równe");
        } else {
            System.out.println("Nie są równe");
        }
    }
}


