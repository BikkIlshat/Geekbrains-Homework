package com.company.lesson8;

public class Cat implements Marathon {

    @Override
    public void run() {
        System.out.println("Кошка пробежала ");
    }

    @Override
    public void jump() {
        System.out.println("Кошка перепрыгнула ");
    }
}
