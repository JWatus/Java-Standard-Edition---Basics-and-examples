package com.infoshare;

public class Person implements Comparable<Person> {

    String name, surname, nick;

    Person(String name, String surname, String nick) {

        this.name = name;
        this.surname = surname;
        this.nick = nick;

    }

    @Override
    public String toString() {
        return surname + " " + name + " " + nick + " ";
    }

    /* Każda klasa dziedziczy z klasy Object metodę toString(). Metoda ta ma za zadanie zwrócić tekstowy opis obiektu.
    Standardowa implementacja metody zwraca jako opis obiektu nazwę klasy oraz nic nie mówiący kod będący wynikiem
    funkcji skrótu. */

    public int compareTo(Person person) {
        int porownaneNazwiska = surname.compareTo(person.surname);

        if(porownaneNazwiska == 0) {
            return name.compareTo(person.name);
        }
        else {
            return porownaneNazwiska;
        }
    }
}

