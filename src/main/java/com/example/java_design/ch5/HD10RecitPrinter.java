package com.example.java_design.ch5;

public class HD10RecitPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Hd10 : " + message);
    }
}
