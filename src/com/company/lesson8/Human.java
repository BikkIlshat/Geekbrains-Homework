package com.company.lesson8;

public class Human implements Marathon {

    @Override
    public void run() {
        System.out.println("Человек пробежал ");
    }

    @Override
    public void jump() {
        System.out.println("Человек перепрыгнул ");
    }
}
