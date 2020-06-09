package com.example.java_design.ch10;

public class RoadDisplayWithLane extends RoadDisplay {
    public void draw() {
        super.draw();
        drawLane();
    }

    private void drawLane() {
        System.out.println("CarLine Display");
    }
}
