package com.company.lesson10;

import java.util.*;

public class TelephoneDirectory {

    private final Map<String, List<String>> phoneboock = new HashMap<>();

    public void addPerson(String surname, String phoneNumber) {
        List<String> number;
        if (phoneboock.containsKey(surname)) {
            number = phoneboock.get(surname);

        } else {
            number = new ArrayList<>();
        }
        number.add(phoneNumber);
        phoneboock.put(surname, number);
    }

    public List<String> get(String surname){
        return phoneboock.get(surname);

    }

}


