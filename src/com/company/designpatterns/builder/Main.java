package com.company.designpatterns.builder;

public class Main {

    public static void main(String[] args) {

        User user = User.builder()
                .name("Sahil")
                .surname("Appayev")
                .email("sahilappayev@gmail.com")
                .age(26)
                .build();

        System.out.println(user);
    }

}
