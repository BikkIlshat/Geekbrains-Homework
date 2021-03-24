package com.company.lesson1;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.PublicKey;
import java.sql.ResultSet;

public class Main {

   public static void main(String[] args) {
       System.out.println("Задание 2.");
        byte a = 27;
        short b = 859;
        int c = 1351;
        long d = 12354795l;
        float e = 15.3f;
        double f = 15.3;
        char g = 'C';
        boolean boolT = true;
        boolean boolF = false;

        System.out.println("Значение переменной byte = " + a);
        System.out.println("Значение переменной short = " + b);
        System.out.println("Значение переменной int = " + c);
        System.out.println("Значение переменной long = " + d);
        System.out.println("Значение переменной float = " + e);
        System.out.println("Значение переменной double = " + f);
        System.out.println("Значение переменной char = " + g);
        System.out.println("Значение переменной boolean = " + boolT);
        System.out.println("Значение переменной boolean = " + boolF);

       System.out.println("Задание 3.");
       float sum = calculate(92.15f, 75.13f, 40.12f, 2.22f);

       System.out.println("Задание 4.");
       boolean check1 = task10and20 (10, 10);

       System.out.println("Задание 5.");
       isPositiveOrNegative(15);

       System.out.println("Задание 6.");
       boolean check2 = isNegative(-153);

       System.out.println("Задание 7.");
        greetings("Ильшат");

       System.out.println("Задание 8.");
       isleapYear(2021);
   }



    public static float calculate(float a, float b, float c, float d) {
        float calculate = a * (b + (c / d));
        System.out.println(" Ответ " + calculate + " значение типа float");
        return calculate;

    }

// Задание 4.

    public static boolean task10and20(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 20) {
            boolean check1 = true;
            System.out.println(" Значение числа находится  в диапазоне  от 10 до 20 ");
            return check1;
        } else {
            boolean check1 = false;
            System.out.println("Значение числа находится  в не диапазоне чисел от 10 до 20 ");
            return check1;
        }

    }
// Задание 5
    public static void isPositiveOrNegative(int x) {

        if (x >= 0) {
            System.out.println("Число " + x + " положительное");
        } else {
            System.out.println("Число " + x + " отрицательное");
        }
    }

// Задание 6

    public static boolean isNegative(int x) {
        if (x < 0) {
            boolean check2 = true;
            System.out.println(" Число " + x + " отрицательное значение true");
            return check2;
        } else {
            boolean check2 = false;
            System.out.println(" Число " + x + " положительное значение false");
            return check2;
        }
    }

// Задание 7


        public static void greetings(String name) {
            System.out.println("Привет " + name + "!");
        }


// Задание 8


    public static void isleapYear(int x) {

        if ((x % 4 == 0 && x % 100 != 0) || (x % 4 == 0 && x % 400 == 0)) {
            System.out.println(" Год " + x + " Високосный");
        } else {
            System.out.println(" Год " + x + " Не високосный");
        }
    }



}


