package com.company.classes;

import java.io.Serializable;

public class Human {
//    static {
//        System.out.println("Class loaded and static block called!");
//    }
//
//    {
//        System.out.println("Class loaded and non-static block called!");
//    }
//
//    public Human() {
//        System.out.println("Called constructor method!");
//    }

    public static int a = 15;


    public static void foo() {

    }

    // nested class - static
    // inner class - instance
    protected static class Person extends Human implements Serializable {

        private String name;
        private int age;
        private String hobby;

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age < 0) {
                throw new RuntimeException("Age cant be less zero!");
            }
            this.age = age;
        }

        public String getHobby() {
            return hobby;
        }

        public void setHobby(String hobby) {
            this.hobby = hobby;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }


}
