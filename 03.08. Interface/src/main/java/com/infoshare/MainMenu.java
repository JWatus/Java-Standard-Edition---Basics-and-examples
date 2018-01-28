package com.infoshare;

public class MainMenu implements Menu {

    @Override
    public void show() {
        System.out.println("Ta metoda została zaimplementowana.");
    }

    @Override
    public void close() {
        System.out.println("Ta metoda została zaimplementowana.");
    }

    @Override
    public void runOption(int option) {
        System.out.println("Ta metoda została zaimplementowana."+" opcja: "+option);
    }

    public void notImplementedMethod(){
        System.out.println("Ta metoda nie została zaimplementowana.");
    }

}
