package com.example.java_design.ch1;

public abstract class HomeAppliancies {
    private Integer serialNo;
    private String manufacture;
    private Integer year;

    public abstract void turnOn();
    public abstract void turnOff();
}
