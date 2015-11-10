/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_7_interactivefiction;
import java.util.Scanner;

public class Cook_7_InteractiveFiction {
    static Scanner scan = new Scanner(System.in);
    static String answer;
    
    public static void intro(){
        System.out.println("This is a game not for the weak-minded. Be warned");
        }
    
    public static void main(String[] args) {
       intro();
       game();
    }
    public static void game() {
        System.out.println("You wake up in a strange room");
        answer = scan.next().toLowerCase();
        if (answer.contains("Why does it smell?")){
            System.out.println("You stand up");
            answer = scan.next().toLowerCase();
            if(answer.contains("Turn on the lights")) {
                System.out.println("You find a light switch and turn it on");
                answer = scan.next().toLowerCase();
                if(answer.contains("Look around")) {
                    System.out.println("You see a table, your bed, and a giant monster with his hands covering his hands covering his eyes");
                    answer = scan.next().toLowerCase();
                    if (answer.contains("Hi")) {
                        
                    }else if (answer.contains("Sleep")) {
                        System.out.println("You can't go to sleep anymore, so you sit there ans stare until the monster knocks you out");
                        game();
                    } else {
                        System.out.println("You sit there and stare, until the monster knocks you out");
                        game();
                    }
                } else if(answer.contains("Sleep")) {
                    System.out.println("You turn off the light, lay down, and fall back asleep");
                    game();
                } else {
                    System.out.println("You stare at the wall, giving the monster the time it needs to recover and attack you");
                    game();
                }
            } else if(answer.contains("Sleep")) {
                System.out.println("You fall back asleep");
                game();
            } else {
                System.out.println("You don't see the monster until he is upon you.");
                game();
            }
        } else if(answer.contains("Sleep")) {
            System.out.println("You fall back asleep");
            game();
        } else {
            System.out.println("You don't notice the smell and pass out");
            game();
        }
    }
}
