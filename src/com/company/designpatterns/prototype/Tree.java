package com.company.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Tree implements Cloneable {

    private String color;
    private List<Leaf> leaves;

    public Tree() {
        this.color = DBService.getObjectInfo();
        List<Leaf> leaves = new ArrayList<>();
        leaves.add(new Leaf(this.color));
        leaves.add(new Leaf(this.color));
        leaves.add(new Leaf(this.color));
        this.leaves = leaves;
    }

    private Tree(Tree tree){
        // oak
        this.color = tree.color;
        this.leaves = new ArrayList<>(tree.leaves);
    }

    @Override
    protected Tree clone() throws CloneNotSupportedException {
        // oak.clone()
        return new Tree(this);
    }

    @Override
    public String toString() {
        return "Tree{" +
                "color='" + color + '\'' +
                ", leaves=" + leaves +
                '}';
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Leaf> getLeaves() {
        return leaves;
    }

    public void setLeaves(List<Leaf> leaves) {
        this.leaves = leaves;
    }
}
