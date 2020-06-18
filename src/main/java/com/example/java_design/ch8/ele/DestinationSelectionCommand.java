package com.example.java_design.ch8.ele;

import com.example.java_design.ch12.ElevatorController;

public class DestinationSelectionCommand implements Command {
    private ElevatorController controller;
    private int destination;

    public DestinationSelectionCommand(ElevatorController controller, int destination) {
        this.controller = controller;
        this.destination = destination;
    }

    @Override
    public void execute() {
        controller.gotoFloor(destination);
    }
}
