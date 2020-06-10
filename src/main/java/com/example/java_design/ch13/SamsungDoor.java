package com.example.java_design.ch13;

public class SamsungDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("close samsung Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open samsung Door");
    }
}
