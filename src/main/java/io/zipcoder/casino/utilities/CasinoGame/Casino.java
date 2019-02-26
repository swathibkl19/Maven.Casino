//package io.zipcoder.casino.utilities.CasinoGame;
//import com.sun.tools.javah.Util;
//
//import java.io.InputStream;
//import java.io.PrintStream;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Casino {
//    public Console display;
//
//
//
//    public static void main(String[] args) {
//
//        Console console = new Console(System.in, System.out);
//
//        String continueString="";
//
//        while(!"quit".equals(continueString)) {
//
//            console.println("Welcome to Group 4 Casino");
//
//            console.println("Choose a game you want to play");
//
//            String userInput = console.getStringInput(Arrays.toString(GameEnum.values()));
//
//            GameEnum enumeration = GameEnum.getValueOf(userInput);
//
//            Game game = enumeration.play();
//
//            game.play();
//
//            continueString = console.getStringInput("Would you like to continue?");
//
//        }
//
//    }
//        }
//
//
//
//
