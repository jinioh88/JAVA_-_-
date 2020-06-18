package com.example.java_design.ch8;

public class PowerCommand implements Command2 {
    private TV tv;

    public PowerCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.power();
    }
}
