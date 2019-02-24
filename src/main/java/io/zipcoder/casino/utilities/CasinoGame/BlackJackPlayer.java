package io.zipcoder.casino.utilities.CasinoGame;
//import java.io.Console;
import java.io.InputStream;
import java.io.PrintStream;
public class BlackJackPlayer implements GamblingPlayer {

    Console console = new Console();
    String name;
    Integer balance;

 public BlackJackPlayer(Player player){

    name = player.getName();

    balance = player.getBalance();
}

    public void placeBet(Integer betValue) {

        Integer remainingbalance = balance- betValue;


    }

    public Integer recieveWinnings() {

        Integer integerInput = console.getIntegerInput("");

            return integerInput;
        }


}




