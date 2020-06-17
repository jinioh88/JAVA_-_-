package com.example.java_design.ch6;

public class Printer {
    private int counter = 0;
    private boolean available = true;

    Printer() {}

    public void print(String str) {
        synchronized (this) {
            counter++;
            System.out.println(str);
        }

        setAvailable(true);
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
