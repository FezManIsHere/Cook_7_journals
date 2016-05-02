/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraygame;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Ramborux
 */
public class ArrayGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand1 = new Random();
        char[][] map = new char[21][21];
        int x = 10;
        int y = 10;
        int ex = rand1.nextInt(20);
        int ey = rand1.nextInt(20);
        int cx = rand1.nextInt(20);
        int cy = rand1.nextInt(20);
        int trapx = rand1.nextInt(20);
        int trapy = rand1.nextInt(20);
        int trap1x = rand1.nextInt(20);
        int trap1y = rand1.nextInt(20);
        String direction;
        boolean play = true;
        String player = x + "," + y;
        String trap1 = trapx + "," + trapy;
        String trap2 = trap1x + "," + trap1y;
        String chest = cx + "," + cy;
        String enemy = ex + "," + ey;
        while (player.equals(trap1) || player.equals(trap2) || player.equals(chest) || player.equals(enemy) || trap1.equals(trap2) || trap1.equals(chest) || trap1.equals(enemy) || trap2.equals(enemy) || trap2.equals(chest) || enemy.equals(chest)) {
            trapx = rand1.nextInt(20);
            trapy = rand1.nextInt(20);
            trap1x = rand1.nextInt(20);
            trap1y = rand1.nextInt(20);
            ex = rand1.nextInt(20);
            ey = rand1.nextInt(20);
            cx = rand1.nextInt(20);
            cy = rand1.nextInt(20);
        }
        while (play) {
            map[x][y] = '@';
            map[trapx][trapy] = '*';
            map[trap1x][trap1y] = '*';
            map[ex][ey] = 'E';
            map[cx][cy] = 'T';
            for (int i = 0; i <= map[0].length - 1; i++) {
                for (int j = 0; j <= map[1].length - 1; j++) {
                    if (j < map[1].length - 1) {
                        if (map[i][j] != '@' && map[i][j] != '*' && map[i][j] != 'E' && map[i][j] != 'T') {
                            System.out.print(". ");
                        } else {
                            System.out.print(map[i][j] + " ");
                        }
                    } else {
                        if (map[i][j] != 'x') {
                            System.out.println(". ");
                        } else {
                            System.out.println(map[i][j] + " ");
                        }
                    }
                }
            }
            System.out.println("Where do you want to move? (N/E/S/W/NE/NW/SE/SW) Or type Q to quit");
            direction = scan.next();

            if (direction.toUpperCase().contains("N")) {
                map[x][y] = '.';
                x -= 1;
            }
            if (direction.toUpperCase().contains("E")) {
                map[x][y] = '.';
                y += 1;
            }
            if (direction.toUpperCase().contains("S")) {
                map[x][y] = '.';
                x += 1;
            }
            if (direction.toUpperCase().contains("W")) {
                map[x][y] = '.';
                y -= 1;
            }
            if (direction.toUpperCase().contains("Q")) {
                play = false;
            }
            
            if (ex < x) {
                map[ex][ey] = '.';
                ex += 1;
            }   else if (ex > x) {
                map[ex][ey] = '.';
                ex -= 1;
            }
            if (ey < y) {
                map[ex][ey] = '.';
                ey += 1;
            }   else if (ey > y) {
                map[ex][ey] = '.';
                ey -= 1;
            }
            
            
            player = x + "," + y;
            trap1 = trapx + "," + trapy;
            trap2 = trap1x + "," + trap1y;
            chest = cx + "," + cy;
            enemy = ex + "," + ey;
            if (player.equals(trap1) || player.equals(trap2) || player.equals(enemy)) {
                System.out.println("You ran into a trap. GAME OVER");
                play = false;
            }
            if (player.equals(chest)) {
                System.out.println("You win. Congratulations!");
                play = false;
            }
        }
    }

}