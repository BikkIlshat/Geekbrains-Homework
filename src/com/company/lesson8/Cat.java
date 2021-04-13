package com.company.lesson8;

public class Cat implements Marathon {

    @Override
    public void run() {
        int maxRun = 200;

        System.out.println("Кошка пробежала ");
    }

    @Override
    public void jump() {
        int maxJump = 3;
        System.out.println("Кошка перепрыгнула ");
    }
}
