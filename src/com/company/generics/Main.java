package com.company.generics;

public class Main {

    public static void main(String[] args) {

        // java 1.7
        // * -> ?
        Wrapper<Integer , User> wrapper = new Wrapper();

        User user = new User();

        Person<User> person = new Person<>();
        person.setValue(user);


        User user1 = user.fillUser(new User(), person);

        System.out.println(user1);

    }

}
