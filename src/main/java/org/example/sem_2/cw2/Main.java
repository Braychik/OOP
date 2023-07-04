package org.example.sem_2.cw2;

public class Main {
    public static void main(String[] args) {
        Humen humen = new Humen();
        Car car = new Car();
        humen.drive(car);
        humen.drive(car);
        humen.stop();
        Bicycle bicycle = new Bicycle();
        humen.drive(bicycle);
        humen.drive(bicycle);
        humen.stop();
    }
}
