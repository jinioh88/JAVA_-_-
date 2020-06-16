package com.example.java_design.ch13;

import com.example.java_design.ch11.MotorStatus;
import com.example.java_design.ch2.Direction;

public class HyundaiMotor extends Motor {
    private Door door;
    private MotorStatus motorStatus;

    public HyundaiMotor() {}

    public HyundaiMotor(Door door) {
        super(door);
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("HyundaiMotor");
    }
}
