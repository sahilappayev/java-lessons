package com.company.exceptions;

public class Person {

    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) throws Exception {
        if (fullName.length() < 5 || fullName.length() > 45)
            throw new Exception("Person name length must be in the 5-45 interval!");
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) throw new InvalidAgeException("Person age must be over than zero!");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
