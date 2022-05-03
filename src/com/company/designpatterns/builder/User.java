package com.company.designpatterns.builder;

public class User {

    private String name;
    private String surname;
    private int age;
    private String educationDegree;
    private int tall;
    private String email;
    private String address;

    public User() {
    }

    public User(String name, String surname, int age, String educationDegree, int tall, String email, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.educationDegree = educationDegree;
        this.tall = tall;
        this.email = email;
        this.address = address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public int getTall() {
        return tall;
    }

    public void setTall(int tall) {
        this.tall = tall;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", educationDegree='" + educationDegree + '\'' +
                ", tall=" + tall +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder {

        private String name;
        private String surname;
        private int age;
        private String educationDegree;
        private int tall;
        private String email;
        private String address;

        public Builder() {
            this.age = 15;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder educationDegree(String educationDegree) {
            this.educationDegree = educationDegree;
            return this;
        }

        public Builder tall(int tall) {
            this.tall = tall;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }


        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this.name, this.surname, this.age, this.educationDegree, this.tall, this.email, this.address);
        }

    }

}
