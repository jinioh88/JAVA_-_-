package com.example.java_design.ch10;

public class RoadDisplayWithTraffic extends RoadDisplay {
    @Override
    public void draw() {
        super.draw();
        drawTraffic();
    }

    private void drawTraffic() {
        System.out.println("traffic display");
    }
}
