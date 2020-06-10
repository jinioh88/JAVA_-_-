package com.example.java_design.ch14;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
    private List<ComputerDevice> components = new ArrayList<>();

    public void addComponent(ComputerDevice device) {
        components.add(device);
    }

    public int getPrice() {
        int price = 0;
        for(ComputerDevice device : components) {
            price += device.getPrice();
        }

        return price;
    }

    public int getPower() {
        int power = 0;
        for(ComputerDevice device : components) {
            power += device.getPower();
        }

        return power;
    }
}
