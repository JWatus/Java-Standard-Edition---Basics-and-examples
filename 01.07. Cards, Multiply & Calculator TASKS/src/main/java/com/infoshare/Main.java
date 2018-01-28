package com.infoshare;

import com.infoshare.calculator.Calculator;
import com.infoshare.cards.Card;
import com.infoshare.eagles.EaglesMultiplier;

public class Main {

    public static void main(String[] args) {
        runCardTask();
        runEaglesTask();
        runCalcTask();
    }

    private static void runCardTask() {
        System.out.println("CARD TASK");
        Card card = new Card();
        card.createCard();
    }

    private static void runEaglesTask() {
        System.out.println("EAGLES TASK");
        EaglesMultiplier eaglesMultiplier = new EaglesMultiplier();
        eaglesMultiplier.run();
    }

    private static void runCalcTask() {
        System.out.println("CALC TASK");
        Calculator calculator = new Calculator();
        calculator.run();
    }
}


