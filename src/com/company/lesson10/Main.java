package com.company.lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>(Arrays.asList(
                "Apricot", "Pineapple", "Orange", "Orange", "Banana",
                "Grape", "Pomegranate", "Pear", "Pomegranate", "Cherry",
                "Grapefruit", "Melon","Kiwi","Coconut","Mango","Coconut",
                "Nectarine","Sweets","Papaya","Apple"));

        System.out.println(fruits);

        Set<String> set = new LinkedHashSet<>(fruits);
        System.out.println(set);

        for (String key : set) {
           System.out.println("element: " + key + ", count: " + Collections.frequency(fruits, key));
        }


        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.addPerson("Tikhonov", "88005553555");
        telephoneDirectory.addPerson("Timofeev", "88005554555");
        telephoneDirectory.addPerson("Timofeev", "88005556555");
        telephoneDirectory.addPerson("Bratskiy", "880005557555");
        telephoneDirectory.addPerson("Govorkov", "88005556555");


        System.out.println(telephoneDirectory.get("Tikhonov"));
        System.out.println(telephoneDirectory.get("Timofeev"));


    }













}

