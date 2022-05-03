package com.company.designpatterns.factorymethod;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactoryImpl();

        Car car = carFactory.getCar();

        Car car1 = carFactory.getCar();

        System.out.println(car);
        System.out.println(car1);
    }

}
