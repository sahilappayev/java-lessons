package com.company.exceptions;

public class CustomNotFoundException extends RuntimeException {

    public CustomNotFoundException(Class aClass, Object id) {
        super(id + "-idli " + aClass.getSimpleName() + " tapilmadi!");
    }

}
