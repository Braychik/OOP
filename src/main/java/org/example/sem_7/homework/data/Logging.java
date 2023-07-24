package org.example.sem_7.homework.data;

import org.example.sem_7.homework.dataService.intLogging;

import java.util.ArrayList;

public class Logging implements intLogging {
    private ArrayList<String> login;

    public Logging() {
        this.login = new ArrayList<>();
    }

    @Override
    public void login() {
        for (String s : this.login) {
            System.out.println(s);
        }
    }

    @Override
    public void saveLogin(String str) {
        this.login.add(str);
    }
}
