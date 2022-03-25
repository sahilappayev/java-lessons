package com.company.polymorphism;

public class EnglishTeacher extends Teacher {

    private int englishLevel;

    public int getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(int englishLevel) {
        this.englishLevel = englishLevel;
    }

    @Override
    public void teach() {
        System.out.println(super.getName() + " is teaching on the course " + super.getProfession() + " lesson!");
    }

    public int increaseLevel() {
        englishLevel++;
        return englishLevel;
    }

    public int increaseLevel(int level) {
        englishLevel += level;
        return englishLevel;
    }

}
