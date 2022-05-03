package com.company.designpatterns.abstractfactory;

public class LinuxButton implements Button {

    private final String name = "LinuxButton";


    @Override
    public String toString() {
        return "LinuxButton{" +
                "name='" + name + '\'' +
                '}';
    }
}
