package com.example.java_design.ch7;

public class ON implements State {
    private static ON on = new ON();
    private ON() {}

    public static ON getInstance() {
        return on;
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("Light Off!");
        light.setState(OFF.getInstance());
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Sleeping");
        light.setState(Sleeping.getInstance());
    }
}
