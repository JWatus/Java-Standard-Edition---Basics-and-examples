package com.infoshare.Calculations;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Figure {

    private Scanner scanner;
    private Figures[] figures;

    public void run() {
        scanner = new Scanner(System.in);
        figures = Figures.values();

        showMenu();
        int selectedOption = scanSelectedOption();
        int parameters = scanParameters(selectedOption);
        calculate(selectedOption);

    }

    private void showMenu() {
        for (int i = 0; i < figures.length; i++) {
            System.out.println(i + ". " + figures[i]);
        }
    }

    private int scanSelectedOption() {
        int selectedOption;
        do {
            System.out.print("TYPE SELECTED OPTION: ");
            selectedOption = scanner.nextInt();
        } while (isOptionIncorrect(selectedOption));

        return selectedOption;
    }

    private boolean isOptionIncorrect(int selectedOption) {
        if (selectedOption < 0 || selectedOption >= figures.length) {
            return true;
        } else {
            return false;
        }
    }

    int h, a, b, c, r;

    private int scanParameters(int selectedOption) {

        switch (selectedOption) {
            case 0:
                System.out.print("TYPE H: ");
                h = scanner.nextInt();
                System.out.print("TYPE A: ");
                a = scanner.nextInt();
                System.out.print("TYPE B: ");
                b = scanner.nextInt();
                System.out.print("TYPE C: ");
                c = scanner.nextInt();
                break;
            case 1:
                System.out.print("TYPE A: ");
                a = scanner.nextInt();
                break;
            case 2:
                System.out.print("TYPE R: ");
                r = scanner.nextInt();
                break;
            case 3:
                System.out.print("TYPE A: ");
                a = scanner.nextInt();
                System.out.print("TYPE B: ");
                b = scanner.nextInt();
                break;
        }

        return selectedOption;
    }

    private void calculate(int selectedOption) {

        int P;
        int O;

        switch (selectedOption) {
            case 0:
                System.out.println("Trójkąt o bokach "+a+","+b+" "+c+" i wysokości "+h+" ma");
                System.out.println("Pole: ");
                P = b * h / 2;
                System.out.println(P);
                System.out.println("Obwód: ");
                O = a + b + c;
                System.out.println(O);
                break;
            case 1:
                System.out.println("Kwadrat o boka "+a+" ma");
                System.out.println("Pole: ");
                P = a * a;
                System.out.println(P);
                System.out.println("Obwód: ");
                O = 4 * a;
                System.out.println(O);
                break;
            case 2:
                System.out.println("Koło o promieniu "+r+" ma");
                System.out.println("Pole: ");
                P = (int) PI * r * r;
                System.out.println(P);
                System.out.println("Obwód: ");
                O = 2 * (int) PI * r;
                System.out.println(O);
                break;
            case 3:
                System.out.println("Prostokąt o bokach "+a+" i "+b+" ma");
                System.out.println("Pole: ");
                P = a * b;
                System.out.println(P);
                System.out.println("Obwód: ");
                O = 2 * a + 2 * b;
                System.out.println(O);
                break;
        }
    }

}




