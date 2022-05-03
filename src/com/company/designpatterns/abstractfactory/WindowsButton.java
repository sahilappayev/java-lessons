package com.company.designpatterns.abstractfactory;

public class WindowsButton  implements Button{

    private final String name = "WindowsButton";

    @Override
    public String toString() {
        return "WindowsButton{" +
                "name='" + name + '\'' +
                '}';
    }
}
