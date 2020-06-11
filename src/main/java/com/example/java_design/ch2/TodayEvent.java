package com.example.java_design.ch2;

public class TodayEvent extends DiscountMode {
    @Override
    protected double getDiscountRate() {
        return 0.3;
    }
}
