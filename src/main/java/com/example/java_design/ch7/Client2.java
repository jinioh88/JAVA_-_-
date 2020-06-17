package com.example.java_design.ch7;

public class Client2 {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5, 1000);

        vendingMachine.insertMoney(1000);
        vendingMachine.insertMoney(500);
        vendingMachine.pushButton();
        vendingMachine.returnMoney();
    }
}
