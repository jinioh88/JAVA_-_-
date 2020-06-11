package com.example.java_design.ch2;

import java.util.ArrayList;
import java.util.Iterator;

public class CartSongs {
    private ArrayList<Song> cart = new ArrayList<>();

    public double calculateTotalPrice() {
        double total = 0.0;
        Iterator<Song> iter = cart.iterator();

        while(iter.hasNext()) {
            Song s = iter.next();
            total += s.getPrice();
        }

        return total;
    }

    public void add(Song song) {
        cart.add(song);
    }
}
