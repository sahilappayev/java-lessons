package com.company.abstraction;


// car is a Runnable
public class Car extends AbstractCar implements Benzinli, Elektrikli, Runnable {

    @Override
    public void startEngine() {
        if (super.getEngine() == null) throw new RuntimeException("Car engine must be implemented!");
        System.out.println("Car engine is starting...");
    }

    @Override
    public void stopEngine() {
        if (super.getEngine() == null) throw new RuntimeException("Car engine must be implemented!");
        System.out.println("Car engine is stopping...");
    }

    @Override
    public void fullDepo() {
        System.out.println("Fulling car depo...");
    }

    @Override
    public void fullBattery() {
        System.out.println("Fulling car battery...");
    }
}
