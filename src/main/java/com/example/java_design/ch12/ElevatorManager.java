package com.example.java_design.ch12;

import com.example.java_design.ch2.Direction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ElevatorManager {
    private List<ElevatorController> controllers;
    private SchedulingStrategyID strategyID;

    public ElevatorManager(int controllerCount, SchedulingStrategyID strategyID) {
        controllers = new ArrayList<>(controllerCount);
        for(int i = 0; i < controllerCount; i++) {
            ElevatorController controller = new ElevatorController(i+1);
            controllers.add(controller);
        }
        this.strategyID = strategyID;
    }

    public void setStrategyID(SchedulingStrategyID strategyID) {
        this.strategyID = strategyID;
    }

    void requestElevator(int destination, Direction direction) {
        ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyID);
        System.out.println(scheduler);

        int selectedElevator = scheduler.selectElevator(this, destination, direction);
        controllers.get(selectedElevator).gotoFloor(destination);
    }
}
