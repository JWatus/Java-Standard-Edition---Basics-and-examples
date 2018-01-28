package com.infoshare;

public class Menu {

    int number;

    Menu(int number) {

        this.number = number;

    }

    void metoda(boolean flaga, int newNumber){

        if (flaga) {
            number += newNumber;
        }
        else {
            number -= newNumber;
        }
    }

    void show() {
        System.out.println(number);
    }
}