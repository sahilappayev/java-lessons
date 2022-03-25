package com.company.polymorphism;

import com.company.inheritance.Car;

public class Main {

    /**
     * Reflexive : her hansi referans deyishen a uchun, a.equals(a) true olmalidir. +
     * Symmetric : her hansi referans deyishen a ve b uchun, eger a.equals(b) true-dursa onda b.equals(a) da true olmalidir. +
     * Transitive : her hansi referans deyishen a, b, ve c uchun,  eger a.equals(b) ve b.equals(c) true-dursa, a.equals(c) da true olmalidir. +
     * Consistent : her hansi referans deyishen a ve b uchun, a.equals(b) funksiyasının çoxsaylı çağırışları ardıcıl olaraq true
     * və ya false qaytarmalidir, obyekt uzre beraberlik yoxlamsinda istifadə olunan heç bir məlumat dəyişdirilmədiyi təqdirdə +
     * Not: her hansi non-null referans deyishen a uchun, a.equals(null) false qaytarmalidir.
     *  a.equals(b) --> true
     *  a.hashCode() == b.hashCode() --> mutleq
     *
     *  a.equals(b) --> false
     *  a.hashCode() == b.hashCode() --> ola biler
     */

    public static void main(String[] args) {

        // heap ve stack

        Object o = new Object();
        o.toString(); // obyetin string fomratda output verir
        o.equals(o); // obyektlerin xususiyyetlerine gore bizim teyin etdiyimiz sertler daxilinde eyniliyin yoxlamaq uchun
        o.hashCode(); // mecburuq


        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(""); // synchronized -> thread safe


//        String s = "FB";
//        String ss = "Ea";
//
//        System.out.println(s.equals(ss));
//        System.out.println();
//        System.out.println(ss.hashCode());



        Car car = new Car(); // 1-ci referans
        car.color = "FB";
        car.maxSpeed = 300;
        car.engine.power = 450;

        Car car1 = new Car(); // 2-ci referans
        car1.color = "Ea";
        car1.maxSpeed = 300;
        car1.engine.power = 450;

        Boolean b = car.equals(car1);

        System.out.println(car.hashCode());
        System.out.println(car1.hashCode());
        System.out.println(b);
        System.out.println(car);
    }

}
