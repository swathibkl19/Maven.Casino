package io.zipcoder.casino.utilities.CasinoGame;

import org.junit.Assert;
import org.junit.Test;

public class BlackJackPlayerTest {

    @Test
    public void blackJackPlayerTest(){
      //Given
        String expectedName ="abcd";
        Integer expectedBalance =40;
        BlackJackPlayer blackJackPlayer = new BlackJackPlayer(expectedName,expectedBalance);


        //When
        String actualName = blackJackPlayer.getName();
        Integer actualBalance = blackJackPlayer.getBalance();

        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedBalance,actualBalance);


    }
    @Test
    public void placeBetTest(){


        //Given
        //String expectedName ="abcd";
        //Integer expectedBalance =960;
        Integer betValue = 50;
        Player myplayer = new Player ("abcd",100);

       BlackJackPlayer blackJackPlayer = new BlackJackPlayer(myplayer);

       //When
      blackJackPlayer.placeBet(betValue);
      Integer remainingBalance = myplayer.getBalance()

        Integer actualBalance = (blackJackPlayer.balance - betValue);

        //Then

        Assert.assertEquals(remainingBalance,actualBalance);

    }

    @Test
    public void receiveWinningsTest(){

    }
}

