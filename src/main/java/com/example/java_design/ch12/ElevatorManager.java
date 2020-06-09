package com.example.java_design.ch12;

import com.sun.javafx.scene.traversal.Direction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;

    public ElevatorManager(int controllerCount) {
        controllers = new ArrayList<>(controllerCount);
        for(int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i+1);
            controllers.add(controller);
        }
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler;

        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);

        if(hour < 12) {
            scheduler = new ResponseTimeScheduler();
        } else {
            scheduler = new ThroughputScheduler();
        }

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
