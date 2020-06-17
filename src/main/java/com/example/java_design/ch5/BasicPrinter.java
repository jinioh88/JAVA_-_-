package com.example.java_design.ch5;

public class BasicPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Basic Printer : " + message);
    }
}
