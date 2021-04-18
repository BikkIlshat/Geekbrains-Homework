package com.company.lesson9;

public class MyArrayDataException extends NumberFormatException {
    public int i, j;

    public MyArrayDataException(String s, int i, int j) {
        super(s);
        this.i = i;
        this.j = j;
    }

}
