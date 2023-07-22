package org.example.sem_6.homework.dataService;


import org.example.sem_6.homework.data.Fonebook;
import org.example.sem_6.homework.data.User;

import java.util.List;

public interface ImpExpBook {
    void impFonebook(List<User> foneBook);
    void expFonebook(Fonebook foneBook);
}
