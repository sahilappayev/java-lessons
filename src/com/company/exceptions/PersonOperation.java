package com.company.exceptions;

public class PersonOperation {

    public static void main(String[] args) throws Exception {

        Person person = new Person();
        person.setFullName("Sahil");
        person.setAge(26);

        System.out.println(person);

        findById(25);

    }


    public static Car findById(int id) {
        throw new CustomNotFoundException(Car.class, id);
    }

}
