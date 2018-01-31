package com.infoshare;

public class Generic<T> {

    private T item;


    public Generic() {
        this.item = item;
    }

    public void set(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void showClass() {
        System.out.println(this.getClass());
    }

    public void showItemClass() {
        System.out.println(item.getClass());
    }
}
