package com.example.java_design.ch3;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class PayrollManager {
    private ArrayList<Toy> toys = new ArrayList<>();
    protected abstract void writePayment(int amount);
    int total = 0;

    public void calculateTotalToyPay() {
        Iterator<Toy> iter = toys.iterator();

        while(iter.hasNext()) {
            Toy toy = iter.next();
            total += total + toy.caculatePay();
            writePayment(total);
        }
    }
}
