package io.zipcoder.casino.utilities.CasinoGame;

import java.util.*;

public class Deck {

    private Stack<Card> blackJackDeck;
    private Stack<Card> regularDeck;

    public Deck () {
        buildBlackJackDeck();
        buildRegularDeck();
    }

    public void buildBlackJackDeck() {

        for (int i = 0; i < 13; i++) {
                BlackJackEnum value = BlackJackEnum.values()[i];

                for (int j = 0; j < 4; j++) {
                    Card card = new Card(value, Suit.values()[j]);
                    this.blackJackDeck.push(card);
                }
            }
            Collections.shuffle(blackJackDeck);
    }
    public void buildRegularDeck() {

        for (int i = 0; i < 13; i++) {
            CardDefultEnum value = CardDefultEnum.values()[i];

            for (int j = 0; j < 4; j++) {
                Card card = new Card(value, Suit.values()[j]);
                this.regularDeck.push(card);
            }
        }
        Collections.shuffle(regularDeck);
    }



}


   /* private TreeMap<String, ArrayList<Integer>> cardMapping;
    //ArrayList<Integer> index 0 will have Black jack value and index 1 will have general value

    Deck(){
        populateDeckWithCards();
    }

    public Card getCard() {
        return null;
    }

    public void shuffle() {

    }

    public int getDeckSize() {

        return deckOfCards.size();
    }
    public void populateDeckWithCards(){
        String[] suits = new String[]{"Spades","Clubs","Diamonds","Hearts"};
        for(int i =0;i<suits.length;i++) {
            for (int j = 2; j <= 10; j++) {
                Card card = new Card(j, );

            }
        }
        populateCardBlackJackMap();
        populateCardGeneralValueMap();
        Set<String> key = cardBlackJackMap.keySet();

        String[] suits = new String[]{"Spades","Clubs","Diamonds","Hearts"};
        for(int i=0;i<cardBlackJackMap.entrySet();i++){

            for(int j=0;j<13;j++){
                Card card = new Card(key, suits[i],);
            }
        }

    }
    public void populateCardMapping(){

    }

    String[] suits = new String[]{"Spades","Clubs","Diamonds","Hearts"};*/

//}
