package io.zipcoder.casino.utilities.CasinoGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dice {
    public java.util.Random random;
    private Random diceVal = new Random();
    private List<Integer> diceValueList = new ArrayList<>();

    public Dice(Integer numberOfDice, Integer diceSize) {
        for(int i = 0; i < numberOfDice; i++){
            diceValueList.add(diceSize);
        }
    }

    public Dice() {
        this(2,6);
    }

    public Integer getValue(Integer diceNumber) {

        return diceValueList.get(diceNumber);
    }

    public void rollDice() {
        for (int i = 0; i < diceValueList.size(); i++){
            diceValueList.set(i,diceVal.nextInt(5)+1);
        }
    }
}


