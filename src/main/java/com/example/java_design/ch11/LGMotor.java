package com.example.java_design.ch11;

import com.sun.javafx.scene.traversal.Direction;

public class LGMotor extends Motor {
    private Door door;
    private MotorStatus motorStatus;

    public LGMotor(Door door) {
        super(door);
    }

    public void moveLGMotor(Direction direction) {

    }

    public void move(Direction direction) {
        MotorStatus motorStatus = getMotorStatus();

        if(motorStatus == MotorStatus.MOVING) {
            return;
        }

        DoorStatus doorStatus = door.getDoorStatus();
        if(doorStatus == DoorStatus.OPENED) {
            door.close();
        }

        moveLGMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }
}
