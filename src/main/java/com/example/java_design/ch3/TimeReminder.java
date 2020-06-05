package com.example.java_design.ch3;

import java.util.Calendar;

public class TimeReminder {
    TimeProvider timeProvider;
    private MP3 m;

    public void setTimeProvider(TimeProvider timeProvider) {
        this.timeProvider = timeProvider;
    }

    public void reminder() {
        m = new MP3();
        int hour = timeProvider.getTime();

        if(hour >= 22) {
            m.playSong();
        }
    }
}
