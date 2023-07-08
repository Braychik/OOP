package org.example.sem_3.classWork.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class abstractGame implements Game {
    protected int lengthWord;
    protected int countTry;
    protected String word;
    protected GameStatus status = GameStatus.INIT;
    protected List<String> logo = new ArrayList<>();
    protected int humanTry;

    public abstractGame() {

    }

    public abstractGame(int lengthWord, int countTry, String word, GameStatus status) {
        this.lengthWord = lengthWord;
        this.countTry = countTry;
        this.word = word;
        this.status = status;
        this.logo = new ArrayList<>();
        this.humanTry = 0;
    }

    @Override
    public void Start(int lengthWord, int countTry) {
        status = GameStatus.START;
        this.lengthWord = lengthWord;
        this.countTry = countTry;
        this.word = generateWord();
        this.logo.add(String.format("Запуск игры %s; Число попыток: %d; Загаданное слово: %s",
                getNameGame(), countTry, this.word));
        System.out.println("word = " + word);
    }

    public abstract String getNameGame();

    private String generateWord() {
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        List<String> strList = generateCharList();
        for (int i = 0; i < lengthWord; i++) {
            int ind = r.nextInt(strList.size());
            sb.append(strList.get(ind));
            strList.remove(ind);
        }
        return sb.toString();
        // todo word generation
    }

    public abstract List<String> generateCharList();

    @Override
    public Answer inputValue(String input) {
        humanTry++;
        int tryCount;
        if (--countTry == 0){
            int bools = 0;
            int cows = 0;
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == word.charAt(i)){
                    bools++;
                }
                if (word.contains(String.valueOf(input.charAt(i)))) {
                    cows++;
                }
            }
            logo.add(String.format("Попытка № %d; введенный выриант - %s; " +
                    "быки = %d, коровы = %d", humanTry, input, bools, cows));
            if (bools == lengthWord) {
                logo.add(String.format("Победил с %d попытки; быки = %d, коровы = %d", humanTry, bools, cows));
                status = GameStatus.WIN;
            } else  {
                logo.add("Проигрыш");
                status = GameStatus.FINISH;
            }
            return new Answer(bools, cows);
        }
        int bools = 0;
        int cows = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == word.charAt(i)){
                bools++;
            }
            if (word.contains(String.valueOf(input.charAt(i)))) {
                cows++;
            }
        }
        logo.add(String.format("Попытка № %d; введенный выриант - %s; " +
                "быки = %d, коровы = %d", humanTry, input, bools, cows));
        if (bools == lengthWord) {
            logo.add(String.format("Победил с %d попытки; быки = %d, коровы = %d", humanTry, bools, cows));
            status = GameStatus.WIN;
        }
        return new Answer(bools, cows);
    }

    @Override
    public GameStatus getGameStatus() {
        return status;
    }
    @Override
    public List<String> getLogo(){
        return logo;
    }
    @Override
    public void restart(){
        this.logo = new ArrayList<>();
        this.humanTry = 0;
    }
}
