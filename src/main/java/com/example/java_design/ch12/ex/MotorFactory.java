package com.example.java_design.ch12.ex;

public class MotorFactory {
    public static Motor getMotor(MotorVendorID id) {
        Motor motor = null;

        switch (id) {
            case LG:
                motor = new LGMotor();
                break;
            case HYUNDAI:
                motor = new HyundaiMotor();
                break;
        }

        return motor;
    }
}
