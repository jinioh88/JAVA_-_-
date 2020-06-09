package com.example.java_design.ch09;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
    private List<Integer> scores = new ArrayList<>();
    private List<DataSheetView> dataSheetViews = new ArrayList<>();
    private MinMaxView minMaxView;

    public void addDataSheetView(DataSheetView dataSheetView) {
        dataSheetViews.add(dataSheetView);
    }

    public void setMinMaxView(MinMaxView minMaxView) {
        this.minMaxView = minMaxView;
    }

    public void addScore(int score) {
        scores.add(score);

        for(DataSheetView dataSheetView : dataSheetViews) {
            dataSheetView.update();
        }

        minMaxView.update();
    }

    public List<Integer> getScoreRecord() {
        return scores;
    }
}
