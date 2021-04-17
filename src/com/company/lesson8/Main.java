package com.company.lesson8;

public class Main {
    public static void main(String[] args) {

        Marathon[] marathonRunner = new Marathon[3];

        marathonRunner[0] = new Human("Василий", 2, 2, true);
        marathonRunner[1] = new Cat("Barsik", 2, 2, true);
        marathonRunner[2] = new Robot("WALL-E", 1, 20, true);

        Obstacles[] obstacles = new Obstacles[2];

        obstacles[0] = new theWall(2);
        obstacles[1] = new theTreadmill(2);


        for (int i = 0; i < marathonRunner.length; i++) {
            for (int j = 0; j < obstacles.length; j++) {
                if (marathonRunner[i].getSuccess()) {
                    obstacles[j].toJump(marathonRunner[i]);
                    obstacles[j].toRun(marathonRunner[i]);
                }
            }
        }
    }
}

