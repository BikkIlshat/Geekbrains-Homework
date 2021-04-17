package com.company.lesson8;

public class theTreadmill implements Obstacles {
    int length;

    public theTreadmill(int length) {
        this.length = length;
    }

    @Override
    public void toRun(Marathon marathon) {
        marathon.run();
        marathon.setSuccess(marathon.getMaxLength() >= length);

        if (marathon.getSuccess()) {
            System.out.println(marathon.getNickName() + " успешно прошел дистанцию " );
        } else {
            System.out.println(marathon.getNickName() + " не смог пройти дистанцияю ");
        }
    }

    @Override
    public void toJump(Marathon marathon) {

    }
}
