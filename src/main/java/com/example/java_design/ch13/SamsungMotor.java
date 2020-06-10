package com.example.java_design.ch13;

import com.sun.javafx.scene.traversal.Direction;

public class SamsungMotor extends Motor {
    @Override
    protected void moveMotor(Direction direction) {
        System.out.println("move samsung motor");
    }
}
