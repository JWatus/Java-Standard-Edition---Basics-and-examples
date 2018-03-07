package com.infoshare;

public class Fraction {

    double counter;
    double denominator;

    public void fractionMethod(double counter, double denominator) {

        this.counter = counter;
        this.denominator = denominator;

        System.out.println(counter/denominator+"["+counter+"/"+denominator+"]");
    }

}
