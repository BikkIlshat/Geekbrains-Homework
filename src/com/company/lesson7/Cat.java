package com.company.lesson7;


public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate p) {

        if (p.getFood() >= appetite  && appetite >= 0) {
            p.decreaseFood(appetite);
            setSatiety(true);
            System.out.print(" Кот " + name + " наелся, остаток в тарелке: ");
        } else {
            System.out.print(" Коту " + name + " не хватает еды в тарелке, остаток: ");
        }   setSatiety(false);

    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }
}




