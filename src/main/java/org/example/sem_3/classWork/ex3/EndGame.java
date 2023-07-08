package org.example.sem_3.classWork.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EndGame extends abstractGame {
    @Override
    public List<String> generateCharList() {
        List<String> strList = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            strList.add(Character.toString(i));
        }
        return strList;
    }

    @Override
    public String getNameGame() {
        List<String> tmp = Arrays.asList(getClass().getName().split("\\."));
        return tmp.get(tmp.size() - 1);
    }
}