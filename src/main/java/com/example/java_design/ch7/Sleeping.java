package com.example.java_design.ch7;

public class Sleeping implements State {
    private static Sleeping sleeping = new Sleeping();

    private Sleeping() {
    }

    public static Sleeping getInstance() {
        return sleeping;
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("sleep --> off");
        light.setState(OFF.getInstance());
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("sleep --> on");
        light.setState(ON.getInstance());
    }
}
