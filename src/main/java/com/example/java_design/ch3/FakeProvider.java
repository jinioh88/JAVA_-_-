package com.example.java_design.ch3;

import java.util.Calendar;

public class FakeProvider implements TimeProvider {
    private Calendar cal;

    public FakeProvider() {
        this.cal = Calendar.getInstance();
    }

    public FakeProvider(int hours) {
        this.cal = Calendar.getInstance();
        setHours(hours);
    }

    @Override
    public void setHours(int hours) {
        cal.set(Calendar.HOUR_OF_DAY, hours);
    }

    @Override
    public int getTime() {
        return cal.get(Calendar.HOUR_OF_DAY);
    }
}
