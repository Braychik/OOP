package org.example.sem_4.classWork.ex3;

import java.util.List;

//Написать класс калькулятор, принимающий List целочисленных значений, возвращающий сумму элементов коллекции (метод sum)
public class Calculate{
    public double sum(List<? extends Number> numbers){
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
    public double multy(List<? extends Number> numbers){
        double result = 1.0;
        for (Number number : numbers) {
            result *= number.doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> numbers) {
        double result = 1.0;
        for (Number number : numbers) {
            result /= number.doubleValue();
        }
        return result;
    }

    public String translateBinary(String strNum){
        double number = Double.parseDouble(strNum);
        int firstNum = (int) number;
        double lastNum = number % firstNum;
        int count = 0;
        for (String s : strNum.split("")) {
            if (s.charAt(0) == '.'){
                count++;
            }
        }
        if (count == 0) {
            return Integer.toBinaryString(firstNum);
        } else {
            if (lastNum == 0){
                return Integer.toBinaryString(firstNum);
            }else {
                return Integer.toBinaryString(firstNum) + "," +
                        Long.toBinaryString(Double.doubleToRawLongBits(lastNum));
            }
        }
    }

}
