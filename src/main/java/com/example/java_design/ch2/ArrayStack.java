package com.example.java_design.ch2;

import java.util.ArrayList;

public class ArrayStack {
    public ArrayList<Integer> items;
    public int stackSize;

    public ArrayStack(int stackSize) {
        this.items = new ArrayList<>(stackSize);
        this.stackSize = stackSize;
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public boolean isFull() {
        return (items.size() == stackSize - 1);
    }

    public void push(int item) {
        if(isFull()) {

        } else {
            items.add(item);
        }
    }

    public int pop() {
        if(isEmpty()) {
            return -1;
        } else {
            return items.remove(items.size() - 1);
        }
    }

    public int peek() {
        if(isEmpty()) {
            return -1;
        } else {
            return items.get(items.size() - 1);
        }
    }

    public static void main(String[] args) {
        ArrayStack st = new ArrayStack(10);
        st.push(20);
        System.out.println(st.peek());
    }
}
