package com.company.lesson7;

public class Main {
    public static void main(String[] args) {

        Cat[] cat = new Cat[3];

        cat[0] = new Cat("Barsik", 55);
        cat[1] = new Cat("Murzik", 60);
        cat[2] = new Cat("Karapuz", 85);

        Plate plate = new Plate(150);

        plate.info();

        plate.increaseFood(50);

        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            plate.info();
        }

    }

}
