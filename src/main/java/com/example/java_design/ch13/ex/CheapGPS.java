package com.example.java_design.ch13.ex;

public class CheapGPS extends GPS {
    @Override
    public Location findCurrentLocation() {
        System.out.println("find current location with Cheap GPS");
        return null;
    }
}
