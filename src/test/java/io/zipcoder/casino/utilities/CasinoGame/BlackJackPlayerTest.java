package io.zipcoder.casino.utilities.CasinoGame;

import org.junit.Assert;
import org.junit.Test;

public class BlackJackPlayerTest {

    @Test

    public void blackJackPlayerTest(){
      //Given
        Integer expectedBalance =40;
        Player player = new Player(expectedBalance);


        //When
        Integer actualBalance = player.getBalance();

        //Then

        Assert.assertEquals(expectedBalance,actualBalance);



    }
}
