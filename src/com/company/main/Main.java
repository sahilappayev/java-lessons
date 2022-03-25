package com.company.main;

public class Main {

    public static void main(String[] args) {

        // heap vs stack ----> pass by value
        int[] arr = new int[6];
        arr[0] = 15;
        arr[1] = 5;
        arr[2] = 97;
        arr[3] = -14;
        arr[4] = 875;
        arr[5] = 83;


        System.out.println(palindrome(14541));

    }

    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int randomNum = (int) (Math.random() * 100);
            arr[i] = randomNum;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static boolean palindrome(int number) {
        int[] arr = new int[(number + "").length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = number % 10;
            number = number / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
            if (i == (arr.length - 1) - i) return true;
        }
        return true;
    }


}
