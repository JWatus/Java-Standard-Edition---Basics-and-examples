package com.infoshare;

import com.infoshare.User.Admin;
import com.infoshare.User.Developer;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();
        pizza.orderPizza();

        Dots dots = new Dots();
        dots.dotCounter();

        Name name = new Name();
        name.myName();

        Admin admin = new Admin();
        admin.showInfo("Imię admina", "Admin");

        Developer devs = new Developer();
        devs.showInfo("Imię deva", "Dev");

        Bubble.bubble();

        Names newNames = new Names();
        newNames.getName();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Fraction one = new Fraction();
        Fraction two = new Fraction();
        Fraction three = new Fraction();
        Fraction four = new Fraction();

        one.fractionMethod(9.7, 1, 5);
        two.fractionMethod(1076.53, 11, 5);
        three.fractionMethod(19.743, 111, 2);
        four.fractionMethod(3.0, 2, 3);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Generic<String> gs = new Generic<>();
        Generic<Integer> gi = new Generic<>();
        Generic gen = new Generic();

        gs.showClass();
        gi.showClass();
        gen.showClass();

        gs.set("S");
        gi.set(1);
        gen.set(2.0);

        gs.showItemClass();
        gi.showItemClass();
        gen.showItemClass();

        System.out.println(gs.get());
        System.out.println(gi.get());
        System.out.println(gen.get());

    }
}



