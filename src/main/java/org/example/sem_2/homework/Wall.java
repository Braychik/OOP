package org.example.sem_2.homework;

public class Wall extends Barrier {
    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена размером: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("прыжок выполнен");

            return true;
        } else {
            System.out.println("прыжок не выполнен");

            return false;
        }
    }
}
