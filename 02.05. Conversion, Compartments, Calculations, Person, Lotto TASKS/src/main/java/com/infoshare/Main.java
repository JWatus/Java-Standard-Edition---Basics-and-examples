package com.infoshare;

import com.infoshare.Calculations.*;
import com.infoshare.Conversion.*;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Conversion kon = new Conversion();
        kon.translate();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Figure fig = new Figure();
        fig.run();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Person one = new Person("Adam", "Kowalski", "Lysy");
        Person two = new Person("Czarek", "Kolski", "Rudy");
        Person three = new Person("Bożena", "Nowakowska", "Purr");
        Person four = new Person("Zofia", "Smith", "Zuzu");
        Person five = new Person("Anna", "Nowakowska", "Anja");

        List<Person> lista = new ArrayList<Person>();

        lista.add(one);
        lista.add(two);
        lista.add(three);
        lista.add(four);
        lista.add(five);

        System.out.println("Nieposortowanie: ");
        for (Person man : lista) {
            System.out.println(man);
        }

        Collections.sort(lista);

        System.out.println("\nPosortowane: ");
        for (Person man : lista) {
            System.out.println(man);
        }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Lotto lotto = new Lotto();
        lotto.draw();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Compartment.setCompartment();

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }

}
