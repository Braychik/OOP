package org.example.sem_2.homework;

public class Treadmill extends Barrier {
    private int length;

    public Treadmill(String name, int length) {
        super(name);

        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Беговая дорожка размером: " + this.length);

        actions.run();

        if (getLength() <= actions.getRunDistance()) {
            System.out.println("Пробежал");

            return true;
        } else {
            System.out.println("Не пробежал");

            return false;
        }
    }
}
