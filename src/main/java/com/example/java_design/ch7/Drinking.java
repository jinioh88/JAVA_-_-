package com.example.java_design.ch7;

public class Drinking {
    private int price;
    private int stock;

    public Drinking(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
