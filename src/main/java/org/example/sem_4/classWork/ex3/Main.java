package org.example.sem_4.classWork.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        List<Integer> listInt = new ArrayList<>();
        List<Double> listDouble = new ArrayList<>();
        List<Number> listNumber = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            listInt.add(i);
            listDouble.add(((double) i));
            listNumber.add(i);
        }
        String str = "5.55";

        System.out.println("calculate.sum(listNumber) = " + calculate.sum(listNumber));
        System.out.println("calculate.sum(listInt) = " + calculate.sum(listInt));
        System.out.println("calculate.sum(listDouble) = " + calculate.sum(listDouble));
        System.out.println("calculate.multy(listInt) = " + calculate.multy(listInt));
        System.out.println("calculate.division(listInt) = " + calculate.division(listInt));
        System.out.println("calculat.translateBinary(str) = " + calculate.translateBinary(str));

    }
}
