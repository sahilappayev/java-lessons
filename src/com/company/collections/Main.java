package com.company.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    }

    public static void arrayList(){
        // dynamic array
        // default capacity = 10
        // Object[] arr = new Object[10];
        // size++;
        // newCapacity = oldCapacity + (oldCapacity / 2)
        // [       ]  unvan = arr.reference + (index * element.memory)
        // optimaldir get emeliyyatlarinda
        // optimal deyil delete, insert
        List<Integer> integers = new ArrayList<>();
        integers.add(5); // 1
        integers.add(10); // 2
        integers.add(15); // 3 null
        integers.add(35);
        integers.add(15);
        integers.add(15);
        integers.add(15);
        integers.add(15);
        integers.add(15);
        integers.add(15);
        integers.add(15);
        integers.add(15);
        System.out.println("Size: " + integers.size());
        integers.set(3, 45);
        System.out.println("Size: " + integers.size());
        // integers.remove(integers.size() - 1); // elementlerin dashinmasi olmayacaq
        // integers.remove(new Integer(10)); // olacaq, chunki ortadan bir element silirik ve buna gore diger elementler 1 vahid surushdurulmelidir

        System.out.println(integers.get(3));

        System.out.println(integers);
    }

    public static void iterator(){
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("User1"));
        userArrayList.add(new User("User2"));
        userArrayList.add(new User("User3"));



        MyCollection<User> users = new MyCollection<>(userArrayList);

        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
        for (User u : users){
            System.out.println(u);
        }
    }

    public static void collections(){
        // static array
        Integer[] arr = new Integer[]{5,10,15,25};

        arr[3] = 35;

        System.out.println(Arrays.toString(arr)); // hashcode

        Collection<Integer> collection = new ArrayList<>();

        collection.add(5);
        collection.add(10);
        collection.add(15);
        collection.add(25);
        collection.add(35);
        collection.remove(25);
        collection.removeAll(List.of(10,15));
        collection.addAll(List.of(40,45,50));


        System.out.println(collection);
    }

}
