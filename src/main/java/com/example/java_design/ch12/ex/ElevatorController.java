package com.example.java_design.ch12.ex;

public class ElevatorController {
    private int id;
    private int curFloor = 1;
    private Motor motor;

    public ElevatorController(int id, Motor motor) {
        this.id = id;
        this.motor = motor;
    }

    public void gotoFloor(int destination) {
        if(destination == curFloor) {
            return;
        }

        Direction direction;

        if(destination > curFloor) {
            direction = Direction.UP;
        } else {
            direction = Direction.DOWN;
        }

        motor.move(direction);

        curFloor = destination;

        motor.stop();
    }
}
