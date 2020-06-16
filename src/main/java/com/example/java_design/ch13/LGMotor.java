package com.example.java_design.ch13;

import com.example.java_design.ch11.MotorStatus;
import com.example.java_design.ch2.Direction;

public class LGMotor extends Motor {
    private Door door;
    private MotorStatus motorStatus;

    public LGMotor() {
        super();
    }

    public LGMotor(Door door) {
        super(door);
    }

    @Override
    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("LG Motor");
    }
}
