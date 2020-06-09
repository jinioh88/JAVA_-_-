package com.example.java_design.ch09;

public class Client {
    public static void main(String[] args) {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView1 = new DataSheetView(scoreRecord, 3);
        DataSheetView dataSheetView2 = new DataSheetView(scoreRecord, 5);
        MinMaxView minMaxView = new MinMaxView(scoreRecord);

        scoreRecord.attach(dataSheetView1);
        scoreRecord.attach(dataSheetView2);
        scoreRecord.attach(minMaxView);

        for(int i = 1; i <=5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }

        StatisticsView statisticsView = new StatisticsView(scoreRecord);
        scoreRecord.attach(statisticsView);

        for(int i = 1; i <=5; i++) {
            int score = i * 10;
            System.out.println("Adding " + score);

            scoreRecord.addScore(score);
        }
    }
}
