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
        realNumber = why.nextInt(10);
        System.out.println("What is your name?");
        name = scan.nextLine();
        System.out.println("Guess a number from 1 to 10");
        maybeNumber = scan.nextInt();
        if(maybeNumber != realNumber) {
            System.out.println(name + ", you are wrong. You guessed " + maybeNumber + ", but the real number is " + realNumber);
        } else if(maybeNumber == realNumber) {
            System.out.println(name + ", you are right! You guessed " + maybeNumber + ", and the real number is also " + realNumber);
        }
    }
    
}
