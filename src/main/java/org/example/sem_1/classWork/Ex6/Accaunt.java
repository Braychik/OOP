package org.example.sem_1.classWork.Ex6;

public class Accaunt {
    private String owner;
    private int number;
    private Double balance;

    public Accaunt(String owner, Integer number, Double balance) {
        this.owner = owner;
        this.number = number;
        this.balance = balance;
    }

    public Accaunt() {
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withraw(double amount){
        if (this.balance >= amount){
            this.balance -= amount;
        }else {
            System.out.println("недостаточно средств \n остаток на счете:" + this.balance);
        }
    }
    @Override
    public String toString() {
        return "Accaunt{" +
                "owner='" + owner + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

