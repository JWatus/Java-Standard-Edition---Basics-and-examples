package com.infoshare;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu(15, "text");

        System.out.println(menu.number);
        System.out.println(menu.text);

        menu.write();
        menu.writeParameters(43, "cos");
        menu.checkClass("Tekst do sprawdzenia klasy");

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Menu.staticMethod();            // Metoda statyczna - możliwe wywołanie bez tworzenia obiektu klasy
        menu.nonStaticMethod();

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}


