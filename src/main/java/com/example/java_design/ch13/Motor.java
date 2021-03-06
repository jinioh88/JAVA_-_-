package com.example.java_design.ch13;


import com.example.java_design.ch11.DoorStatus;
import com.example.java_design.ch11.MotorStatus;
import com.example.java_design.ch2.Direction;

public abstract class Motor {
    protected Door door;
    private MotorStatus motorStatus;

    public Motor() {
    }

    public Motor(Door door) {
        this.door = door;
        motorStatus = MotorStatus.STOPPED;
    }

    public MotorStatus getMotorStatus() {
        return motorStatus;
    }

    public void setMotorStatus(MotorStatus motorStatus) {
        this.motorStatus = motorStatus;
    }

    public void setDoor(Door door) {
        this.door = door;
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

        moveMotor(direction);
        setMotorStatus(MotorStatus.MOVING);
    }

    protected abstract void moveMotor(Direction direction);
}
