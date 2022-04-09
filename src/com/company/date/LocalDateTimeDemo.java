package com.company.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateTimeDemo {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2021, 7, 15, 12, 45);


        System.out.println(localDateTime.getMinute());


        // LocalDateTIme to Date
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(date);

    }

}
