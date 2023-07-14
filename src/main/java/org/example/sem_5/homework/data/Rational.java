package org.example.sem_5.homework.data;

public class Rational {
    public int num1;
    public int num2;

    public Rational(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    @Override
    public String toString() {
        return num1 + "/" + num2;
    }
}
