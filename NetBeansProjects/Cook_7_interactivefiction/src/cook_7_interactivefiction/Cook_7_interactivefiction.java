/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_7_interactivefiction;
import java.util.Scanner;

public class Cook_7_interactivefiction {
    static Scanner scan = new Scanner(System.in);
    static String answer;
    static boolean playAgain = false;
    
    public static void intro(){
        System.out.println("This is a game not for the weak-minded. Be warned");
        System.out.println("");
    }
    
    public static void rules() {
        System.out.println("Some basic rules:");
        System.out.println("");
        System.out.println("First, there is no punctuation needed.");
        System.out.println("Second, this game CAN be solved without knowing anything, it just takes patience, creative thinking, and a little bit of rage.");
        System.out.println("Third, mistakes will loop you back through the starting scene. Yes, you have to restart every time you answer wrong, however far you may have gotten.");
        System.out.println("");
    }
    
    public static void main(String[] args) {
        playAgain = true;
        while (playAgain) {
           intro();
           rules();
           game();
       }
    }
    public static void game() {
        
        System.out.println("You wake up in a strange room");
        answer = scan.nextLine().toLowerCase();
        if (answer.contains("why does") & answer.contains("smell")){
            System.out.println("You stand up");
            answer = scan.nextLine().toLowerCase();
            if(answer.contains("turn on") & answer.contains("lights")) {
                System.out.println("You find a light switch and turn it on");
                answer = scan.nextLine().toLowerCase();
                if(answer.contains("look")) {
                    System.out.println("You see a table, your bed, and a giant monster with his hands covering his eyes");
                    answer = scan.nextLine().toLowerCase();
                    if (answer.contains("hi")) {
                        System.out.println("You say Hi to the monster, and he offers you breakfast");
                        answer = scan.nextLine().toLowerCase();
                        if (answer.contains("eat")) {
                            System.out.println("You eat, and then give him your dishes. He moves to the side");
                            answer = scan.nextLine().toLowerCase();
                            if (answer.contains("leave")) {
                                System.out.println("You leave the room and enter a long hallway");
                                answer = scan.nextLine().toLowerCase();
                                if(answer.contains("look")) {
                                    System.out.println("You see a witch on a broom coming right at you. You leap and fall down the stairs, landing on your knees.");
                                    if (){
                                        
                                    }
                                } else {
                                    System.out.println("You see the flying broomstick just a bit too late. A loud crash of glass on wooden floooring is the last thing you remember");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    game();
                                }
                            } else {
                                System.out.println("You stand there, lose all your energy, and then pass out. So close");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                System.out.println("");
                                game();
                            }
                        } else {
                            System.out.println("You don't eat, so the monster knocks you out for being rude");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            System.out.println("");
                            game();
                        }
                    }else if (answer.contains("sleep")) {
                        System.out.println("You can't go to Sleep anymore, so you sit there ans stare until the monster knocks you out");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        game();
                    } else {
                        System.out.println("You sit there and stare, until the monster knocks you out");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("");
                        game();
                    }
                } else if(answer.contains("sleep")) {
                    System.out.println("You turn off the light, lay down, and fall back asleep");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    game();
                } else {
                    System.out.println("You stare at the wall, giving the monster the time it needs to recover and attack you");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("");
                    game();
                }
            } else if(answer.contains("sleep")) {
                System.out.println("You fall back aSleep");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                game();
            } else {
                System.out.println("You don't see the monster until he is upon you.");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                System.out.println("");
                game();
            }
        } else if(answer.contains("sleep")) {
            System.out.println("You fall back asleep");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            game();
        } else {
            System.out.println("You don't notice the smell and pass out");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            game();
        }
    }
}