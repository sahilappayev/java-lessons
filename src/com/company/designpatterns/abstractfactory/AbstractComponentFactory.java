package com.company.designpatterns.abstractfactory;

public abstract class AbstractComponentFactory {

    public static ComponentFactory getWindowsComponentFactory() {
        return new WindowsComponentFactory();
    }

    public static ComponentFactory getLinuxComponentFactory() {
        return new LinuxComponentFactory();
    }
}
