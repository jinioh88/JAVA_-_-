package com.example.java_design.ch5;

public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        taekwonV.setAttackStrategy(new MissileStrategy());
        taekwonV.setMovingStrategy(new WalkingStrategy());

        Robot atom = new Atom("Atom");
        atom.setAttackStrategy(new PunchStrategy());
        atom.setMovingStrategy(new FlyingStrategy());

        System.out.println(taekwonV.getName());
        taekwonV.attack();
        taekwonV.move();

        System.out.println();

        System.out.println(atom.getName());
        atom.attack();
        atom.move();
    }
}
