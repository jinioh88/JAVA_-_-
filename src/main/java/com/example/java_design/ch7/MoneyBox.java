package com.example.java_design.ch7;

public class MoneyBox {
    private int money = 0;

    public int getMoney() {
        return money;
    }

    public void insert(int money) {
        this.money += money;
    }

    public void dispense(int price) {
        this.money -= price;
    }

    public int returnMoney() {
        int temp = this.money;
        this.money = 0;

        return temp;
    }
}
