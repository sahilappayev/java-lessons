package com.company.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        // FIFO vs LIFO


    }


    public static void set(){
        // unordered
        Set<User> userSet = new HashSet<>();
        userSet.add(new User("Sahil", 26));
        userSet.add(new User("Aga", 15));
        userSet.add(new User("Ali", 50));
        userSet.add(new User("Gunel", 20));


//        for (User user: userSet){
//            System.out.println(user);
//        }

        Iterator<User> iterator = userSet.iterator();
//        for (int i = 0; i < userSet.size(); i++){
//            iterator.hasNext();
//            System.out.println(iterator.next());
//        }

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


//        SortedSet<User> sortedSet = new TreeSet<>(userSet);

//        System.out.println(userSet);

    }

    public static void map(){
        // unordered
        SortedMap<String, User> map = new TreeMap<>();
        map.put("aa", new User("Sahil", 26));
        map.put("bb", new User("Ali", 25));
        map.put("dd", new User("Aga", 32));
        map.put("f", new User("Aa", 17));

        User user1 = new User("Sahil", 26);
        User user2 = new User("Memmed", 35);

        System.out.println(Comparator.comparing(User::getAge).compare(user2, user2));


//        map.put("Second", new User("Gunel"));

//        System.out.println(map.getOrDefault("Second", new User("Default")));

//        System.out.println(map.entrySet());
//        System.out.println(map.keySet());

//        System.out.println(map);

        int index = "dsfdshf".hashCode() & (16 - 1); // [0 - 15]

        System.out.println("index: " + index);
    }

    public static void linkedList(){
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(5);
        integerLinkedList.add(10);
        integerLinkedList.add(15);

        for (int i = 0; i < integerLinkedList.size(); i++) {
            System.out.println(integerLinkedList.get(i));
        }
    }

    public static void queue() {
        // FIFO
        Queue<Integer> integerQueue = new PriorityQueue<>(3);
        integerQueue.add(5);
        integerQueue.add(10);
        integerQueue.add(15);

        System.out.println(integerQueue);
        System.out.println("=================");

        System.out.println(integerQueue.poll());

        System.out.println("=================");
        System.out.println(integerQueue);
    }

    public static void stack() {
        // LIFO
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(5);
        integerStack.push(10);
        integerStack.push(15);


        System.out.println(integerStack);
        System.out.println("=================");

        System.out.println(integerStack.search(25));

        System.out.println("=================");
        System.out.println(integerStack);
    }

    public static void arrayList() {
        //FIFO - First in first out
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
//        System.out.println("Size: " + integers.size());
//        integers.set(3, 45);
//        System.out.println("Size: " + integers.size());
//        // integers.remove(integers.size() - 1); // elementlerin dashinmasi olmayacaq
//        // integers.remove(new Integer(10)); // olacaq, chunki ortadan bir element silirik ve buna gore diger elementler 1 vahid surushdurulmelidir


        for (int i = integers.size() - 1; i >= 0; i--)
            System.out.println(integers.get(i));

//        for (Integer i: integers) {
//            System.out.println(i);
//        }
//
//        System.out.println(integers.get(3));
//
//        System.out.println(integers);
    }

    public static void iterator() {
        ArrayList<User> userArrayList = new ArrayList<>();
        userArrayList.add(new User("User1"));
        userArrayList.add(new User("User2"));
        userArrayList.add(new User("User3"));


        MyCollection<User> users = new MyCollection<>(userArrayList);

        Iterator<User> iterator = users.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
        for (User u : users) {
            System.out.println(u);
        }
    }

    public static void collections() {
        // static array
        Integer[] arr = new Integer[]{5, 10, 15, 25};

        arr[3] = 35;

        System.out.println(Arrays.toString(arr)); // hashcode

        Collection<Integer> collection = new ArrayList<>();

        collection.add(5);
        collection.add(10);
        collection.add(15);
        collection.add(25);
        collection.add(35);
        collection.remove(25);
        collection.removeAll(List.of(10, 15));
        collection.addAll(List.of(40, 45, 50));


        System.out.println(collection);
    }

}
