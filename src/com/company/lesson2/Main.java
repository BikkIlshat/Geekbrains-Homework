package com.company.lesson2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Задание 1");
        invertArray ( );

        System.out.println("Задание 2");
        fillArray();

        System.out.println("Задание 3");
        changeArray ();

        System.out.println("Задание 4");
        fillDiagonal ();
    }

    public static void invertArray ()  {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(i + " " + arr[i]);
        }
    }

    public static void fillArray () {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.println(i + " " + arr[i]);
        }

    }

    public static void changeArray () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.println(i + " " + arr[i]);

            }
        }
    }


    public static void fillDiagonal () {
        int[][] arr = new int [16][16];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++)
                if (i == j || j == arr[i].length - i - 1) {
                    arr[i][j] = 1;
                    System.out.print(" " + arr[i][j]);

                } else {
                    System.out.print(" " + arr[i][j]);

                } System.out.println();
        }
    }
}

