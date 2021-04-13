package com.company.lesson8;

public abstract class Obstacles {
    private int runningOnTheTreadmill;
    private int jumpOverTheWall;


    public Obstacles(int runningOnTheTreadmill, int jumpOverTheWall) {
        this.runningOnTheTreadmill = runningOnTheTreadmill;
        this.jumpOverTheWall = jumpOverTheWall;
    }


    public void runningOnTheTreadmill(int length) {

    }

    public void jumpOverTheWall(int length) {

    }

    public int getRunningOnTheTreadmill() {
        return runningOnTheTreadmill;
    }

    public int getJumpOverTheWall() {
        return jumpOverTheWall;
    }
}
