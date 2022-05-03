package com.company.designpatterns.abstractfactory;

public class WindowsBox implements Box{

    private final String name = "WindowsBox";

    @Override
    public String toString() {
        return "WindowsBox{" +
                "name='" + name + '\'' +
                '}';
    }
}
