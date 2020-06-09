package com.example.java_design.ch12;

import com.sun.javafx.scene.traversal.Direction;

public class Client {
    public static void main(String[] args) {
        ElevatorManager emWithResponseTimeScheduler = new ElevatorManager(2, SchedulingStrategyID.RESPONSE_TIME);
        emWithResponseTimeScheduler.requestElevator(10, Direction.UP);

        ElevatorManager emWithThroughtputScheduler = new ElevatorManager(2, SchedulingStrategyID.THROUGHPUT);
        emWithThroughtputScheduler.requestElevator(10, Direction.UP);
    }
}
