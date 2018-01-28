package com.infoshare;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        System.out.println(menu.getNumber());
        menu.setNumber(123);
        System.out.println(menu.getNumber());

        System.out.println(menu.getText());
        menu.setText("TEKST");
        System.out.println(menu.getText());

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Objects objects = new Objects();

        System.out.println(objects.getMyInt());
        System.out.println(objects.getMyInteger());
    }
}


