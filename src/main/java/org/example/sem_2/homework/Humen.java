package org.example.sem_2.homework;

public class Humen implements Actions {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Humen(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }
    @Override
    public void run() {
        System.out.println("Human " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Human " + this.name + " is jumping " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
