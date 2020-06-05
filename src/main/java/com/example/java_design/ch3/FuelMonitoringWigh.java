package com.example.java_design.ch3;

public class FuelMonitoringWigh extends FuelTankMonitoring {
    @Override
    protected boolean checkFuelTank() {
        return false;
    }

    @Override
    protected void giveWarningSignal() {

    }
}
