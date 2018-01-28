package com.infoshare;

public class Main {

    //  przykład == i equals dla dwóch obiektów
    //  wygeneruj lub usuń hashCode() i equals() z klasy Menu, żeby zobaczyć różnicę
    //  eqHashExample()

    public static void main(String[] args) {

        String s1 = "INFOshare";
        String s2 = new String("infoSHARE");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));


        Menu menu1 = new Menu();
        menu1.setNumber(2);
        menu1.setText("abc");

        Menu menu2 = new Menu();
        menu2.setNumber(2);
        menu2.setText("abc");

        if (menu1 == menu2) {
            System.out.println("==");
        }
        if (menu1.equals(menu2)) {
            System.out.println("eq");
        }

        System.out.println(menu1.hashCode());
        System.out.println(menu2.hashCode());

////////////////////////////////////////////////////////////////////////////////////////////

        String t1= "tekst";
        String t2= "tekst";

        if (t1==t2)
            System.out.println("t1 i t2 sa rowne"+" "+t1.hashCode());
        else
            System.out.println("t1 i t2 NIE sa rowne");

        if (t1.equals(t2))
            System.out.println("t1 i t2 sa rowne"+" "+t2.hashCode());
        else
            System.out.println("t1 i t2 NIE sa rowne");



        String t3= new String("tekst");  // nie są równe bo są w różnych miejscach w pamięci
        String t4= "tekst";

        if (t3==t4)
            System.out.println("t1 i t2 sa rowne"+" "+t3.hashCode());
        else
            System.out.println("t1 i t2 NIE sa rowne");

        if (t3.equals(t4))
            System.out.println("t1 i t2 sa rowne"+" "+t4.hashCode());
        else
            System.out.println("t1 i t2 NIE sa rowne");


    }
}


