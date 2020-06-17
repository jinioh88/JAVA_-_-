package com.example.java_design.ch7;

public class VendingMachine {
    private VendingState state;
    private MoneyBox moneyBox;
    private Drinking drinking;

    public VendingMachine(int stock, int price) {
        moneyBox = new MoneyBox();
        drinking = new Drinking(price, stock);

        if(drinking.getStock() > 0) {
            state = new NoMoneyState();
        } else {
            state = new SoldOutState();
        }
    }

    public void setState(VendingState state) {
        this.state = state;
    }

    public void insertMoney(int money) {
        this.state.insertMoney(money);
    }

    public void pushButton() {
        this.state.pushButton(drinking.getPrice());
    }

    public void returnMoney() {
        state.returnMoney();
    }

    public VendingState getState() {
        return state;
    }

    public MoneyBox getMoneyBox() {
        return moneyBox;
    }

    public Drinking getDrinking() {
        return drinking;
    }
}
