package com.company.enums;

public class Terminal {

    private String name;
    private final Car car;

    public Terminal(Car car) {
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }
}
