package com.example.java_design.ch09.ex;

public class Battery extends Subject {
    private int level = 100;

    public void consume(int level) {
        this.level -= level;
        notifyObservers();
    }

    public int getLevel() {
        return level;
    }
}
