package com.example.java_design.ch5;

public class Book {
    private String name;
    private int year;
    private int price;

    public Book(String name, int year, int price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }
}
