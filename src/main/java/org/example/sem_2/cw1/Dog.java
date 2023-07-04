package org.example.sem_2.cw1;

public class Dog extends Animal {
    static int count;
    int runDistance;
    int swimDistance;

    public Dog(String name, int runDistance, int swimDistance) {
        super(name);
        if (runDistance > 500) {
            this.runDistance = 500;
            System.out.println("Введённое значение больше максимального значения");
        } else this.runDistance = runDistance;
        if (swimDistance > 10) {
            this.swimDistance = 10;
            System.out.println("Введённое значение больше максимального значения");
        } else this.swimDistance = swimDistance;
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance > runDistance) {
            System.out.println(super.name + "Не сможет прибежать");
        } else {
            System.out.println(super.name + "Пробежал");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > swimDistance) {
            System.out.println(super.name + "Не сможет приплыть");
        } else {
            System.out.println(super.name + "Приплыл");
        }
    }
}
