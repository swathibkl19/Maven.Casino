package io.zipcoder.casino.utilities.CasinoGame;

public class Card {
    /*private String cardName;
    private String suit;
    private int blackJackValue;
    private int generalValue;
    private TreeMap<String, Integer>cardBlackJackMap;
    private TreeMap<String, Integer>cardGeneralValueMap;

    public Card(CardName cardName, Suit suit) {
         this.cardName=cardName.name();
         this.suit = suit.name();
        this.blackJackValue=cardName.valu

        populateCardBlackJackMap();
        populateCardGeneralValueMap();

    }
    public String getCardName() {

        return cardName;
    }

    public String getCardSuit() {

        return suit;
    }
    public void populateCardBlackJackMap(){
        for(int i = 2; i<=10; i++){
            cardBlackJackMap.put(String.valueOf(i),i);
        }
        cardBlackJackMap.put("J",10);
        cardBlackJackMap.put("Q",10);
        cardBlackJackMap.put("K",10);
        cardBlackJackMap.put("A",10);

    }
    public void populateCardGeneralValueMap(){
        for(int i = 2; i<=10; i++){
            cardGeneralValueMap.put(String.valueOf(i),i);
        }
        cardGeneralValueMap.put("J",11);
        cardGeneralValueMap.put("Q",12);
        cardGeneralValueMap.put("K",13);
        cardGeneralValueMap.put("A",14);

    }

    public int getCardBlackJackValue() {
        return blackJackValue;
    }

    public int getCardGeneralValue() {
        return generalValue;
    }

    public String toString() {
        return "CardName:"+cardName+ " Suit:"+suit+" BlackJackValue:"+blackJackValue+" GeneralValue:"+generalValue;
    }*/
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
