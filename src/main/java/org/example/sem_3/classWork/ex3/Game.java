package org.example.sem_3.classWork.ex3;

import java.util.List;

public interface Game {
    public void Start(int lengthWord, int countTry);
    public Answer inputValue(String input);
    public GameStatus getGameStatus();
    List<String> getLogo();
    void restart();
}
