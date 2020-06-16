package com.example.java_design.ch12;

import com.example.java_design.ch2.Direction;

public class ResponseTimeScheduler implements ElevatorScheduler {
    private static ElevatorScheduler scheduler;

    private ResponseTimeScheduler() {
    }

    public static ElevatorScheduler getInstance() {
        if(scheduler == null) {
            scheduler = new ResponseTimeScheduler();
        }

        return scheduler;
    }

    @Override
    public int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction) {
        return 0;
    }
}
