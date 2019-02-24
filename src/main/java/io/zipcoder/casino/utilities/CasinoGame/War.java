package io.zipcoder.casino.utilities.CasinoGame;

import java.util.Stack;

public class War extends CardGame implements Game {
    public java.util.ArrayList<WarPlayer> warPlayerList;

    public War(PlayerList playerList) {
    }

    public void play() {
    }

    public Deck getPlayerDeck(){
        Deck warPlayerDeck = new Deck();
        warPlayerDeck.buildRegularDeck();
        for (int i = 0; i < 26; i++){
//            warPlayerDeck.pop();
        }

        return null;
    }

    public Integer getScore() {
        return null;
    }

    public Integer giveScore() {
        return null;
    }
}
