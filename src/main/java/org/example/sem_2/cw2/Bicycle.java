package org.example.sem_2.cw2;

public class Bicycle implements Transpart {

    @Override
    public void start() {
        System.out.println("Мотоцикл поехал");
    }
    @Override
    public void stop() {
        System.out.println("Мотоцикл остановился");
    }
}
