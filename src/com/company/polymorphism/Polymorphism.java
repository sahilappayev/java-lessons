package com.company.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        // Polymorphism --> choxshekillik, choxformamililiq

        MathTeacher mathTeacher = new MathTeacher();
        mathTeacher.setName("Ali");
        mathTeacher.setProfession("Math");
        mathTeacher.teach();


        EnglishTeacher englishTeacher = new EnglishTeacher();
        englishTeacher.setName("Aliye");
        englishTeacher.setProfession("English");
        System.out.println(englishTeacher.increaseLevel());

        // down casting
        Teacher teacher = englishTeacher; // subclass reference

        // upcasting
        EnglishTeacher newEnglishTeacher = (EnglishTeacher) teacher;
        System.out.println(newEnglishTeacher.increaseLevel(2));

        course(englishTeacher);
    }

    public static void course(Teacher teacher){
        // Teacher -> MathTeacher
        teacher.teach();
    }

}
