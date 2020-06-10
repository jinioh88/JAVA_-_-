package com.example.java_design.ch13;

import com.example.java_design.ch11.DoorStatus;

public abstract class Door {
    private DoorStatus doorStatus;

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public void close() {
        if(doorStatus == DoorStatus.CLOSED) {
            return;
        }

        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doClose();

    public void open() {
        if(doorStatus == DoorStatus.OPENED) {
            return;
        }

        doOpen();
        doorStatus = DoorStatus.OPENED;
    }

    protected abstract void doOpen();
}
