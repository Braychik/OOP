package org.example.sem_4.classWork.ex1;

//Создать класс - коробку (SimpleBox), которая может хранить любые объекты. Посмотреть
//с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
public class Main {
    public static void main(String[] args) {
        SimpleBox intBox1 = new SimpleBox(10);
        SimpleBox intBox2 = new SimpleBox(20);
        int sum = (Integer) intBox1.getObj() + (Integer) intBox2.getObj(); // каждый раз необходимо делать каст
        System.out.println("sum = " + sum);
        //разрастается
        intBox2.setObj("10");
        if (intBox1.getObj() instanceof Integer && intBox2.getObj() instanceof Integer){// каждый раз необходимо делать каст
            // + если обьектов много if разрастётся
            int sum2 = (Integer) intBox1.getObj() + (Integer) intBox2.getObj();
            System.out.println("sum2 = " + sum2);
        }
        GenBox<Integer> gen1 = new GenBox(15);//за счет предопределения каст не нужен
        GenBox<Integer> gen2 = new GenBox(10);
        int sum3 = gen1.getObj() + gen2.getObj();
        System.out.println("sum3 = " + sum3);
    }
}
