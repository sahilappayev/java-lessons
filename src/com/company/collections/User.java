package com.company.collections;

import java.util.Objects;

public class User implements /*Comparator<User>*/  Comparable<User> {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public int compare(User o1, User o2) {
//        if (o1 == null) return -1;
//        else if (o2 == null) return 1;
//
//        if (o1.age > o2.age) return 1;
//        else if (o1.age < o2.age) return -1;
//        return 0;
//    }

    @Override
    public int compareTo(User o) {
        if (o == null) return 1;
        // return +
        // return -
        // 0
        if (this.age > o.age) return 1;
        else if (this.age < o.age) return -1;
        return 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
