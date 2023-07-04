package org.example.sem_2.cw2;

public class Scate implements Transpart{
    @Override
    public void start() {
        System.out.println("Скейт поехала");
    }
    @Override
    public void stop() {
        System.out.println("Скейт остановилась");
    }
}
