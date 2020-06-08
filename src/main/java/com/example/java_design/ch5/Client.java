package com.example.java_design.ch5;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        System.out.println(taekwonV.getName());
        taekwonV.attack();
        taekwonV.move();

        System.out.println();

        System.out.println(atom.getName());
        atom.attack();
        atom.move();
    }
}
