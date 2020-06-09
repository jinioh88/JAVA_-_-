package com.example.java_design.ch09;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
    private List<Integer> scores = new ArrayList<>();

    public void addScore(int score) {
        scores.add(score);

        notifyObservers();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}
