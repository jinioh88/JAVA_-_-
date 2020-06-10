package com.example.java_design.ch13;

public class HyundaiDoor extends Door {
    @Override
    protected void doClose() {
        System.out.println("close Hyundai Door");
    }

    @Override
    protected void doOpen() {
        System.out.println("open Hyundai Door");
    }
}
