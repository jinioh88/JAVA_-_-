package com.example.java_design.ch8;

public class MuteCommand implements Command2 {
    private TV tv;

    public MuteCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.mute();
    }
}
