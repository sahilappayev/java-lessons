package com.company.exceptions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // checked ( ) vs unchecked

        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter your name: ");
            String name = sc.nextLine();
            System.out.println("Name: " + name);
        }


        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Name: " + name);
        } finally {
            scanner.close();
        }


    }


    public static void foo(String s) {
        System.out.println(s);
    }


    public static void foo2() {

    }
}
