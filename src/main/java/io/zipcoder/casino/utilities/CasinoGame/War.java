package io.zipcoder.casino.utilities.CasinoGame;

import java.util.Stack;

public class War extends CardGame implements Game {
    public java.util.ArrayList<WarPlayer> warPlayerList;

    public War(PlayerList playerList) {
    }

    public void play() {
    }

    public Hand getPlayer1Hand() {
        Deck warPlayerDeck = new Deck();
        Hand player1Hand = new Hand();

        warPlayerDeck.buildRegularDeck();
        for (int i = 0; i < 26; i++) {
            Card card = warPlayerDeck.regularDeck.pop();
            player1Hand.addCard(card);
        }
        return player1Hand;
    }

    public Hand getPlayer2Hand() {
        Deck warPlayerDeck = new Deck();
        Hand player2Hand = new Hand();

        warPlayerDeck.buildRegularDeck();
        for (int i = 26; i <= 52; i++) {
                Card card = warPlayerDeck.regularDeck.pop();
                player2Hand.addCard(card);
            }
        return player2Hand;
    }




    public Integer getScore() {
        return null;
    }

    public Integer giveScore() {
        return null;
    }
}
