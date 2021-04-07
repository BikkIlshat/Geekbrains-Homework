package com.company.lesson6;



public class Cat extends Animal {
    public static int countCat;
    public Cat(String name, int run, int swim) {
        super(name, run, swim);
        countCat++;

    }


    @Override
    public void run() {
        int maxRun = 200;
        if ((getRun() >= 0) && (getRun() <= maxRun)) System.out.println(getName() + " пробежал " + getRun() + " метров");
        else System.out.println( "Ограничение на действие");

    }


    @Override
    public void swim() {
        System.out.println(getName() + " не любит воду");

    }
    public static void getCounterCat() {

        System.out.println(" Котов " +  countCat);
    }

}
