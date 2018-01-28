package com.infoshare;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        System.out.println(menu.getMyOption());
        menu.setMyOption(Option.END);
        System.out.println(menu.getMyOption());

    }
}


