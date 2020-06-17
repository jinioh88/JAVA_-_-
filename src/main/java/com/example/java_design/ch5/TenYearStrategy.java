package com.example.java_design.ch5;

public class TenYearStrategy implements AddPriceStrategy {
    @Override
    public void addPrice() {
        System.out.println("10년 책 할인!");
    }
}
