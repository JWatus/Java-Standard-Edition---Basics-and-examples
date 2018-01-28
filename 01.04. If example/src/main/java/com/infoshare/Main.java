package com.infoshare;

public class Main {

    public static void main(String[] args) {

        Menu menu1 = new Menu();
        Menu menu2 = new Menu();

        menu1.setNumber(1);
        menu2.setNumber(2);

        menu1.updateOption();
        menu2.updateOption();

        System.out.println(menu1.getMyOption());
        System.out.println(menu2.getMyOption());
    }
}


