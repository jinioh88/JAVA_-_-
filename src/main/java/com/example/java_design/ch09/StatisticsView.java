package com.example.java_design.ch09;

import java.util.List;

public class StatisticsView implements Observer {
    private ScoreRecord scoreRecord;

    public StatisticsView(ScoreRecord scoreRecord) {
        this.scoreRecord = scoreRecord;
    }

    @Override
    public void update() {
        List<Integer> record = scoreRecord.getScoreRecord();
        displayStatistic(record);
    }

    private void displayStatistic(List<Integer> record) {
        int sum = 0;
        for(int score : record) {
            sum += score;
        }

        float average = (float) sum / record.size();
        System.out.println("Sum: " + sum + " Average: " + average);
    }
}
