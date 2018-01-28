package com.infoshare.calculator;

import java.util.Scanner;

public class Calculator {
    private Scanner scanner;
    private Operations[] operations;

    public void run() {
        scanner = new Scanner(System.in);
        operations = Operations.values();

        showMenu();
        int selectedOption = scanSelectedOption();
        int numberOfElements = scanNumberOfElements();
        scanElementsAndCalculate(selectedOption, numberOfElements);
    }

    private void showMenu() {
        for (int i = 0; i < operations.length; i++) {
            System.out.println(i + ". " + operations[i]);
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
        if (selectedOption < 0 || selectedOption >= operations.length) {
            return true;
        } else {
            return false;
        }
//        return selectedOption < 0
//                || selectedOption >= operations.length;
    }

    private int scanNumberOfElements() {
        System.out.print("TYPE NUMBER OF ELEMENTS TO CALCULATE: ");
        return scanner.nextInt();
    }

    private void scanElementsAndCalculate(int selectedOption, int numberOfElements) {
        String operationsText = "";
        Double result = 0.0; // lub 0d - double, 0f - float, 0l - long
        int element;

        System.out.println("Podaj liczby: ");

        //pierwszy element
        element = scanner.nextInt();
        operationsText += element;
        result = Double.valueOf(element);

        for (int i = 1; i < numberOfElements; i++) {
            element = scanner.nextInt();
            switch (selectedOption) {
                case 0:
                    //dodawanie
                    operationsText += " + " + element;
                    result += element;
                    break;
                case 1:
                    //odejmowanie
                    operationsText += " - " + element;
                    result -= element;
                    break;
                case 2:
                    //mnozenie
                    operationsText += " * " + element;
                    result *= element;
                    break;
                case 3:
                    //dzielenie
                    operationsText += " / " + element;
                    result /= element;
                    break;
            }
        }

        System.out.println("OPERATION: " + operationsText);
        System.out.println("RESULT: " + result);
    }
}
