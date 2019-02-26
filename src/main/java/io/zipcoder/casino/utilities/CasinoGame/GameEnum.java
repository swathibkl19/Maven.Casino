package io.zipcoder.casino.utilities.CasinoGame;
import java.util.function.Supplier;

public enum GameEnum {

   // BlackJack(BlackJack::new),
    //Craps(Craps::new),
    GoFish(GoFish::new);
    //Quit(System.exit(0),
    //War(War::new);

private  final Supplier<Game>supplier;

    GameEnum(Supplier<Game>supplier){
        this.supplier =supplier;
    }

    public  Game play(){
        return supplier.get().play();
    }


    public  Game createGame(){
        return supplier.get();
    }

    public static GameEnum getValueOf(String userInput){

        return valueOf(userInput);
    }
}


