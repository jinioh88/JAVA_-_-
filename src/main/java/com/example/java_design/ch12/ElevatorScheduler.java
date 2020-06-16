package com.example.java_design.ch12;


import com.example.java_design.ch2.Direction;

public interface ElevatorScheduler {
    int selectElevator(ElevatorManager elevatorManager, int destination, Direction direction);
}
