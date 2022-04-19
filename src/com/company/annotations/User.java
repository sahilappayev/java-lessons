package com.company.annotations;

public class User<T> {

    private String name;
    private int age;

    public <@MyAnnotation(value = "Sahil", size = 15, date = Date.class) T> Object getName(T t) {
        return name + t;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
