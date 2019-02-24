package io.zipcoder.casino.utilities.CasinoGame;

import java.util.ArrayList;
import java.util.TreeMap;

public class Craps extends DiceGame implements GamblingGame {
    private java.util.ArrayList<Integer> betList;
    private Dice crapsDice;
    private CrapsPlayer crapsPlayer;
    CrapsBetTree betTree = new CrapsBetTree();
//    private java.util.ArrayList<CrapsPlayer> crapsPlayerList;

    public Craps(CrapsPlayer crapsPlayer) {
        this.crapsPlayer = crapsPlayer;
    }

    public void play() {
    }

    public Integer getScore() {
        return null;
    }

    public void getBet(Integer bet) {

    }

    public Integer giveWinnings() {
        return null;
    }
}
