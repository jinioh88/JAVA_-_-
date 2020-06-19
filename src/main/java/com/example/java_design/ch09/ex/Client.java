package com.example.java_design.ch09.ex;

public class Client {
    public static void main(String[] args) {
        Battery battery = new Battery();

        Observer batteryDisplay = new BatteryLevelDisplay(battery);
        battery.attach(batteryDisplay);
        Observer lowObserver = new LowBatteryWarning(battery);
        battery.attach(lowObserver);

        battery.consume(10);
        battery.consume(70);
        battery.consume(10);
    }
}
