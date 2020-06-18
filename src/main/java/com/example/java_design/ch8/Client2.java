package com.example.java_design.ch8;

public class Client2 {
    public static void main(String[] args) {
        TV tv = new TV();
        Command2 cmd1 = new PowerCommand(tv);
        Command2 cmd2 = new MuteCommand(tv);
        TwoButtonController controller = new TwoButtonController(cmd2, cmd1);

        controller.button1Pressed();
        controller.button2Pressed();
        controller.button1Pressed();
        controller.button1Pressed();
        controller.button2Pressed();
        controller.button1Pressed();
    }
}
