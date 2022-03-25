package com.company.inheritance;

public class MyInteger {

    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public static MyInteger valueOf(int i) {
        MyInteger integer = new MyInteger(i);
        return integer;
    }

    public void increment() {
        this.value++;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
