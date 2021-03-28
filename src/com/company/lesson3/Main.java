package com.company.lesson3;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void main(String[] args) {
        theGame ();
    }

    public static void theGame() {
        do {
            int tryCount = 0;
            int maxTryCount = 3;
            int answer = random.nextInt(10);

            System.out.print("Введите число  от 0 до 9");

            while (tryCount < maxTryCount ) {
                tryCount++;
                int userAnswer = scanner.nextInt();
                if (userAnswer == answer) {
                    System.out.println("Поздравляю вы угадали, правильный ответ " + answer + "!");
                } else if (tryCount >= maxTryCount) {
                    System.out.println("Вы проиграли правльный ответ " + answer);
                } else if (userAnswer > answer) {
                    System.out.println("Вы ввели слишком большое число,попробуйте еще раз.");
                } else if (userAnswer < answer) {
                    System.out.println("Вы ввели слишком маленькое число,попробуйте еще раз.");
                }
            }       System.out.println("Повторить игру еще раз? Y/N" );

       } while (scanner.next().equals("Y"));

        scanner.close();
    }

}

