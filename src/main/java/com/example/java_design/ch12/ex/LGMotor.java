package com.example.java_design.ch12.ex;

public class LGMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move LG Motor " + direction);
    }
}
