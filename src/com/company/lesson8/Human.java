package com.company.lesson8;

public class Human implements Marathon {

    @Override
    public void run() {
        int maxRun = 150;
        System.out.println("Человек пробежал ");
    }

    @Override
    public void jump() {
        int maxJump = 2;
        System.out.println("Человек перепрыгнул ");
    }
}
