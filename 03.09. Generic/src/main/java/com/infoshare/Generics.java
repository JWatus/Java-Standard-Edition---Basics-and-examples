package com.infoshare;

public class Generics {

    public static void main(String[] args) {

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

    static class Generic<T>     {

        private T item;

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
}
