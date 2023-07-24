package org.example.sem_7.homework.data;

public class Komplex extends Number{
    public double a;
    public double b;

    public Komplex(double a, double b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {
        return String.format("%f + %fi", a, b);
    }
}
