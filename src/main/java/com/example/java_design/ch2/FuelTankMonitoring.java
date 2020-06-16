package com.example.java_design.ch2;

public abstract class FuelTankMonitoring {
    public void checkAndWarn() {
        if (checkFuelTank()) {
            giveWarningSignal();
        }
    }

    protected abstract void giveWarningSignal();

    protected abstract boolean checkFuelTank();
}
