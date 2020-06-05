package com.example.java_design.ch3;

public class Main {
    public static void main(String[] args) {
        Kid kid = new Kid();
        Toy toy = new Robot();
        kid.setToy(toy);
        kid.play();
    }
}
