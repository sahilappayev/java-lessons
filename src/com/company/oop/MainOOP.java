package com.company.oop;

import static com.company.client.Human.anything;
import static com.company.client.Human.breathe;

public class MainOOP {

    public static void main(String[] args) {

        // heap ve Stack --> pass by value

        // public, private, protected and default (Yazilmir)

        // array bir obyektdir --> null

        int[][] arr = new int[3][]; //   {null, null, null} -->  {{0,0}, null, {0,0,0,0,0}
        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[5];
        arr[1] = null;


        // public - her yerden elchatandir
        // private - ancaq hemin classin daxilinde
        // protected - hemin package ve extend olundugu class
        // default - ancaq hemin package daxilinde elchatandir.


        breathe();
        anything = "Foo";
        System.out.println(anything);


//        Human human = new Human();
//
//        int a = 15;
//
//        fillHuman(human);
//
//        System.out.println("Name: " + human.name + " age: " + human.age);
//
//        human.age = 15;
//        human.name = "Ali";
//
//        System.out.println("Name: " + human.name + " age: " + human.age);

    }

//    public static void fillHuman(Human human) {
//        human.age = 29;
//        human.name = "Vali";
//    }

}

