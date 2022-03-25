package com.company.service;

public class ArrayCompare {


    public static void main(String[] args) {

        // Daxil edilen array daxilinde bir-birine beraber olan ededlerin indekslerin cap etmek.
        // { 1,5,15,5,17,15,5} - >  [1] == [3], not [3] == [1], may [3]  == [6]10.
        // Daxil edilen array daxilinde bir-birine beraber olan ededlerin indekslerin cap etmek.
        // { 1,5,15,5,17,15,5} - >  [1] == [3], not [3] == [1], may [3]  == [6]

        int[] arr = {1, 5, 15, 5, 17, 15, 5};
//
//        ArrayCompare compare = new ArrayCompare();
//        compare.compareArrayElements(arr);


//        int index;
//        System.out.println("Enter length of array:");
//        Scanner scanner=new Scanner(System.in);
//        int count=scanner.nextInt();
//        int [] array=new int[count];
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(i + " no element:");
//            int newValue = scanner.nextInt();
//            array[i] = newValue;
//        }
        for (int i = 0; i < arr.length; i++) {
            // arr[i] == arr[i+1] (i+1) < arr.length
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(i + " i-ci element: " + arr[i] + ", " + j + " , j-ci element: " + arr[j]);
                }
            }
        }


    }


    public void compareArrayElements(int[] arr) {
        // arr[i] == arr[i+1] (i+1 < arr.length)
        // {1, 5 [1], 15 [2], 5 [3], 17, 15 [5], 5 [6]};
        for (int i = 0; i < arr.length; i++) {
            // 1, i = 0
            for (int j = i + 1; j < arr.length; j++) {
                // 1 - > i = 0 , j = 1
                //
                if (arr[i] == arr[j]) {
                    System.out.println("i= " + i + " j= " + j);
                }
            }
        }
    }

}
