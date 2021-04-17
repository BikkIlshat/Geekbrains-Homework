package com.company.lesson8;

public class Cat implements Marathon {

    private String name;
    private int maxHeight;
    private int maxLength;
    private boolean success;

    public Cat(String name, int maxHeight, int maxLength, boolean success) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLength = maxLength;
        this.success = success;
    }

    public String getName() {
        return name;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String getNickName() {
        return getName();
    }

    public int getMaxLength() {
        return maxLength;
    }

    @Override
    public void run() {

       System.out.println("Кот " + name +  " готовится на забег ");
    }

    @Override
    public void jump() {

        System.out.println("Кот " + name + " готовится к прыжку ");
    }

    @Override
    public boolean getSuccess() {
        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        this.success = success;
    }

}
