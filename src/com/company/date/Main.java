package com.company.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {


        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy hh:mm");

        Date date1 = format.parse("15.04.2021 15:42");

        System.out.println(date);
        System.out.println(date1);
        System.out.println(date.before(date1));
        System.out.println(date.after(date1));
        System.out.println(date1.compareTo(date));

        date.setTime(155364555457L);

        System.out.println(date);

        LocalDate localDate = LocalDate.ofInstant(date.toInstant(), ZoneId.systemDefault());
        LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());

        System.out.println(localDate);
        System.out.println(localDateTime);


    }

}
