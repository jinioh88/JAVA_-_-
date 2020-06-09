package com.example.java_design.ch10;

public class CrossingDecorator extends DisplayDecorator {
    public CrossingDecorator(Display decoratedDisplay) {
        super(decoratedDisplay);
    }

    @Override
    public void draw() {
        super.draw();
        drawCrossing();
    }

    private void drawCrossing() {
        System.out.println("t cross display");
    }
}
