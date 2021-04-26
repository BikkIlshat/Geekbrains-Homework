package com.company.lesson11;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Apple appple = new Apple();
        Orange orange = new Orange();

        Box<Orange> boxOrange = new Box<>();
        Box<Apple> boxApple = new Box<>();
        Box<Orange> anotherBoxOrange = new Box<>();

        boxOrange.addFruit(orange);
        boxOrange.addFruit(orange);
        boxApple.addFruit(appple);
        boxApple.addFruit(appple);
        boxApple.addFruit(appple);
        boxApple.addFruit(appple);

        System.out.println("Ящик с яблоками весит " + boxApple.getWeight() + " кг");
        System.out.println("Ящик с апельсинами весит " + boxOrange.getWeight() + " кг");
        System.out.println("Равен ли вес сравниваемых ящиков: " + boxApple.compare(boxOrange));

        boxOrange.pourFruitToIntoAnotherBox(anotherBoxOrange);
        System.out.println("Вес нового ящика, после пересыпания апельсинов " + anotherBoxOrange.getWeight() + " кг");
        System.out.println("Вес первоначального ящика с апельсинами " + boxOrange.getWeight() + " кг");

        System.out.println("Равен ли вес ящика с яблоками с новым ящиком апельсинов: " + boxApple.compare(anotherBoxOrange));
        System.out.println("Равен ли вес сравниваемых ящиков через метод equals : " + boxApple.equals(anotherBoxOrange));
        System.out.println("Равен ли вес сравниваемых ящиков через метод mathematicalCheck: " + boxApple.mathematicalCheck(anotherBoxOrange));
        System.out.println("Равен ли вес сравниваемых ящиков через метод compareTo: " + boxApple.compareTo(anotherBoxOrange));



        String[] array = {"q1","q2","q3","q4","q5"};
        System.out.println(Arrays.toString(array));
        swapElements(array, 0,1);
        System.out.println(Arrays.toString(array));


        List<String> list = convertToList(array);
        System.out.println(list.getClass() + ":" + list);

    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        T elements = array[index1];
        array[index1] = array[index2];
        array[index2] = elements;
    }

    private static <E> List<E> convertToList(E...array) {
        return Arrays.asList(array);

    }

}
