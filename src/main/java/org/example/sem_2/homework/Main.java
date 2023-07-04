package org.example.sem_2.homework;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        Actions[] actions = {
                new Humen("Boris", 700, 150),
                new Robot("Robocop", 1000, 100),
                new Cat("Barsik", 200, 100)
        };
//
        int distance;
        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++) {
            distance = rand.nextInt(999);
            isRoad = rand.nextBoolean();
            if (isRoad) {
                barriers[i] = new Treadmill("Дорожка " + i, distance);
            } else {
                barriers[i] = new Wall("Стена " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Выполнено!!");
            } else {
                System.out.println("Выбыл!!");
            }
        }
    }
}
