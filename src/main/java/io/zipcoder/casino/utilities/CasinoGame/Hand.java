package io.zipcoder.casino.utilities.CasinoGame;
import java.util.ArrayList;


public class Hand {
    Card card;

    int value = 0;


   ArrayList<Card> hand = new ArrayList<>();

  // public Hand(ArrayList<Card> hand) {

    //   this.hand = hand;
   // }

    public int getBlackJackValue() {



       int i = 0;


       for (i = 0; i < hand.size(); i++) {
           if (value < 21) {


               value = value + hand.get(i).getBlackJackEnum().getBlackJackEnum();

           } else if ((value > 21)) {

               if (hand.get(i).getBlackJackEnum() == BlackJackEnum.ACE)


                   value = value - 10;
           }
       }


return value;



    }



    public int getGeneralValue() {
        Integer value = 0;

       for (int i = 0; i < hand.size(); i++) {


            value = value + hand.get(i).getDefaultEnum().getCardDefaultEnum();

        }
        return value;
    }


        public int getSize()
    {

        return hand.size();


        }



    public void clearHand() {


            hand.clear();
        }


        public void addCard(Card card){



                hand.add(card);


        }




    @Override
    public String toString(){
        return ("Hand is having Value" + value);

}




}
