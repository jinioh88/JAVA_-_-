package com.example.java_design.ch8.ele;

import com.example.java_design.ch8.Command2;

public class ElevatorButton {
    private Command2 command;

    public ElevatorButton(Command2 command) {
        this.command = command;
    }

    public void pressed() {
        command.execute();
    }
}
