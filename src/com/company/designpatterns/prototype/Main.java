package com.company.designpatterns.prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        // Shallow copy vs deep copy
        Tree oak = new Tree();
        Tree tree1 = oak.clone();
        Tree tree2 = oak.clone();

        oak.getLeaves().add(new Leaf("Yellow"));
        tree2.getLeaves().add(new Leaf("Red"));

        System.out.println(oak);
        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(oak.hashCode());
        System.out.println(tree1.hashCode());
        System.out.println(tree2.hashCode());

    }
}
