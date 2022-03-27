package com.company.abstraction;

import com.company.inheritance.Engine;

public class Main {

    public static void main(String[] args) {
        // anonymous class
//        AbstractCar car = new AbstractCar() {
//            @Override
//            public void startEngine() {
//                System.out.println("Anonymous car engine starting...");
//            }
//
//            @Override
//            public void stopEngine() {
//                System.out.println("Anonymous car engine stopping...");
//            }
//        }; // is a relation (inheritance)

        Car car = new Car();

        // Marker interface

        car.setColor("Red");
        car.setEngine(new Engine());
        car.setMaxSpeed(320);

        process(car);

        car.fullBattery();

        System.out.println(Benzinli.name);

    }


    public static void process(Benzinli benzinli){
        benzinli.fullDepo();
    }

}
