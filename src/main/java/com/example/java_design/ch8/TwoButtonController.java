package com.example.java_design.ch8;

public class TwoButtonController {
    Command2 cmd1;
    Command2 cmd2;

    public TwoButtonController(Command2 cmd1, Command2 cmd2) {
        this.cmd1 = cmd1;
        this.cmd2 = cmd2;
    }

    public void setCmd1(Command2 cmd1) {
        this.cmd1 = cmd1;
    }

    public void setCmd2(Command2 cmd2) {
        this.cmd2 = cmd2;
    }

    public void button1Pressed() {
        cmd1.execute();
    }

    public void button2Pressed() {
        cmd2.execute();
    }
}
