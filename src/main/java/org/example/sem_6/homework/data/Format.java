package org.example.sem_6.homework.data;

import org.example.sem_6.homework.dataService.Formatter;

public class Format implements Formatter {
    @Override
    public Fonebook formatPdf(Fonebook foneBook) {
        System.out.println("Смена формата на PDF");
        return foneBook;
    }

}
