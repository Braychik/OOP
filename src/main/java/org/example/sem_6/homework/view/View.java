package org.example.sem_6.homework.view;

import org.example.sem_6.homework.data.Fonebook;
import org.example.sem_6.homework.data.Format;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {
    List<Fonebook> foneBookList;

    public View(List<Fonebook> foneBookList) {
        this.foneBookList = new ArrayList<>();
        this.foneBookList.addAll(foneBookList);
    }

    public void start(){
        boolean flag = true;
        while (flag){
            int n = menu();
            if (n != 5){
                Fonebook listfone = this.foneBookList.get(n);
                System.out.println(listfone.toString());
                boolean flag1 = true;
                while (flag1){
                    int n1= menuTwo();
                    if (n1 != 5){
                        Format format = new Format();
                        switch (n1){
                            case (1):
                                this.foneBookList.remove(n);
                                int tmp = menu();
                                if (tmp != 5){
                                    listfone.impFonebook(this.foneBookList.get(tmp).getFoneBook());
                                    this.foneBookList.remove(tmp);
                                    this.foneBookList.add(listfone);
                                    break;
                                } else{
                                    this.foneBookList.add(listfone);
                                    break;
                                }
                            case (2):
                                this.foneBookList.remove(n);
                                int tmp1 = menu();
                                if (tmp1 != 5){
                                    listfone.expFonebook(this.foneBookList.get(tmp1));
                                    this.foneBookList.remove(tmp1);
                                    this.foneBookList.add(listfone);
                                    break;
                                } else {
                                    this.foneBookList.add(listfone);
                                    break;
                                }
                            case (3):
                                int tmp2 = menuFormat();
                                if (tmp2 != 5){
                                    switch (tmp2) {
                                        case (1) -> format.formatPdf(listfone);
                                    }
                                } else break;
                            case (4):
                                flag1 = false;
                                break;
                        }
                    }
                }
            }else {
                flag = false;
                System.out.println("До встречи");
            }
        }
    }

    private int menu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете телефонную книгу (для выхода введите: 5): ");
        for (int i = 0; i < this.foneBookList.size(); i++) {
            System.out.println(i + " .Телефонная книга");
        }
        int n1 = scanner.nextInt();
        if (n1 >= this.foneBookList.size() || n1 < 0)
            return 5;
        return n1;
    }

    private int menuTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете действие: ");
        System.out.println("1. Импорт");
        System.out.println("2. Экспорт");
        System.out.println("3. Форматирование");
        System.out.println("4. Выход");
        int n = scanner.nextInt();
        if (n == 4) {
            return 5;
        }
        return n;
    }

    private int menuFormat(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберете действие: ");
        System.out.println("1. Форматировать в PDF");
        System.out.println("2. Выход");
        int n = scanner.nextInt();
        if (n == 2) {
            return 5;
        }
        return n;
    }
}
