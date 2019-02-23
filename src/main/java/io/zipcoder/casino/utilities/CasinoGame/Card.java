package io.zipcoder.casino.utilities.CasinoGame;

public class Card {
    private String cardName;
    private String suit;
    private int blackJackValue;
    private int generalValue;

    public Card(){}

    public Card(String cardName, String suit, int blackJackValue, int generalValue) {
         this.cardName=cardName;
         this.suit = suit;
         this.blackJackValue = blackJackValue;
         this.generalValue= generalValue;
    }

    public String getCardName() {

        return cardName;
    }

    public String getCardSuit() {

        return suit;
    }


    public void setBlackJackValue(int blackJackValue) {
        this.blackJackValue = blackJackValue;
    }

    public int getCardBlackJackValue() {
        return blackJackValue;
    }

    public int getCardGeneralValue() {
        return generalValue;
    }

    public String toString() {
        return "CardName:"+cardName+ " Suit:"+suit+" BlackJackValue:"+blackJackValue+" GeneralValue:"+generalValue;
    }

}
