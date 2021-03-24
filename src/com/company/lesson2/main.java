package com.company.lesson2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        invertArray ( );
    }

    public static void invertArray ()  {
        int[] arr = {1, 0, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr.length; i++ ) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(i + " " + arr[i]);

        }

    }



}
