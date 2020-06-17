package com.example.java_design.ch7;

public interface VendingState {
    void insertMoney(int money);
    void pushButton(int price);
    void returnMoney();
}
