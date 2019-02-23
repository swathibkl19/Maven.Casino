package io.zipcoder.casino;

import io.zipcoder.casino.utilities.CasinoGame.Card;
import io.zipcoder.casino.utilities.CasinoGame.Hand;
import org.junit.Assert;
import org.junit.Test;
import java.lang.String;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class HandTest {

    @Test
    public void getValueTest() {



        Card cd1 = new Card("Jack",  "Heart");
        Card cd2 = new Card("Two",  "Diamond");
        Card cd3 = new Card("Seven",  "Heart");


        java.util.ArrayList<Card> mylist = new ArrayList<Card>();
        Hand myhand = new Hand(mylist);

        mylist.add(cd1);
        mylist.add(cd2);
        mylist.add(cd3);

        int expectedsvalue = 19;
        //int actualvalue = myhand.getValue(mylist);

       // Assert.assertEquals(expectedsvalue, actualvalue);


    }






    @Test
    public void getSizeTest() {



        Card cd1 = new Card("Jack",  "Heart");
        Card cd2 = new Card("Two",  "Diamond");
        Card cd3 = new Card("Seven",  "Heart");


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



        Card cd1 = new Card("Jack",  "Heart");
        Card cd2 = new Card("Two",  "Diamond");
        Card cd3 = new Card("Seven",  "Heart");


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


   // @Override
   // @Test

   // public void toString() {

   // }
//}