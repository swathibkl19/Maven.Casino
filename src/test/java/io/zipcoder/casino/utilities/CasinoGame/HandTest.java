package io.zipcoder.casino.utilities.CasinoGame;

import io.zipcoder.casino.utilities.CasinoGame.Card;
import io.zipcoder.casino.utilities.CasinoGame.Hand;
import org.junit.Assert;
import org.junit.Test;
import java.lang.String;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class HandTest {

    @Test
    public void getBlackJackValueTest() {

        Card cd1 = new Card("King","Spades",10,13);

        Card cd2 = new Card("Jack","Spades",10,13);
        Card cd3 = new Card("Queen","Spades",10,13);


        java.util.ArrayList<Card> mylist = new ArrayList<Card>();
        Hand myhand = new Hand(mylist);

        mylist.add(cd1);
        mylist.add(cd2);
        mylist.add(cd3);

        int expectedvalue = 30;
        int actualvalue = myhand.getBlackJackValue(mylist);

       Assert.assertEquals(expectedvalue, actualvalue);


    }

    @Test
    public void getgeneralValueValueTest() {

        Card cd1 = new Card("King","Spades",10,13);

        Card cd2 = new Card("Jack","Spades",10,13);
        Card cd3 = new Card("Queen","Spades",10,13);


        java.util.ArrayList<Card> mylist = new ArrayList<Card>();
        Hand myhand = new Hand(mylist);

        mylist.add(cd1);
        mylist.add(cd2);
        mylist.add(cd3);

        int expectedvalue = 39;
        int actualvalue = myhand.getGeneralValue(mylist);

        Assert.assertEquals(expectedvalue, actualvalue);


    }



    @Test
    public void getBlackJackValuewithAceTest() {

        Card cd1 = new Card("Ace","Spades",11,13);

        Card cd2 = new Card("Jack","Spades",10,13);
        Card cd3 = new Card("Queen","Spades",10,13);


        java.util.ArrayList<Card> mylist = new ArrayList<Card>();
        Hand myhand = new Hand(mylist);

        mylist.add(cd1);
        mylist.add(cd2);
        mylist.add(cd3);

        int expectedvalue = 21;
        int actualvalue = myhand.getBlackJackValue(mylist);

        Assert.assertEquals(expectedvalue, actualvalue);


    }






    @Test
    public void getSizeTest() {



        Card cd1 = new Card("King","Spades",10,13);

        Card cd2 = new Card("King","Spades",10,13);
        Card cd3 = new Card("King","Spades",10,13);



        java.util.ArrayList<Card> mylist = new ArrayList<Card>();
        Hand myhand = new Hand(mylist);

                mylist.add(cd1);
                mylist.add(cd2);
                mylist.add(cd3);

        int expectedsize = 3;
        int actualvaluesize = myhand.getSize(mylist);

        Assert.assertEquals(expectedsize, actualvaluesize);


    }

    @Test
    public void clearTest() {



        Card cd1 = new Card("King","Spades",10,13);

        Card cd2 = new Card("King","Spades",10,13);
        Card cd3 = new Card("King","Spades",10,13);


        java.util.ArrayList<Card> mylist = new ArrayList<Card>();

        mylist.add(cd1);
        mylist.add(cd2);
        mylist.add(cd3);

        Hand myhand = new Hand(mylist);
        int expectedsize = 3;
        int actualvaluesize = myhand.getSize(mylist);
        Assert.assertEquals(expectedsize, actualvaluesize);

        myhand.clear();
        int expectedsizeclear = 0;
        int actualvaluesizeclear = myhand.getSize(mylist);
        Assert.assertEquals(expectedsizeclear, actualvaluesizeclear);



    }




}