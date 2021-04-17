package com.company.lesson8;

public class theWall implements Obstacles {
    int height;

    public theWall(int height) {
        this.height = height;
    }

    @Override
    public void toRun(Marathon marathon) {

    }

    @Override
    public void toJump(Marathon marathon) {
        marathon.jump();
        marathon.setSuccess(marathon.getMaxHeight() >= height);

        if (marathon.getSuccess()) {
            System.out.println(marathon.getNickName() + " успешно перепрыгнул препятствие ");
        } else {
            System.out.println(marathon.getNickName() + " не смог перепрыгнуть препятствие ");
        }
    }

}


