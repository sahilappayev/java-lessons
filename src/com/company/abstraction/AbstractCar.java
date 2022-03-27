package com.company.abstraction;

import com.company.inheritance.Engine;

public abstract class AbstractCar {

    private String color;
    private Engine engine;
    private int maxSpeed;

    public int increaseMaxSpeed() {
        stopEngine();
        maxSpeed += 10;
        return maxSpeed;
    }

    public abstract void startEngine();

    public abstract void stopEngine();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
