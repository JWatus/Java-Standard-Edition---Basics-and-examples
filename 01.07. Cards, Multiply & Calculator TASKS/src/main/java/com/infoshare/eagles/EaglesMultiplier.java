package com.infoshare.eagles;

import java.util.Scanner;

public class EaglesMultiplier {
    private Scanner scanner;

    public void run() {
        scanner = new Scanner(System.in);

        int firstNumber = scanNumber();
        int secondNumber = scanNumber();

        int multiplyResult = multiply(firstNumber, secondNumber);
        System.out.println("MULTIPLY WITH * : " + multiplyResult);

        multiplyResult = multiplyWithAddOnly(firstNumber, secondNumber);
        System.out.println("MULTIPLY WITHOUT * : " + multiplyResult);
    }

    private int scanNumber() {
        System.out.print("TYPE NUMBER: ");
        return scanner.nextInt();
    }

    private int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private int multiplyWithAddOnly(int firstNumber, int secondNumber) {

        int total = 0;

        if (firstNumber < 0) {

            for (int i = 1; i <= -firstNumber; i++) {

                total = total - secondNumber;
            }

        } else {

            for (int i = 1; i <= firstNumber; i++) {

                total = total + secondNumber;
            }
        }

        return total;

    }
}

