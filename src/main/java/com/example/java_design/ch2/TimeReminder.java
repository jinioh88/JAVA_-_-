package com.example.java_design.ch2;

import com.example.java_design.ch3.MP3;

import java.util.Calendar;

public class TimeReminder {
    private TimeProvider provider;
    private MP3 m = new MP3();

    public void setProvider(TimeProvider provider) {
        this.provider = provider;
    }

    public void reminder() {
        int hour = provider.getTime();

        if(hour >= 22) {
            m.playSong();
        }
    }

    public static void main(String[] args) {
        TimeReminder reminder = new TimeReminder();
        reminder.setProvider(new FakeTimeProvider(23));

        reminder.reminder();
    }
}
