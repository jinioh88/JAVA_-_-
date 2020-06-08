package com.example.java_design.ch7;

import java.time.OffsetDateTime;

public class OFF implements State {
    private static OFF off = new OFF();
    private OFF() {}

    public static OFF getInstance() {
        return off;
    }

    @Override
    public void off_button_pushed(Light light) {
        System.out.println("반응 없음");
    }

    @Override
    public void on_button_pushed(Light light) {
        System.out.println("Light On!");
        light.setState(ON.getInstance());
    }
}
