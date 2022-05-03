package com.company.designpatterns.prototype;

public class Leaf {
    private String color;

    public Leaf() {
    }

    public Leaf(String name) {
        this.color = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Leaf{" +
                "color='" + color + '\'' +
                '}';
    }
}
