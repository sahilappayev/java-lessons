package com.company.annotations;

public @interface Date {

    int day() default 1;

    int month() default 1;

    int year() default 1970;

}
