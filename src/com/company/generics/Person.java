package com.company.generics;

public class Person<D> extends User {

    private D value;

    public D getValue() {
        return value;
    }

    public void setValue(D value) {
        this.value = value;
    }
}
