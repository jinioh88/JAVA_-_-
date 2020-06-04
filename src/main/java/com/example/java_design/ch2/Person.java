package com.example.java_design.ch2;

public class Person {
    public Role r;

    public Role getR() {
        return r;
    }

    public void setR(Role r) {
        this.r = r;
    }

    public void doIt() {
        r.doIt();
    }
}
