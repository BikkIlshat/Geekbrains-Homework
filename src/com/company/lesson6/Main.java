package com.company.lesson6;

public class Main {
    public static void main(String[] args) {

       Animal[] animals = new Animal[6];
       animals[0] = new Cat("Barsik",112,0);
       animals[1] = new Cat("Murzik",90, 0);
       animals[2] = new Cat("Markiz",150,0);
       animals[3] = new Dog("Spike", 112,10);
       animals[4] = new Dog("Zhulik",300,5);
       animals[5] = new Dog("Bobik", 500,7);

        for (int i = 0; i < animals.length; i++) {
            animals[i].swim();
            animals[i].run();
        }

        Cat.getCounterCat();
        Dog.getCountDog();
        Animal.getCountAnimals();
    }

}
