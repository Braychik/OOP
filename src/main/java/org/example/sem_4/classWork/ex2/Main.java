package org.example.sem_4.classWork.ex2;

//Создать коробку с числами(BoxWithNumber) и найти среднее значение(average) и сравнение средних(compareAverage).
public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber<>(1, 2, 3, 4, 5);
        System.out.println("box1.average() = " + box1.average());
        BoxWithNumber<Integer> box2 = new BoxWithNumber<>(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("box1.average() = " + box1.average());

        System.out.println("box1.compareAverage(box2) = " + box1.compareAverage(box2));
    }
}
