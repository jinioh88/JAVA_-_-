package com.example.java_design.ch8.ele;

import com.example.java_design.ch12.ElevatorController;
import com.example.java_design.ch2.Direction;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int count) {
        this.controllers = new ArrayList<>(count);
    }

    public void addController(ElevatorController controller) {
        controllers.add(controller);
    }

    public void requestElevator(int destination, Direction direction) {
        int selectedElevator = selectElevator(destination, direction);
        controllers.get(selectedElevator);
    }

    private int selectElevator(int destination, Direction direction) {
        return 0;
    }
}
