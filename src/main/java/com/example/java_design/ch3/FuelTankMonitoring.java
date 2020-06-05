package com.example.java_design.ch3;

public abstract class FuelTankMonitoring {
    public void checkAndWarn() {
        if(checkFuelTank()) {
            giveWarningSignal();
        }
    }

    protected abstract boolean checkFuelTank();
    protected abstract void giveWarningSignal();
}
