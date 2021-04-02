package com.company.lesson4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static char[][] map;
    public  static final int SIZE = 3;
    public  static final int  DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_Y = 'Y';

    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();

            if (checkWin0(DOT_X)) {
                System.out.println(" Победил человек! ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin0(DOT_Y)) {
                System.out.println(" Победил компьютер! ");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья! ");
                break;
            }

        }
        System.out.println("Игра закончена! ");
        sc.close();
    }


    public static boolean checkWin0(char symb) {
        int diagonal1, diagonal2, horizontal, vertical;
        for (int i = 0; i < map.length; i++) {
            horizontal = 0; vertical = 0;
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == symb) {
                    horizontal++;
                }
                if (map[j][i] == symb) {
                    vertical++;
                }
            }
            if (horizontal == map.length || vertical == map.length) {
                return true;
            }
        }
         diagonal1 = 0; diagonal2 = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i][i] == symb) {
                diagonal1++;
            }
            if (map[i][map.length - i - 1] == symb) {
                diagonal2++;
            }
        }
        return diagonal1 == map.length || diagonal2 == map.length;

//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
    }

    public static boolean isMapFull () {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isNotCellValid(x, y));

        System.out.println("Компьютер сделал ход в току " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_Y;
    }



    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (isNotCellValid(x, y));

        map[y][x] = DOT_X;
    }

    public static boolean isNotCellValid(int x, int y) {
        if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
            return false;
        }

        return map[y][x] == DOT_EMPTY;
    }

    public static void initMap() {
        map = new char [SIZE][SIZE];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
}
