package com.company.lesson9;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException {
    private int size;

    public MyArraySizeException(String s, int size) {
        super(s);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}
