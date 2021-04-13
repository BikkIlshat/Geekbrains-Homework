package com.company.lesson8;

public interface Obstacles extends Treadmill, Wall  {

    @Override
    void runningOnTheTreadmill();

    @Override
    void jumpOverTheWall();


}
