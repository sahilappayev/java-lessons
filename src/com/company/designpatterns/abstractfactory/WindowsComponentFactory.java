package com.company.designpatterns.abstractfactory;

public class WindowsComponentFactory implements ComponentFactory {
    @Override
    public Box getBox() {
        return new WindowsBox();
    }

    @Override
    public Button getButton() {
        return new WindowsButton();
    }
}
