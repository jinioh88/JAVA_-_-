package com.example.java_design.ch14;

public class Computer {
    private Body body;
    private Keyboard keyboard;
    private Monitor monitor;
    private Speaker speaker;

    public void addBody(Body body) {
        this.body = body;
    }

    public void addKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void addMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void addSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public int getPrice() {
        return body.getPrice() + keyboard.getPrice() + monitor.getPrice() + speaker.getPrice();
    }

    public int getPower() {
        return body.getPower() + keyboard.getPower() + monitor.getPower() + speaker.getPower();
    }
}
