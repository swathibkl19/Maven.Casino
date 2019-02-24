package io.zipcoder.casino.utilities.CasinoGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EnumSet;

public class CrapsBetTreeTest {



    CrapsBetTree testBetTree = new CrapsBetTree();
    Integer expectedBet;
    Integer actualBet;
    CrapsBets testBet;
    Integer expectedPayout;
    Integer actualPayout;

//    @Test
//    public void constructorTest1(){
//         expectedBet = 0;
//         actualBet = testBetTree.betMap.get(CrapsBets.PASSLINE.name());
//
//        Assert.assertEquals(expectedBet,actualBet);
//    }
//
//    @Test
//    public void constructorTest2(){
//         expectedBet = 0;
//         actualBet = testBetTree.betMap.get(CrapsBets.BOXCAR.name());
//
//        Assert.assertEquals(expectedBet,actualBet);
//    }
//
//    @Test
//    public void addBetTest(){
//         expectedBet = 50;
//         testBet = CrapsBets.PASSLINE;
//         testBetTree.betMap.put(testBet.name(),expectedBet);
//         actualBet = testBetTree.betMap.get(testBet);
//         Assert.assertEquals(expectedBet,actualBet);
//
//    }
//
//    @Test
//    public void getPayoutTest(){
//        expectedBet = 50;
//        expectedPayout = 100;
//        testBet = CrapsBets.PASSLINE;
//        testBetTree.betMap.put(testBet.name(),expectedBet);
//        actualPayout = testBet.getPayout(testBetTree.betMap.get(testBet));
//        Assert.assertEquals(expectedPayout,actualPayout);
//    }

    @Test
    public void enumTest(){
        String[] betStringArray = EnumSet.allOf(CrapsBets.class).toString().split(", ");
        for(String thing : betStringArray){
            thing = thing.replace("[","");
            thing = thing.replace("]","");
        System.out.println(thing);
        }
    }
}
