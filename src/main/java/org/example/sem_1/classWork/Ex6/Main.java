package org.example.sem_1.classWork.Ex6;

public class Main {
    public static void main(String[] args) {
        creditAccaunt credit = new creditAccaunt("Иван Иванов", 123456, 1000.5, 10.0);
        safeAccaunt safe = new safeAccaunt("Иван Иванов", 789654, 3000.5, 5);
        System.out.println(credit.getBalance());
        credit.calculateInterest();
        System.out.println(credit.getBalance());
        System.out.println(safe.getBalance());
        safe.addInterest();
        System.out.println(safe.getBalance());
    }
}
