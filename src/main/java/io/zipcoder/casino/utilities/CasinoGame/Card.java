package io.zipcoder.casino.utilities.CasinoGame;

public class Card {
    
    private Suit suit;
    private BlackJackEnum blackJackEnum;
    private CardDefultEnum cardDefultEnum;

    public Card (BlackJackEnum blackJackEnum, Suit suit)
    {
        this.blackJackEnum = blackJackEnum;
        this.suit = suit;
    }
    public Card (CardDefultEnum cardDefultEnum, Suit suit)
    {
        this.cardDefultEnum = cardDefultEnum;
        this.suit = suit;
    }

    public Suit getSuit()
    {
        return suit;
    }

    public void setSuit(Suit suit)
    {
        this.suit = suit;
    }

    public BlackJackEnum getBlackJackEnum()
    {
        return blackJackEnum;
    }

    public void setBlackJackEnum(BlackJackEnum blackJackEnum)
    {
        this.blackJackEnum = blackJackEnum;
    }


}
