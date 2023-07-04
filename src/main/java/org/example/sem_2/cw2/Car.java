package org.example.sem_2.cw2;

public class Car implements Transpart {

    @Override
    public void start() {
        System.out.println("Машина поехала");
    }
    @Override
    public void stop() {
        System.out.println("Машина остановилась");
    }
}
