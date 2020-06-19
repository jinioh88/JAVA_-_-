package com.example.java_design.ch13.ex;

public class ExpensiveGPS extends GPS {
    @Override
    public Location findCurrentLocation() {
        System.out.println("find current location with expensive GPS");
        return null;
    }
}
