package io.zipcoder.casino.utilities.CasinoGame;


import java.util.ArrayList;

public class BlackJack extends CardGame implements GamblingGame {

    Console console = new Console ();
    BlackJackPlayer bjplayer = new BlackJackPlayer();
    Player player = new Player();
    Deck dk = new Deck();
    Hand hd = new Hand(new ArrayList<Card>());
    Player dealer = new Player();




    public java.util.ArrayList<Integer> betList;


   // public java.util.ArrayList<BlackJackPlayer> blackJackPlayerList;

    public BlackJack(BlackJackPlayer blackJackPlayer) {

    }


    public void play() {

        console.println("Dealing the cards... %n");
        //Deal two cards to each player one by one
        for (int i = 0; i < 2; i++) {


            }











    }

    public Integer giveWinnings() {
        Integer winning =0;

       if (bjplayer.balance>player.balance){

           winning = 2*getBet();


       }


        return winning;

    }

    public Integer getBet() {




       Integer bet = console.getIntegerInput("How much you want to Bet ?");

        betList.add(bet);



        return bet;


    }

    public Integer getScore() {



        return null;
    }
}
