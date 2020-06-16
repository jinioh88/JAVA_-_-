package com.example.java_design.ch2;

public class FuelTankMonitoringBasic extends FuelTankMonitoring {
    @Override
    protected void giveWarningSignal() {
        System.out.println("signal");
    }

    @Override
    protected boolean checkFuelTank() {
        return true;
    }

    public static void main(String[] args) {
        FuelTankMonitoring monitoring = new FuelTankMonitoringBasic();
        monitoring.giveWarningSignal();
    }
}
