package com.infoshare;

public class Menu {
    int number;
    String text;

    Menu(int number, String text) {
        System.out.println("Tworzę obiekt typu Menu");
        this.number = number;
        this.text = text;
    }

    public void write() {
        System.out.println("*" + number + "-" + text + "*");
    }

    public void writeParameters(int number, String text) {
        System.out.println("*" + number + "-" + text + "*");
    }

    public void checkClass(String text) {

        System.out.println("Ten tekst jest klasy " + text.getClass()+".");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void staticMethod() {
        System.out.println("This is static method.");
    }

    public void nonStaticMethod() {
        System.out.println("This is NON static method.");
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
