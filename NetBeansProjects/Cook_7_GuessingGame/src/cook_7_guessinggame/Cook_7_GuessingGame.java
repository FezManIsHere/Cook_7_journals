/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_7_guessinggame;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Ramborux
 */
public class Cook_7_GuessingGame {

    /**
     * @param args the command line arguments
     */
    static int realNumber;
    static int maybeNumber;
    static String name;
    static Scanner scan = new Scanner(System.in);
    static Random why = new Random();
    
    public static void main(String[] args) {
        playGame();
        
    }
    private static void playGame() {
        int tries = 1;
        genNum();
        getName();
        getGuess();
        checkNumber(tries);
    }
    private static void genNum() {
        realNumber = why.nextInt(10);
    }
    private static void getName() {
    System.out.println("What is your name?");
        name = scan.nextLine();
}
    private static void getGuess() {
        System.out.println("Guess a number from 1 to 10");
        maybeNumber = scan.nextInt();
}
    private static void checkNumber(int tries) {
        if(tries < 3 & maybeNumber != realNumber) {
            System.out.println(name + ", you are wrong. You guessed " + maybeNumber + ". You have " + (3 - tries) + " tries left");
                tries++;
                getGuess();
                checkNumber(tries);
        }else if(maybeNumber == realNumber) {
            if (tries == 1) {
                System.out.println(name + ", you are right! You guessed " + maybeNumber + ", and that is the real number! It only took you " + (tries) + " try!");
            } else {
                System.out.println(name + ", you are right! You guessed " + maybeNumber + ", and that is the real number! It only took you " + (tries) + " tries!");
            }
        } 
        
        else {
            System.out.println("Sorry, but you are out of tries.");
        }
    }






}
