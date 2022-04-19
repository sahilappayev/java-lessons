package com.company.annotations;

import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {


        User<String> user = new User<>();

        TypeVariable<Method>[] typeParameters = user.getClass()
                .getMethod("getName", Object.class)
                .getTypeParameters();

        for (TypeVariable typeVariable : typeParameters) {
            MyAnnotation annotation = typeVariable.getAnnotation(MyAnnotation.class);
            System.out.println("Value: " + annotation.value() + "    size: " +
                    annotation.size() + "  message: " + annotation.message() + " date: " + annotation.date() +
                    " arr: " + annotation.arr());
        }


//        User user = new User();
//
//        Class<? extends User> userClass = user.getClass();
//
//        for (Annotation a : userClass.getAnnotations()){
//
//            System.out.println(a);
//
//            if (a.annotationType().equals(MyAnnotation.class)){
//                System.out.println("MyAnnotation is used...");
//            }
//        }
//
//
//        System.out.println("===================================");
//
//        Package aPackage = userClass.getPackage();
//
//        for (Annotation a: aPackage.getAnnotations()){
//            System.out.println(a);
//        }

    }

}
