package com.company.client;

public class Human {

    public static String anything;
    public int age;
    public String name;
    protected static String protectedString;
    private static String privateString;
    static String defaultString;

    protected String protectedStringObj;

    private String privateStringObj;
    String defaultStringObj;

    public static void breathe() {
        System.out.println("Human is breathing...");
    }

    public void run() {
        System.out.println(name + " is running...");
    }

}
