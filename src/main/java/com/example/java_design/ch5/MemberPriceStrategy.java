package com.example.java_design.ch5;

public class MemberPriceStrategy implements AddPriceStrategy {
    @Override
    public void addPrice() {
        System.out.println("회원 할인");
    }
}
