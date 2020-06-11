package com.example.java_design.ch2;

import java.util.LinkedList;

public class Queue<String> {
    private LinkedList<String> linkedList = new LinkedList<>();

    public boolean addQueue(String element) {
        return linkedList.offer(element);
    }

    public String removeQueue() {
        return linkedList.remove();
    }

    public String peekQueue() {
        return linkedList.peek();
    }
}
