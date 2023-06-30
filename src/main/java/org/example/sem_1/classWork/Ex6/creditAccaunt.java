package org.example.sem_1.classWork.Ex6;

public class creditAccaunt extends Accaunt{
    private double degreePercent;

    public creditAccaunt(String owner, Integer number, Double balance, double degreePercent) {
        super(owner, number, balance);
        this.degreePercent = degreePercent;
    }

    public creditAccaunt(String owner, Integer number, Double balance) {
        super(owner, number, balance);
    }

    public double getDegreePercent() {
        return degreePercent;
    }

    public void setDegreePercent(double degreePercent) {
        this.degreePercent = degreePercent;
    }
    public void calculateInterest(){
        double result = getBalance() * degreePercent / 100;
        withraw(result);
    }
}
