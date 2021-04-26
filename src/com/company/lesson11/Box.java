package com.company.lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Box<T extends Fruit> implements Comparable<Box> {
    private ArrayList<T> box;

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    }

    public void addFruit(T fruits) {
        box.add(fruits);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            totalWeight += + box.get(i).getWeight();
        }
        return totalWeight;
    }

    public void pourFruitToIntoAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(box);
        box.clear();
    }


    // Первый метод сравнения
    public boolean compare(Box anotherBox) {
        if (getWeight() != anotherBox.getWeight()) {
            return false;
        } else {
            return true;
        }
    }

// Второй метод сравенния через equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(getWeight(),box.getWeight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(box);
    }

    //  еще вариант сравнения двух ящиков
    public boolean mathematicalCheck(Box<? extends Fruit> anotherBox) {
        return Math.abs(getWeight() - anotherBox.getWeight()) < 0.0001f;
    }



    // еще варинат сравнения двух ящиков
    @Override
    public int compareTo(Box anotherBox) {
        if (getWeight() > anotherBox.getWeight()) {
            return  1;
        } else if (getWeight() < anotherBox.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }
}


