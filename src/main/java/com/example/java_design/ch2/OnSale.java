package com.example.java_design.ch2;

public class OnSale extends DiscountMode {
    @Override
    protected double getDiscountRate() {
        return 0.1;
    }
}
