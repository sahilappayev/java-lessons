package com.company.generics;

public class Main {

    public static void main(String[] args) {

        // java 1.7
        // * -> ?
        Wrapper<Human , Person<String>> wrapper = new Wrapper<>();
        wrapper.setValue(new Person<>());
        wrapper.setKey(new Human());


        NewWrapper<Wrapper<Human , Person<String>> > newWrapper = new NewWrapper<>();
        newWrapper.object = wrapper;



//        User user = new User();
//
//        Person<User> person = new Person<>();
//        person.setValue(user);
//
//
//        User user1 = user.fillUser(new User(), person);
//
//        System.out.println(user1);

    }

}
