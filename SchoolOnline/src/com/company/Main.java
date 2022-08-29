package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        List<Card> deckOfCard = new ArrayList<>();
        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCard.add(new Card(suit, face));
            }
        }
        System.out.println("Original deck of Cards");
        for (int i = 0; i < deckOfCard.size(); i++) {
            System.out.printf("%-20s %s",deckOfCard.get(i), (i + 1)%4 == 0 ? "\n" : "  ");
        }
        Collections.shuffle(deckOfCard);
        System.out.println("Cards after shuffle");
        for (int i = 0; i < deckOfCard.size(); i++) {
            System.out.printf("%-20s %s",deckOfCard.get(i), (i + 1)%4 == 0 ? "\n" : "  ");
        }
        Collections.sort(deckOfCard);
        System.out.println("\n\n Cards after sorting");
        for (int i = 0; i < deckOfCard.size(); i++) {
            System.out.printf("%-20s %s",deckOfCard.get(i), (i + 1)%4 == 0 ? "\n" : "  ");
        }
    }


    public static class Card implements Comparable<Card> {

        private enum Suit {HEARTS, SPADES, CLUBS, DIAMONDS}

        private enum Face {Ace, Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King}

        private final Suit suit;
        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {
            Face[] values = Face.values();
            List<Face> faces = Arrays.asList(values);
            if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
                return 1;
            } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
                return String.valueOf(suit).compareTo(String.valueOf(getSuit()));
            }
            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }
    }
}