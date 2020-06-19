package com.example.java_design.ch12.ex;

public class HyundaiMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move Hyundai Motor " + direction);
    }
}
