package com.company.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class CarFactoryImpl implements CarFactory {
    @Override
    public Car getCar() {
        Wheel wheel1 = new Wheel();
        Wheel wheel2 = new Wheel();
        Wheel wheel3 = new Wheel();
        Wheel wheel4 = new Wheel();

        List<Wheel> wheels = new ArrayList<>();
        wheels.add(wheel1);
        wheels.add(wheel2);
        wheels.add(wheel3);
        wheels.add(wheel4);
        Car car = new Car();
        car.setWheels(wheels);
        return car;
    }
}
