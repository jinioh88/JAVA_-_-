package com.example.java_design.ch8.ele;

import com.example.java_design.ch2.Direction;

public class ElevatorRequestCommand implements Command {
    private Direction direction;
    private int destination;

    private ElevatorManager elevatorManager;

    public ElevatorRequestCommand(Direction direction, int destination, ElevatorManager elevatorManager) {
        this.direction = direction;
        this.destination = destination;
        this.elevatorManager = elevatorManager;
    }

    @Override
    public void execute() {
        elevatorManager.requestElevator(destination, direction);
    }
}
