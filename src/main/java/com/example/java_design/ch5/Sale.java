package com.example.java_design.ch5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sale {
    private List<Item> items = new ArrayList<>();
    private Printer printer = new HD10RecitPrinter();

    public void printReceipt() {
        Iterator<Item> iter = items.iterator();
        StringBuffer buf = new StringBuffer();
        while(iter.hasNext()) {
            Item item = iter.next();
            buf.append(item.getName());
            buf.append(item.getPrice());
        }
        printer.print(buf.toString());
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public void add(Item item) {
        items.add(item);
    }

    public static void main(String[] args) {
        Sale sale = new Sale();
        sale.add(new Item("과자", 1500));
        sale.printReceipt();

        sale.setPrinter(new BasicPrinter());
        sale.printReceipt();

    }
}
