package com.example.java_design.ch11;

import com.sun.javafx.scene.traversal.Direction;

public class HyundaiMotor extends Motor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("HyundaiMotor");
    }
}
