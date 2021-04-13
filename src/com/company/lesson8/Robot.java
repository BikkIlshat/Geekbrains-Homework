package com.company.lesson8;

public class Robot implements Marathon {


    @Override
    public void run() {
        System.out.println("Робот пробежал ");
    }

    @Override
    public void jump() {
        System.out.println("Робот перепрыгнул ");
    }
}
