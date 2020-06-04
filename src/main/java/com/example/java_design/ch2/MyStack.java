package com.example.java_design.ch2;

import javax.swing.plaf.basic.BasicLabelUI;
import java.util.ArrayList;

public class MyStack<String> {
    private ArrayList<String> arList = new ArrayList<>();

    public void push(String element) {
        arList.add(element);
    }

    public String pop() {
        return arList.remove(arList.size() - 1);
    }
}
