package com.company.classes;

import java.util.Arrays;

public class Main {


    /**
     * 1. a.equals(b), b.equals(a) --> true
     * 2. a.equals(a) --> true
     * 3. a.equals(b), b.equals(c) --> a.equals(c) -->true
     * 4. a.equals(b) --> true or false
     * a.equals(null) --> false
     *
     *
     * if (a.equals(b))
     * a.hashcode() == b.hashcode()
     */
    public static void main(String[] args) {

        /**
         * 1 - static block (class block)
         * 2 - non-static block (instance block)
         * 3 - constructor method
         */

        // POJO -> Plain old java object
        // Bean -> private, get and set methods, Serializable


//        Human.Person person = new Human.Person();
//        person.setName("Ali");
//        person.setAge(15);
//
//        System.out.println(person);


        System.out.println(new Object());

        System.out.println("Hashcode :       "+new String("FB").hashCode());
        System.out.println("Hashcode :       "+System.identityHashCode(new String("FB")));
        System.out.println("Hashcode (HEX) : "+Integer.toHexString("FB".hashCode()));

        System.out.println("=========================================================");

        System.out.println("Hashcode :       "+new String("FB").hashCode());
        System.out.println("Hashcode :       "+System.identityHashCode(new String("FB")));
        System.out.println("Hashcode (HEX) : "+Integer.toHexString("Ea".hashCode()));


    }


    public static void printFrequentlyWords(){
        String sentence = "Big black bug bit a big black dog on his big black nose";

        sentence = sentence.replaceAll("[ ]", ".");


        System.out.println(sentence);

        String[] arr = sentence.split("[.]");

        System.out.println(arr.length);

        Arrays.stream(arr).forEach(System.out::println);


    }


}
