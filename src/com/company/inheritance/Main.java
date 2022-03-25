package com.company.inheritance;

public class Main {

    public static void main(String[] args) {

        // heap -> object ve stack -> reference ve variable

        int[][] array = new int[5][]; // {null, null, {0,0,0},null ,null}
        array[2] = new int[3];

        // OOP --> 4 prinsip
        // Inheritance - varislik
        // Abstraction - umumileshdirme
        // Encapsulation - kapsullama ()
        // Polymorphism - choxshekillik


        // 'is a' - inheritance vs 'has a' - association
        // association ->  aggregation vs composition
        BMW a = new BMW("X6", 150000, "Yellow");
        a.maxSpeed = 320;
        a.setEnginePower(350);
//        a.printBMWDetails();

        // garbage collection --> referansi qirilmish obyektleri yaddashdan temizleyir
        // pass by value
//        BMW b = a;
        System.out.println("===========================");
        a = null;
//        a.printBMWDetails();
        // heap ve stack
        // reference


        int i = 124;
        Object obj = new Object();

        System.out.println(i);


    }
}
