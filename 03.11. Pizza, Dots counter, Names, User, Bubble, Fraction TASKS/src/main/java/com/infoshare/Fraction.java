package com.infoshare;

public class Fraction {

    int counter;
    int denominator;
    double value;

    public void fractionMethod(double value,  int counter, int denominator) {

        this.counter = counter;
        this.denominator = denominator;
        this.value = value;

        System.out.println(value+"["+counter+"/"+denominator+"]");
    }

}
