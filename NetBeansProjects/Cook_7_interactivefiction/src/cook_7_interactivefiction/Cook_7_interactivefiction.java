package cook_7_interactivefiction;

import java.util.Scanner;

public class Cook_7_interactivefiction {

    static Scanner scan = new Scanner(System.in);
    static String answer;
    static boolean playAgain = false;
    static String name;

    public static void intro() {
        System.out.println("This is a game not for the weak-minded. Be warned");
        System.out.println("");
    } //Intro...simple enough

    public static void rules() {
        System.out.println("Some basic rules:");
        System.out.println("");
        System.out.println("First, there is no punctuation needed.");
        System.out.println("Second, this game CAN be solved without knowing anything, it just takes patience, creative thinking, and a little bit of rage.");
        System.out.println("Third, mistakes will loop you back through the starting scene. Yes, you have to restart every time you answer wrong, however far you may have gotten.");
        System.out.println("");
    } //Just some rules to help you understand how the game is played

    public static void main(String[] args) {
        name();
        playAgain = true;
        while (playAgain) {
            intro();
            rules();
            game();
        } //while loop to allow you to keep playing the game, assuming you win, of course
    }

    public static void game() {

        System.out.println("You wake up in a strange room"); //first choice (scenario)
        answer = scan.nextLine().toLowerCase();
        if (answer.contains("why does") & answer.contains("smell")) {
            System.out.println("You stand up"); //second choice
            answer = scan.nextLine().toLowerCase();
            if (answer.contains("turn on") & answer.contains("lights")) {
                System.out.println("You find a light switch and turn it on"); //third choice
                answer = scan.nextLine().toLowerCase();
                if (answer.contains("look")) {
                    System.out.println("You see a table, your bed, and a giant monster with his hands covering his eyes"); //fourth choice
                    answer = scan.nextLine().toLowerCase();
                    if (answer.contains("hi")) {
                        System.out.println("You say Hi to the monster, and he offers you breakfast"); //fifth choice
                        answer = scan.nextLine().toLowerCase();
                        if (answer.contains("eat")) {
                            System.out.println("You eat, and then give him your dishes. He moves to the side"); //sixth choice
                            answer = scan.nextLine().toLowerCase();
                            if (answer.contains("leave")) {
                                System.out.println("You leave the room and enter a long hallway"); //seventh choice
                                answer = scan.nextLine().toLowerCase();
                                if (answer.contains("look")) {
                                    System.out.println("You see a witch on a broom coming right at you. You leap and fall down the stairs, landing on your knees."); //eighth choice
                                    answer = scan.nextLine().toLowerCase();
                                    if (answer.contains("wait")) {
                                        System.out.println("You wait, and a boulder rolls past"); //ninth choice
                                        answer = scan.nextLine().toLowerCase();
                                        if (answer.contains("walk") | answer.contains("forward")) {
                                            System.out.println("Being cautious, you walk forware, right up to the door. It opens"); //tenth choice
                                            answer = scan.nextLine().toLowerCase();
                                            if (answer.contains("wait")) {
                                                
                                            } else { //bad choice (10)
                                                System.out.println("You should wait your turn next time. The motorcycle coming in hits you, hard");
                                                bad();
                                            }
                                        } else { //bad choice (9)
                                            System.out.println("Standing there like a fool, you get zapped into stone. The end (or so you think)");
                                            bad();
                                        }
                                    } else { //bad choice (8)
                                        System.out.println("You walk forward, and are hit by the giant boulder");
                                        bad();
                                    }
                                } else { //bad choice (7)
                                    System.out.println("You see the flying broomstick just a bit too late. A loud crash of glass on wooden floooring is the last thing you remember");
                                    bad();
                                }
                            } else { //bad choice (6)
                                System.out.println("You stand there, lose all your energy, and then pass out. So close");
                                bad();
                            }
                        } else { //bad choice (5)
                            System.out.println("You don't eat, so the monster knocks you out for being rude");
                            bad();
                        }
                    } else if (answer.contains("sleep")) { //useless choice (4)
                        System.out.println("You can't go to Sleep anymore, so you sit there ans stare until the monster knocks you out");
                        bad();
                    } else { //bad choice (4)
                        System.out.println("You sit there and stare, until the monster knocks you out");
                        bad();
                    }
                } else if (answer.contains("sleep")) { //useless choice (3)
                    System.out.println("You turn off the light, lay down, and fall back asleep");
                    bad();
                } else { //bad choice (3)
                    System.out.println("You stare at the wall, giving the monster the time it needs to recover and attack you");
                    bad();
                }
            } else if (answer.contains("sleep")) { //useless choice (2)
                System.out.println("You fall back aSleep");
                bad();
            } else { //bad choice (2)
                System.out.println("You don't see the monster until he is upon you.");
                bad();
            }
        } else if (answer.contains("sleep")) {
            System.out.println("You fall back asleep"); //useless choice (1)
            bad();
        } else { //bad choice (1)
            System.out.println("You don't notice the smell and pass out");
            bad();
        }
    }

    public static void clear() { //to save lines and give me an extra method :D
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }

    public static void name() { //I call it but it is really just a physcological trick to make them think that if I care enough to get their name then I care enough to make a quality game for them and they should play it.
        System.out.println("What is your name?");
        name = scan.nextLine();
    }

    public static void bad() {
        clear();
        game();
    }
}
