package com.example.java_design.ch12;

import com.sun.javafx.scene.traversal.Direction;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
