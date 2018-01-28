package com.infoshare.cards;

import java.util.Scanner;

public class Card {

    private Suits cardSuit;
    private Ranks cardRank;

    public void createCard() {

        String s, r;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set suit: ");
        s = scanner.next();
        System.out.println("Set rank: ");
        r = scanner.next();

        setCardSuit(s);
        setCardRank(r);

        getDescription();
    }


    public Suits getCardSuit() {
        return cardSuit;
    }

    public Ranks getCardRank() {
        return cardRank;
    }

    public void setCardSuit(String name) {
        cardSuit = Suits.valueOf(name);
    }

    public void setCardRank(String name) {
        cardRank = Ranks.valueOf(name);
    }

    public void getDescription() {

        System.out.println(getCardSuit() + "-" + getCardRank());
    }

}
