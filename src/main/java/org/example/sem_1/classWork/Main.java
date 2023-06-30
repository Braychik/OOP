package org.example.sem_1.classWork;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("barsik", "color", 21);
//        cat1.getName() = "barsik";
//        cat1.getColor() = "white";
//        cat1.getAge() = 21;
        System.out.println("Кот " + cat1.getName() + ", " + cat1.getColor()
                + " цвета, имеет возраст " + cat1.getAge() + " лет" );
        Cat cat2 = new Cat("murzik", "black", 11);
        cat2.setName("tihon");
        cat2.setAge(-1);
        System.out.println("Кот " + cat2.getName() + ", "
                + cat2.getColor() + " цвета, имеет возраст " + cat2.getAge() + " лет" );
        cat1.animalInfo();
        cat2.jump();
        cat1.voice();
    }
}
