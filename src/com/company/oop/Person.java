package com.company.oop;

import com.company.client.Human;

public class Person extends Human {

    public static void main(String[] args) {
        Human.protectedString = "";

        Person person = new Person();
        person.protectedStringObj = "";

    }

}
