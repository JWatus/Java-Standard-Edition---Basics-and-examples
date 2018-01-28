package com.infoshare;

import java.util.Objects;

public class Menu {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return number == menu.number &&
                Objects.equals(text, menu.text);
    }

    @Override
    public int hashCode() {

        return Objects.hash(number, text);
    }


    private int number;
    private String text;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


}
