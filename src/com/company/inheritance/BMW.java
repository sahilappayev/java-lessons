package com.company.inheritance;


// BMW - subclass, CAR - superclass
public class BMW extends Car {

    public String name;
    public int price;

    public BMW() {
        super("");
        this.name = "";
        super.player = new MusicPlayer();
    }

    public BMW(String name) {
        this.name = name;
    }

    public BMW(String name, int price) {
        this(name);
        this.price = price;
    }

    public BMW(String name, int price, String color){
        this(name, price);
        super.color = color;

    }

    public void printBMWDetails() {
        System.out.println("The car name is " + name);
        super.carDetails();
    }
}
