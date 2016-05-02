/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.pratice;

import java.util.Scanner;

/**
 *
 * @author Ramborux
 */
public class ArrayListPratice {

    static Scanner scan = new Scanner(System.in);
    static Scanner scan1 = new Scanner(System.in);
    static int x;
    static int y;
    static String quit;
    static boolean notQuit = true;

    public static void main(String[] args) {
        char[][] map = new char[10][10];
        while (notQuit) {
            System.out.println("Give an X value 0-9");
            x = scan.nextInt();
            System.out.println("Give a Y value 0-9");
            y = scan.nextInt();

            if (map[x][y] != 'x') {
                map[x][y] = 'x';
            } else {
                System.out.println("That place has been taken.");
                
            }

            for (int i = 0; i <= map[0].length - 1; i++) {
                for (int j = 0; j <= map[1].length - 1; j++) {
                    if (j < map[1].length - 1) {
                        if (map[i][j] != 'x') {
                            System.out.print(".");
                        } else {
                            System.out.print(map[i][j]);
                        }
                    } else {
                        if (map[i][j] != 'x') {
                            System.out.println(".");
                        } else {
                            System.out.println(map[i][j]);
                        }
                    }
                }
            }
            System.out.println("Quit? (y/n)");
            quit = scan1.next();
            if (quit.equals("y")) {
                notQuit = false;
                }
        }
    }

      
    }

