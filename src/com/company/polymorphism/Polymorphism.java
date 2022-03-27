package com.company.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {

        // Polymorphism --> choxshekillik, choxformamililiq

//        MathTeacher mathTeacher = new MathTeacher();
//        mathTeacher.setName("Ali");
//        mathTeacher.setProfession("Math");
//        mathTeacher.teach();
//
//
//        EnglishTeacher englishTeacher = new EnglishTeacher();
//        englishTeacher.setName("Aliye");
//        englishTeacher.setProfession("English");
//        System.out.println(englishTeacher.increaseLevel());
//
//        // upcasting
//        Teacher teacher = englishTeacher; // subclass cast to super class
//
//        int i = 5;
//        long l = i; // upcasting
//
//        long ll = 5;
//        int ii = (int) ll; // down casting
//
//        // down casting
//        EnglishTeacher newEnglishTeacher = (EnglishTeacher) teacher; // super class cast to subclass
//        System.out.println(newEnglishTeacher.increaseLevel(2));
//
//        course(englishTeacher);

        findSecondMinAndMax();
    }

    public static void course(Teacher teacher) {
        // Teacher -> MathTeacher
        teacher.teach();
    }


    public static void findSecondMinAndMax() {
        int[] arr = {-18, 7, 3, 15, 0, -17};

        int firstMin = arr[0]; // -18 -18 -18 -18 -18
        int secondMin = arr[0]; // -18 7 3 0 -17

        for (int i = 0; i < arr.length; i++) {
            // 1 - 18
            // 2 - 7
            // 3 - 3
            // 4 - 15
            // 5 - 0
            // 6 - -17
            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            }else if (firstMin == secondMin || arr[i] < secondMin){
                secondMin = arr[i];
            }
        }
        System.out.println(firstMin);
        System.out.println(secondMin);
    }


}
