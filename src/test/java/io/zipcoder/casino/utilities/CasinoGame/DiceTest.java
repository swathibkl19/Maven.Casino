package io.zipcoder.casino;

import io.zipcoder.casino.utilities.CasinoGame.Dice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

//    @Before
//    public void setup(){
//        Dice testDice = new Dice(2,6);
//    }

    @Test
    public void diceConstructorTest(){
        //Given
        Integer expectedSize = 6;
        Integer expectedNumberOfDice = 2;

        //When
        Dice testDice = new Dice(expectedNumberOfDice,expectedSize);
        Integer actualDice1 = testDice.getValue(0);
        Integer actualDice2 = testDice.getValue(1);
        //Then
        Assert.assertEquals(expectedNumberOfDice,testDice);

    }
}
