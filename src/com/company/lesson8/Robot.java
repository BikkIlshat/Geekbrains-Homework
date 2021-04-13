package com.company.lesson8;

public class Robot implements Marathon {


    @Override
    public void run() {
        int maxRun = 100;
        System.out.println("Робот пробежал ");
    }

    @Override
    public void jump() {
        int maxJump = 3;
        System.out.println("Робот перепрыгнул ");
    }

}
