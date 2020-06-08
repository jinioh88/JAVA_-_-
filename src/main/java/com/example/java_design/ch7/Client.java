package com.example.java_design.ch7;

public class Client {
    public static void main(String[] args) {
        Light light = new Light();
        light.setState(ON.getInstance());
        light.off_button_pushed();
    }
}
