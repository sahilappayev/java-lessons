package com.company.designpatterns.abstractfactory;

public class Main {

    public static void main(String[] args) {

        ComponentFactory componentFactory = AbstractComponentFactory.getLinuxComponentFactory();

        Box box = componentFactory.getBox();
        Button button = componentFactory.getButton();

        System.out.println(box);
        System.out.println(button);

    }

}
