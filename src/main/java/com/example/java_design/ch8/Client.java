package com.example.java_design.ch8;

public class Client {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Command lampCommand = new LampCommand(lamp);

        Button button1 = new Button(lampCommand);
        button1.press();

        Command lampOffCommand = new LampOffCommand(lamp);
        button1.setCommand(lampOffCommand);
        button1.press();

        Alarm alarm = new Alarm();
        Command alarmCommand = new AlarmOnCommand(alarm);
        Button button2 = new Button(alarmCommand);
        button2.press();

        button2.setCommand(lampCommand);
        button2.press();
    }
}
