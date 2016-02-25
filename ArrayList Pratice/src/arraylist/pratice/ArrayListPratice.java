/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.pratice;
 import java.util.Arrays;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author Ramborux
 */
public class ArrayListPratice {
public static void main(String[] args) {
    char[][] map = new char[9][9];
        map[0][0] = 'x';
map[0][8] = 'x';
map[1][1] = 'x';
map[1][7] = 'x';
map[2][2] = 'x';
map[2][6] = 'x';
map[3][3] = 'x';
map[3][5] = 'x';
map[4][4] = 'x';
map[5][5] = 'x';
map[5][3] = 'x';
map[6][6] = 'x';
map[6][2] = 'x';
map[7][7] = 'x';
map[7][1] = 'x';
map[8][8] = 'x';
map[8][0] = 'x';
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
    }
}
