package org.example.sem_1.classWork.Ex6;

public class safeAccaunt extends Accaunt{
    private double percent;

    public safeAccaunt(String owner, Integer number, Double balance, double percent){
        super(owner, number, balance);
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
    public void addInterest(){
        double result = getBalance() * this.percent / 100;
        deposit(result);
    }

    @Override
    public String toString() {
        return "safeAccaunt{" +
                "percent=" + percent +
                '}';
    }
}
