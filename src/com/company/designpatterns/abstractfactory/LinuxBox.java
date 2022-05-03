package com.company.designpatterns.abstractfactory;

public class LinuxBox implements Box {

    private final String name = "LinuxBox";

    @Override
    public String toString() {
        return "LinuxBox{" +
                "name='" + name + '\'' +
                '}';
    }
}
