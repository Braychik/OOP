package org.example.sem_6.homework;


import org.example.sem_6.homework.data.Fonebook;
import org.example.sem_6.homework.data.User;
import org.example.sem_6.homework.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fonebook foneBook1 = new Fonebook();
        for (int i = 0; i < 5; i++) {
            foneBook1.setUser(new User("Николай", 1000 + i));
        }
        Fonebook foneBook2 = new Fonebook();
        for (int i = 0; i < 3; i++) {
            foneBook2.setUser(new User("Семен", 1000 + i));
        }
        List<Fonebook> bookList = new ArrayList<>(Arrays.asList(foneBook1, foneBook2));
        View view = new View(bookList);
        view.start();
    }
}
