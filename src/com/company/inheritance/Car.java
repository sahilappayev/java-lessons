package com.company.inheritance;

public class Car extends Object {
    public String color;
    public int maxSpeed;
    // car has an engine -> composition
    public final Engine engine = new Engine();
    // car has a music player -> aggregation
    public MusicPlayer player;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public void setEnginePower(int power) {
        engine.power = power;
    }

    public void carDetails() {
        System.out.println("Color of the car is " + color + " max speed: " + maxSpeed);
        engine.printEngineDetails();
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + " { color: " + color + " maxSpeed: " + maxSpeed + " Engine: {enginePower: " + engine.power + "} }";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Car)) return false;
        Car car = (Car) obj;
        if ((this.color == car.color) &&
                (this.maxSpeed == car.maxSpeed) && (this.engine.power == car.engine.power)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.engine.power + this.maxSpeed + this.color.hashCode();
    }
}
