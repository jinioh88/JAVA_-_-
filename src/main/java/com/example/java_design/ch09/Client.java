package com.example.java_design.ch09;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.setMinMaxView(minMaxView);

        for(int i = 1; i <=5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
