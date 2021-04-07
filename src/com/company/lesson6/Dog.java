package com.company.lesson6;

public class Dog extends Animal{
    public static int countDog;
    public Dog(String name, int run, int swim) {
        super(name, run, swim);
        countDog++;

    }

    @Override
    public void run() {
        int maxRun = 500;
        if ((getRun() >= 0) && (getRun() <= maxRun)) System.out.println(getName() + " пробежал " + getRun() + " метров");
        else System.out.println( "Ограничение на действие");
    }

    @Override
    public void swim() {
        int maxSwim = 10;
        if ((getSwim() >= 0) && (getSwim() <= maxSwim)) System.out.println(getName() + " проплыл " + getSwim() + " метров");
        else System.out.println( "Ограничение на действие");

    }

    public static void getCountDog() {

        System.out.println(" Собак " +  countDog);
    }
}
