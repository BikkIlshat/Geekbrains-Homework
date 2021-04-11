package com.company.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }


    void decreaseFood(int n) {
        food -= n;
        if (food < 0) {
            food = 0;
        }
    }

    void increaseFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }


     int getFood() {
        return food;
    }
}
