package com.company.polymorphism;

public class Teacher {

    private String name;
    private String profession;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void teach() {
        System.out.println(this.name + " is teaching " + profession + " ...");
    }
}
