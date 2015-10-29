package cook_7_guessinggame;
import java.util.Scanner;
import java.util.Random;

public class Cook_7_GuessingGame {

    static int realNumber;
    static int maybeNumber;
    static String again;
    static boolean playAgain = false;
    static String name;
    static Scanner scan = new Scanner(System.in);
    static Random why = new Random();
    
    public static void main(String[] args) {
        playAgain = true;
        getName();
        while (playAgain) {
            playGame();
        }
        }
    
    private static void playGame() {
        int tries = 1;
        genNum();
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
            if (maybeNumber < realNumber){System.out.println(name + ", you are wrong. You guessed too low. You have " + (3 - tries) + " tries left");
                tries++;
                getGuess();
                checkNumber(tries);
            }
            else if(maybeNumber > realNumber) {
                System.out.println(name + ", you are wrong. You guessed too high. You have " + (3 - tries) + " tries left");
                tries++;
                getGuess();
                checkNumber(tries);
            }
        }else if(maybeNumber == realNumber) {
            if (tries == 1) {
                System.out.println(name + ", you are right! You guessed " + maybeNumber + ", and that is the real number! It only took you " + (tries) + " try! Play again? (y/n)");
                playAgain = scan.next().equals("y");
            } 
            else {
                System.out.println(name + ", you are right! You guessed " + maybeNumber + ", and that is the real number! It only took you " + (tries) + " tries! Play again? (y/n)");
                playAgain = scan.next().equals("y");
            }
        } 
        
        else {
            System.out.println("Sorry, but you are out of tries. Play again? (y/n)");
            playAgain = scan.next().equals("y");
            }
            }
        
}