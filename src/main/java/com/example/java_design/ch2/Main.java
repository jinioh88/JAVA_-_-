package com.example.java_design.ch2;

public class Main {
    public static void main(String[] args) {
        Song s1 = new Song();
        s1.setMode(new NonDiscounted());

        Song s2 = new Song();
        s2.setMode(new OnSale());

        CartSongs cartSongs = new CartSongs();
        cartSongs.add(s1);
        cartSongs.add(s2);

        System.out.println(cartSongs.calculateTotalPrice());
    }
}
