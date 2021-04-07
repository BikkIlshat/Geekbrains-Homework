package com.company.lesson6;

public abstract class Animal {
    public static int count;
    public Animal animal;
    private String name ;
    private int run;
    private int swim;

    public Animal(String name, int run, int swim) {

        this.name = name;
        this.run = run;
        this.swim = swim;
        count++;
    }


    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public  abstract void run();

    public  abstract void swim();


    public static void getCountAnimals() {

        System.out.println(" Животных " +  count);
    }

}

