package com.company.designpatterns.abstractfactory;

public class LinuxComponentFactory implements ComponentFactory{
    @Override
    public Box getBox() {
        return new LinuxBox();
    }

    @Override
    public Button getButton() {
        return new LinuxButton();
    }
}
