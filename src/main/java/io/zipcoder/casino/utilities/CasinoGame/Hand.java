package io.zipcoder.casino.utilities.CasinoGame;
import java.util.ArrayList;


public class Hand {

    int value = 0;


   ArrayList<Card> hand;

    public Hand(ArrayList<Card> hand) {

        this.hand = hand;
    }

//    public int getBlackJackValue(ArrayList<Card> hand) {
//
//
//
//        int i = 0;
//
//
//        for (i = 0; i < hand.size(); i++) {
//            if (value < 21) {
//
//
//                value = value + hand.get(i).getCardBlackJackValue();
//
//            } else if ((value > 21)) {
//
//                if (hand.get(i).getCardName().equalsIgnoreCase("Ace"))
//
//
//                   hand.get(i).setBlackJackValue(1);
//
//                value = value + hand.get(i).getCardBlackJackValue();
//            }
//
//
//
//
//        }
//        return null;
//    }



//    public int getGeneralValue(ArrayList<Card> hand) {
//        int value = 0;
//
//        for (int i = 0; i < hand.size(); i++) {
//
//
//            value = value + hand.get(i).getCardGeneralValue();
//
//        }
//        return value;
//    }


        public int getSize(ArrayList<Card> hand)
    {

        return hand.size();


        }



    public void clearHand() {

        {
            hand.clear();
        }


    }

    @Override
    public String toString(){
        return ("Hand is having Value" + value);

}




}
