package com.company.enums;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter currency code: ");
        String s = scanner.nextLine();
        Currency currency = Currency.valueOf("AZN");

        if (Currency.AZN == currency) {
            System.out.println(Currency.AZN.getCountry());
        } else if (Currency.USD == currency) {
            System.out.println(Currency.USD.getCountry());
        } else {
            System.out.println("Wrong Code!");
        }


//        switch (currency) {
//            case AZN:
//                System.out.println(Currency.AZN.getCountry());
//                break;
//            case USD:
//                System.out.println(Currency.USD.getCountry());
//                break;
//            case TRY:
//                System.out.println(Currency.TRY.getCountry());
//                break;
//            default:
//                System.out.println("Wrong Code!");
//        }


//        Terminal terminal = new Terminal(new Car());
//        terminal.setName("Terminal");
//
//        Car car = terminal.getCar();
//        car.setColor("Red");
//        car.setMaxSpeed(320);
//
//        System.out.println(terminal.getName());
//        System.out.println(terminal.getCar().getColor());
//        System.out.println(terminal.getCar().getMaxSpeed());
//
//        car.setColor("Yellow");
//
//
//        System.out.println(terminal.getName());
//        System.out.println(terminal.getCar().getColor());
//        System.out.println(terminal.getCar().getMaxSpeed());

        // 1 < 0 --> -1

        Currency[] values = Currency.values();

        Currency.valueOf("AZN");

        for (int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }

    }

}
