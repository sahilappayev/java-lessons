package com.company.date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class LocalDateDemo {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthdate (yyyy.MM.dd): ");
        String birthdate = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");

        LocalDate localDate = LocalDate.parse(birthdate, formatter);

        System.out.println(localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.getMonth());


        // LocalDate to Date
        Date date = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        System.out.println(date);
        System.out.println(localDate.getDayOfMonth() + " " + localDate.getMonthValue() + " " + localDate.getYear());
        System.out.println(localDate.getDayOfWeek() + " " + localDate.getMonth() + " " + localDate.getYear());
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("yyyy")));


    }

}
