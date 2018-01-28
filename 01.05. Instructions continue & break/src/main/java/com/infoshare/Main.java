package com.infoshare;

public class Main {

    public static void main(String[] args) {

        printer(15);
    }

    
    public static void printer(int range) {

        for(int i = 0; i <= range; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);

            if (i % 11 == 0) {
                break;
            }
        }
    }

}

